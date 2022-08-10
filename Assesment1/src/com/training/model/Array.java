package com.training.model;
import java.util.*;


public class Array {

	public static void main(String[] args) {
	    ArrayList<String> fruits = new ArrayList<>();
	    fruits.add("apple");
	    fruits.add("orange");
	    fruits.add("apple");
	    fruits.add("pineapple");
	    fruits.add("orange");
	    fruits.add("banana");
	    
	    Collections.sort(fruits);
	    //System.out.println(fruits);
	    
	    Set<String> tree=new TreeSet<>();
	    tree.addAll(fruits);
	    System.out.println(tree);

	}

}
