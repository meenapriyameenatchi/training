package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.enitity.Card;

public interface UserRepository extends JpaRepository<Card, Integer> {

}
