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
@Table(name = "mee_order")
public class Orders {
	
	@Id
	@Column(name="order_id")
	int orderId;
	
	@Column(name="user_id")
	int userId;
	
	@Column(name = "book_title")
	String bookTitle;
	
	@Column(name="quantity")
	int quantity;
	
	
}
