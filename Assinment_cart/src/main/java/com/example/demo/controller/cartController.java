package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ProductCart;
import com.example.demo.service.CartService;

@RestController
@RequestMapping(path="/api/v1/cart")
public class cartController {
	
	@Autowired
	private CartService service;
	
	
	@PostMapping
	public ProductCart add(@RequestBody ProductCart entity) {
		return service.add(entity);
	}
	@GetMapping
	public List<ProductCart> findAll(){
		return service.findAll();
	}

	@GetMapping(path="/srch/{id}")
	public List<ProductCart> findByUserId(@PathVariable("id") int id)
{
	return service.findByUserId(id);
}
}
