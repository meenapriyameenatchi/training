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


public class Card {
	
	
	int userId;
	
	
	
	String userName;
	
	
	
	String password;
	
	
int bookId;
	
	

}
