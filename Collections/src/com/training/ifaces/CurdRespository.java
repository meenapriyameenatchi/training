package com.training.ifaces;

import java.util.*;

import com.training.model.Book;

public interface CurdRespository {

	public  boolean add(Book book);
	public  Book  findByBookId(int id);
	public boolean remove(Book book);
	public List<Book> findAll();
	public Book update(Book oldBook,Book recentBook);
	public Book update(Book book);
}
