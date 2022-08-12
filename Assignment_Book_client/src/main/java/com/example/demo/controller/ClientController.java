package com.example.demo.controller;


import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.BookDTO;
import com.example.demo.enitity.BookDetails;
import com.example.demo.enitity.Card;




@RestController
@RequestMapping("/client")
public class ClientController {
	
	@Autowired
	private RestTemplate template;
	
	@Autowired
	private BookDTO dto;
	
	@GetMapping(path="/title/{title}")
	public  BookDetails[] getTitleAsJson(@PathVariable("title") String title) {
		return this.template.getForObject("http://BOOK-SERVICE/api/v1/books/sr/"+title, BookDetails[].class);
	}
	@GetMapping(path="/books")
	public String getDooks() {
		return this.template.getForObject("http://BOOK-SERVICE/api/v1/books", String.class);
	}

	@GetMapping(path="/category/{category}")
	public  BookDetails[] getCategoryAsJson(@PathVariable("category") String category) {
		return this.template.getForObject("http://BOOK-SERVICE/api/v1/books/src/"+category, BookDetails[].class);
	}

}
