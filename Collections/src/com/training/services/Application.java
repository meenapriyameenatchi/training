package com.training.services;

import java.util.*;

import com.training.ifaces.CurdRespository;
import com.training.model.Book;

public class Application {
	public static void print(List<Book> args) {

		
		 for(Book eachBook:args) {
	 System.out.println(eachBook);
	 } 
		 // done same what happend in above for loop
		//books.forEach(System.out::println);
}

	public static void main(String[] args) {
		
		
		 Book java =new Book(101,"java","suba",450);
		 Book spring =new Book(102,"spring","mad",550);
		 Book  maven =new Book(103,"maven ","Harish",650);
		 Book html =new Book(104,"Html","priya",1450);
		 Book python=new Book(105,"python","sathya",850);
		 
		 
		 
		 
		 CurdRespository service=new BookService();
		 
		 System.out.println("graeter than 400");
	List<Book> bookList=((BookService)service).getBookGrtThan(400);
	bookList.forEach(System.out::println);
		 
		 
		 System.out.println("Is Added:=" +service.add(java));
		 System.out.println( service.add(spring));;
		  System.out.println(service.add(maven));
		  System.out.println(service.add(html));;
		 System.out.println( service.add(python));
		System.out.println("===="); 
		
		 List<Book> bookList1=service.findAll();
		 for(Book eachBook:bookList1) {
			 System.out.println(eachBook);
		 }
		 System.out.println("=======");
		 
			Book  foundBook = service.findByBookId(101);
			System.out.println("Found book :=" +foundBook);
			System.out.println("=======");
			
			
			service.remove(python);
		 List<Book> secondList=service.findAll();
			 for(Book eachbook:secondList) {
				 
			 
				 System.out.println(eachbook);
				 
				 
				 
			 }
			 System.out.println("=======");
			
			 System.out.println("size" +secondList.size());
			 
			 System.out.println("=======");
			 print(service.findAll());
			 
			 Book react =new Book(205,"ReactJS","Rahul",6850);
			service.update(react);
			 
			 print(service.findAll());
		
			 Book reactNew =new Book(205,"ReactJS","Rahul",7850);
			 service.update(react, reactNew	);
			 System.out.println("{=========AFTER UPDATE=====");
			 print(service.findAll());
		 }
	}


