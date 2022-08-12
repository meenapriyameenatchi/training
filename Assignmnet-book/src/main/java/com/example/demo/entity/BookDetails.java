package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "mee_books")
public class BookDetails {
	
	@Id
	@Column(name="book_id")
	int bookId;
	
	@Column(name="book_title")
	String bookTitle;
	
	@Column(name = "author_name")
	String authorName;
	
	@Column(name="printed_price")
	double printedPrice;
	
	@Column(name="discounted_price")
   double discountedPrice;
   
	@Column(name="published_year")
    int publishedYear;
    
	@Column(name="category")
    String category;
	
    
    
    

}
