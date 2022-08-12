package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.ProductCart;

public interface CartRepository extends JpaRepository<ProductCart, Integer>{

	public List<ProductCart>findByUserId(int id);
}
