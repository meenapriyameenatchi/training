package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.BookDetails;
import com.example.demo.repo.BookRepository;


@Service
public class BookService {
	
	private BookRepository repo;

	@Autowired
	public BookService(BookRepository repo) {
		super();
		this.repo = repo;
		
	}
	
	public BookDetails add(BookDetails entity) {
		return repo.save(entity);
	}
	
	public List<BookDetails> findAll(){
		return repo.findAll();
	}
//	public int update(int id,double price) {
//		return repo.updateByBookId(id, price);
//	}
	public Optional<BookDetails> findById(int id) {
		return repo.findById(id);
	}

	public void remove(int id) {
		Optional<BookDetails> foundElement=repo.findById(id);
				
						
						if(foundElement.isPresent())
						{
							repo.deleteById(id);
				
						}else {
							throw new RuntimeException("Element with"+id+"Not Present");
						}
	
	}
	public void saveOrUpdate(BookDetails entity) {
		repo.save(entity);
		}
	
	public List<BookDetails> findByCategory(String category)
	{
		return repo.findByCategory(category);
	}
	
	
	public List<BookDetails> findByDiscountedPrice(double price){
		return repo.findByDiscountedPrice(price);
		
	}
	public List<BookDetails> findByBookTitle(String bookName){
		return repo.findByBookTitle(bookName);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	


	
}
