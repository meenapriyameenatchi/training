package com.example.demo.controller;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.enitity.Card;
import com.example.demo.enitity.dto.Dtoclass;
import com.example.demo.enitity.Orders;
import com.example.demo.enitity.ProductCart;
import com.example.demo.service.UserDetail;

@RequestMapping(path="/api/v1/users")
@RestController
public class UserController {
	
	@Autowired
	private UserDetail service;
	
	@Autowired
	private Dtoclass dto;

	@Autowired
	private RestTemplate template;
	
	@GetMapping
	public List<Card> findAll(){
		return service.findAll();
	}
	
	@PostMapping
	public Card save(@RequestBody Card entity) {
		return service.save(entity);
	}
	@GetMapping(path="/srch/{id}")
	public Optional<Card> findByUserId(@PathVariable int id) {
		return service.findByUserId(id);
	}
	@GetMapping(path="/srch/withorder/{id}")
	public Dtoclass getOrdersById(@PathVariable("id") int id){

		Card user=this.template.getForObject("http://USER-SERVICE/api/v1/users/srch/"+id, Card.class);
	    Orders[] orders=this.template.getForObject("http://ORDER-SERVICE/api/v1/orders/srch/"+id, Orders[].class);
	   
	    
	    dto.setUser(user);
	    
	    Set<Orders> orderss= Arrays.stream(orders).collect(Collectors.toSet());
	    
	    dto.setOrderss(orderss);
	    return dto;

}
	
	@GetMapping(path="/srch/withcart/{id}")
	public Dtoclass getCartById(@PathVariable("id") int id){

		Card user=this.template.getForObject("http://USER-SERVICE/api/v1/users/srch/"+id, Card.class);
	    ProductCart[] carts=this.template.getForObject("http://CARD-SERVICE/api/v1/cart/srch/"+id, ProductCart[].class);
	   
	    
	    dto.setUser(user);
	    
	    Set<ProductCart> cartss= Arrays.stream(carts).collect(Collectors.toSet());
	    
	    dto.setCarts(cartss);
	    return dto;

}
	
	
	
	
	
	
	
	
	

//	private PasswordEncoder password;
}
