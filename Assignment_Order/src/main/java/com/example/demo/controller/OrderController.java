package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Orders;
import com.example.demo.services.OrderService;

@RestController
@RequestMapping(path="/api/v1/orders")
public class OrderController {
	
	@Autowired
	private OrderService service;
	
	@PostMapping
	public Orders add(@RequestBody Orders entity) {
		return service.add(entity);
	}
	@GetMapping
	public List<Orders>findAll(){
		
		return this.service.findAll();
	}
	@GetMapping(path="/srch/{id}")
    public List<Orders> findByUserId(@PathVariable("id")int id){
    	return service.findByUserId(id);
    }
}
