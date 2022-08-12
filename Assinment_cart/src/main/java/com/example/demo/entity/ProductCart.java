package com.example.demo.entity;

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
@Table(name="meena_cart")
public class ProductCart {
	@Id
	@Column(name="cart_id")
	int cartId;
	
	@Column(name="user_id")
	int userId;
	
	@Column(name="book_title")
	String bookTitle;
	
	
	

}
