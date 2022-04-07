package com.example.model;

public class SecondApplication extends Student{

	public static void main(String[] args) {
		
		Student shyam= new Student();
		
		//shyam.setFirstName("Meena");
		shyam.setMarkScored(90);
		shyam.setRollNumber(780);
		
		//its private
		//shyam.setBranch("chennai";)
		
		 System.out.println("Roll Number : ="+shyam.getRollNumber());
		  
		  System.out.println("Mark Scored : ="+shyam.getMarkScored());
		 // System.out.println("Student Name: ="+shyam.getFirstName());
		  
		

	}

}
