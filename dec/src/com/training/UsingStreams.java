package com.training;
import java.util.*;
import java.util.stream.*;
import java.util.Collections;
import static java.util.stream.Collectors.*;
import com.training.services.Book;

public class UsingStreams {
	public static void useDistinct(List<Book> bookList){
	bookList.stream().distinct().forEach(System.out::println);
	}	
			
			
public static void collecToSet(List<Book> bookList) {
	Set<Book> bookSet=bookList.stream().filter(e -> e.getPrice()>500)
			.collect(toSet());
			
	bookSet.forEach(System.out::println);
	}
		

public static void collectMap(List<Book> booksList) {
				
				//print book have rs500 greater depends on
	            //bookname so no duplicate book name is allowed
Map<String, Double> values=booksList.stream()
				.filter(e -> e.getPrice()>500).distinct()
				.collect(toMap(Book::getBookName, Book::getPrice));
				      
	values.forEach((key,value) -> System.out.println(key+","+value));
			}

public static void findMaxPrice(List<Book> bookList)
{
	Optional<Book> optional=bookList.stream()
			.max(Comparator.comparing(Book::getPrice));
	if(optional.isPresent()) {
		System.out.println("Maximum price: ="+optional.get().getPrice());
	}
}
public static void findMinPrice(List<Book> bookList) {

	Optional<Book> optional=bookList.stream()
			.min(Comparator.comparing(Book::getPrice));
	if(optional.isPresent()) {
		System.out.println("Minimum price: ="+optional.get().getPrice());
	}
}


public static void usindCount(List<Book> bookList) {
	long countResult= bookList.stream()
			.filter(e -> e.getBookName().contains("v")).count();
	System.out.println("countof v = "+countResult);
}
			
			
			
public static void main(String[] args)
		{
			Book java = new Book(101,"Java","suba",950);
			Book spring = new Book(102,"Spring","Mad",650);
			Book maven = new Book(103,"maven","HArish",350);
			Book html= new Book(104,"Html","Priya",950);
			Book python = new Book(105,"Python","Sathya",450);
			Book htmlnew = new Book(103,"maven","HArish",450);
			Book htmldew= new Book(104,"Html2","priya",950);
			List<Book> bookList=Arrays.asList(java ,spring,maven,html,python,htmlnew,htmldew);
		int key=6;
			switch (key) {
			case 1:
				useDistinct(bookList);
				
				break;
			case 2:
				collecToSet(bookList);
				break;
			case 3:
				collectMap(bookList);
				break;
			case 4:
				findMaxPrice(bookList);
				break;
			case 5:
				findMinPrice(bookList);
				break;
			case 6:
				usindCount(bookList);
				break;
			default:
				break;
			}
			//must need hashcodeequals print distinct only
		//useDistinct(bookList);
		//collecToSet(bookList);
		//collectMap(bookList);
		 //findMaxPrice(bookList);
		
		
		
		
		}
		
		
		
		
			
			
		

	}


