package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.BookDetails;



public interface BookRepository extends JpaRepository<BookDetails, Integer> {
	
//	@Query(nativeQuery=true,value="update mee_books set discounted_Price=? where book_id =:id")
//	@Modifying
//	@Transactional
//	public int updateByBookId(@Param("id") int id,@Param("price") double price);
		
	public List<BookDetails> findByBookTitle(String bookName);
	public List<BookDetails> findByCategory(String category);
	public List<BookDetails> findByDiscountedPrice(double price);
	
}
