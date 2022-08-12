package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ProductCart;
import com.example.demo.repo.CartRepository;

@Service
public class CartService {
	
	@Autowired
	private CartRepository repo;
	
	public List<ProductCart> findAll(){
		return repo.findAll();
	}
	
    public List<ProductCart> findByUserId(int id){
    	return repo.findByUserId(id);
    }

    public ProductCart add(ProductCart entity) {
    	return repo.save(entity);
    }
}
