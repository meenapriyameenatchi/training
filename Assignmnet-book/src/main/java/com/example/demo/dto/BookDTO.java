package com.example.demo.dto;

import java.util.Set;

import org.springframework.stereotype.Component;

import com.example.demo.entity.Card;
import com.example.demo.entity.Orders;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor


@Component
public class BookDTO {
	
	
	private Card user;
	private Set<Orders>  orderss;
	

}
