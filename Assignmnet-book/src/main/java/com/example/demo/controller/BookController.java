package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.BookDetails;
import com.example.demo.service.BookService;

@RestController
@RequestMapping("/api/v1/books")

public class BookController {
	
	@Autowired
	private BookService service;
	
	@GetMapping
	public List<BookDetails> findAll(){
		return service.findAll();
	}
	@PostMapping
	public BookDetails add(@RequestBody BookDetails entity) {
		return this.service.add(entity);
	}
    
	@GetMapping("/srch/{id}")
	public Optional<BookDetails> findById(@PathVariable("id") int id) {
		return service.findById(id);
	}
		
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") int id) {
		service.remove(id);
	}
 
// @PutMapping("/update/{id}/{price}")
//   public int update(@PathVariable("id")int id,@PathVariable("price")double price) {
//	 int rowadded=this.service.update(id, price);
//		return  row;
// }
	@PutMapping("/update")

public void updateEmployee(@RequestBody BookDetails entity) {
service.saveOrUpdate(entity);
}
	
	@GetMapping(path="/src/{category}")
	public List<BookDetails> findByCategory(@PathVariable("category") String category){
		return service.findByCategory(category);
	}
		
	@GetMapping(path="/sr/{bookTitle}")
	public List<BookDetails> findByBookTilte(@PathVariable("bookTitle") String bookTitle){
		return service.findByBookTitle(bookTitle);
	}
	
	@GetMapping(path="/find/{price}")
	public List<BookDetails> findByDiscountedPrice(@PathVariable("price")double price){
		return service.findByDiscountedPrice(price);
		
	}
	}

