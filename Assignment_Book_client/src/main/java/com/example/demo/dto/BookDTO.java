package com.example.demo.dto;

import java.util.Set;

import org.springframework.stereotype.Component;

import com.example.demo.enitity.BookDetails;
import com.example.demo.enitity.Card;
import com.example.demo.enitity.Orders;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor


@Component
public class BookDTO {
	
	private BookDetails book;
	private Card user;
	private Set<Orders>  orderss;
	

}
