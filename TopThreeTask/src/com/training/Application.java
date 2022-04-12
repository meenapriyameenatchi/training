package com.training;

import java.util.Set;
import java.util.TreeSet;


import com.training.models.Product;

public class Application {

	public static void main(String[] args) {
		Product ram=new Product (101,"kitkat",78);
		Product shyam=new Product (102,"fivestar",68);
		Product magesh=new Product (103,"dairymilk",88);
		Product chinnamagesh=new Product(104,"maggie",98);
		 
		Set<Product> set=new TreeSet<>();
		set.add(chinnamagesh);
		set.add(magesh);
		set.add(shyam);
		set.add(ram);
	
	}

}
