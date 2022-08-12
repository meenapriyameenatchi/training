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


public class Orders {
	
	
	int orderId;
	
	
	int userId;
	
	String bookTitle;
	
	
	int quantity;
	
	
}
