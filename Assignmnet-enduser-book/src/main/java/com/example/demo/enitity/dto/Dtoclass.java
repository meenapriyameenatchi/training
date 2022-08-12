package com.example.demo.enitity.dto;

import java.util.Set;

import org.springframework.stereotype.Component;

import com.example.demo.enitity.Card;
import com.example.demo.enitity.Orders;
import com.example.demo.enitity.ProductCart;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


@Component
public class Dtoclass {

	private Card user;
	private Set<Orders>  orderss; 
	private Set<ProductCart> carts;
	
}
