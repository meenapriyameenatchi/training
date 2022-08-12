package com.example.demo.enitity;





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
@Table(name="end_users")

public class Card {
	
	@Id
	@Column(name="user_id")
	int userId;
	
	
	@Column(name="user_name")
	String userName;
	
	
	@Column(name="password")
	String password;
	 @Column(name="book_id")
int bookId;
	
	

}
