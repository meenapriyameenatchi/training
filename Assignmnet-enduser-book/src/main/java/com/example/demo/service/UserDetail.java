package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.enitity.Card;
import com.example.demo.repo.UserRepository;

@Service
public class UserDetail {
	private UserRepository repo;
	
	@Autowired
	public UserDetail(UserRepository repo) {
		super();
		this.repo = repo;
	}

	public List<Card> findAll(){
		return repo.findAll();
		
	}
	
    public Optional<Card> findByUserId(int id) {
    	return repo.findById(id);
    }

	public Card save(Card entity) {
		return repo.save(entity);
	}
}
