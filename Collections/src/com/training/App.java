 package com.training;
import java.util.*;

import com.training.ifaces.CurdRespository;
import com.training.model.Book;
import com.training.services.BookService;
import com.training.utils.BookNamecomparator;

public class App {
	
	public static void print(List<Book> args) {

		
		 for(Book eachBook:args) {
	 System.out.println(eachBook);
		 }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> names=new ArrayList<>();
     names.add("Ramesh");
      names.add("Anand");
       names.add("Chandru");
      names.add("Zahir");
    names.add("Pavan");
    System.out.println(names);
      Collections.sort(names);
      System.out.println(names);
      

		 Book java =new Book(101,"java","suba",450);
		 Book spring =new Book(102,"spring","mad",550);
		 Book  maven =new Book(103,"maven ","Harish",650);
		 Book html =new Book(104,"Html","priya",1450);
		 Book python=new Book(105,"python","sathya",850);
		 
		 
		 CurdRespository service=new BookService();
		 
		  System.out.println("Is Added:=" +service.add(java));
		 System.out.println( service.add(spring));;
		  System.out.println(service.add(maven));
		  System.out.println(service.add(html));;
		 System.out.println( service.add(python));
		 List<Book> bookList= service.findAll();
		 
	Collections.sort(bookList);
	System.out.println("sort by book number");
	System.out.println(bookList);
	
	print(bookList);
	Collections.sort(bookList, new BookNamecomparator());
	System.out.println("sort by book name");
	print(bookList);

	
	}
	

}
