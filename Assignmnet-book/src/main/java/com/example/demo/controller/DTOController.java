package com.example.demo.controller;


import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.BookDTO;

import com.example.demo.entity.Card;
import com.example.demo.entity.Orders;



@RequestMapping("/api/v1/Dto")
@RestController
public class DTOController {
	
	@Autowired
	private RestTemplate template;
	
	@Autowired
	private BookDTO dto;
	
	@GetMapping(path="/orders")
	public Orders[] getDriversAsJson() {
		return this.template.getForObject("http://ORDER-SERVICE/api/v1/orders", Orders[].class);
	}

	@GetMapping(path="/srch/{id}")
	public BookDTO getOrdersById(@PathVariable("id") int id){

		Card user=this.template.getForObject("http://USER-SERVICE/api/v1/users/srch/"+id, Card.class);
	    Orders[] orders=this.template.getForObject("http://ORDER-SERVICE/api/v1/orders/srch/"+id, Orders[].class);
	   
	    
	    dto.setUser(user);
	    
	    Set<Orders> orderss= Arrays.stream(orders).collect(Collectors.toSet());
	    
	    dto.setOrderss(orderss);
	    return dto;

}
}