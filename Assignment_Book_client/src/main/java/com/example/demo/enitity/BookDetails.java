package com.example.demo.enitity;




import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)


public class BookDetails {
	
	
	int bookId;
	
	
	String bookTitle;
	
	
	String authorName;
	
	
	double printedPrice;
	
	
   double discountedPrice;
   
    int publishedYear;
    
    String category;
	
    
    
    

}
