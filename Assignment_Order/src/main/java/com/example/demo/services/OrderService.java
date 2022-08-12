package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Orders;
import com.example.demo.repo.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository repo;
	
	
	

	public Orders add(Orders entity) {
		return repo.save(entity);
	}
	public List<Orders> findAll(){
		return repo.findAll();
	}
	
	public List<Orders> findByUserId(int id){
		return repo.findByUserId(id);
	}
 
}
