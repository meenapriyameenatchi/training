package com.training.services;

import java.util.List;
import java.util.function.Predicate;
import java.util.ArrayList;

import com.training.ifaces.CurdRespository;
import com.training.model.Book;

public class BookService implements CurdRespository {

	private ArrayList<Book> bookList;
	
	
	
	
	public BookService() {
		super();
		this.bookList=new ArrayList<>();
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public boolean add(Book book) {
		// TODO Auto-generated method stub
		// add returns true or false boolean value
		return bookList.add(book);
	}

	@Override
	public Book findByBookId(int id) {
		Book found=null;
		for(Book eachBook:this.bookList) {
			if(id == eachBook.getBookNumber()) {
				found=eachBook;
			}
			
		}
		
		return found ;
	}

	@Override
	public boolean remove(Book book) {
		return bookList.remove(book);
	}
	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return this.bookList;
	}



	@Override
	public Book update(Book oldBook, Book newBook) {
	if(this.bookList.contains(oldBook)) {
		
		int idxPos=this.bookList.indexOf(oldBook);
		this.bookList.set(idxPos,newBook);
	}
		return newBook;
	}



	@Override
	public Book update(Book book) {
		
		return null;
	}


public List<Book> getBookGrtThan(double price){
	List<Book> grtThanList=new ArrayList<>();
	Predicate<Double> grtThan=(value)->value>300.00;
	
	
	this.bookList.forEach(book -> 
	{
		double bookPrice=book.getPrice();
	if(grtThan.test(bookPrice))
	{
		grtThanList.add(book);
	
		
	
	}


});
	return grtThanList;
}
}
