package com.example;

import com.example.model.Student;

public class Application {

	public static void main(String[] args) {
		
 // Student ram = new Student();
   // able to access because public
  //ram.rollNumber=101;
  //ram.setRollNumber(56020);
  
  //unbale to access it.its protected
  //differ package is not prblm but not subclass 
  //ram.setMarkScored(56);
  
  
  //ram.setFirstName("Meena");
 //default method unable to acess=>
  //because student class(First name) in different PACKAGE 
  
 // ram.setbranch("chennai");
  //unable to access its private
  
  
 // System.out.println("Roll Number : ="+ram.getRollNumber());
  
  //System.out.println("Mark Scored : ="+ram.getMarkScored());
  //System.out.println("Student Name: ="+ram.getFirstName());
  
 // System.out.println("Branch : ="+ram.getBranch());
  
	Student shyam = new Student(10,"shyam","mech");
	System.out.println("roll number:="+shyam.getRollNumber());
	System.out.println("student Name :"+shyam.getFirstName());
	System.out.println("mark scored :"+shyam.getMarkScored());
	
	Student makesh = new Student(988, "subramani","textile");
	
	System.out.println("roll number:="+makesh.getRollNumber());
	System.out.println("student Name :"+makesh.getFirstName());
	System.out.println("mark scored :"+makesh.getMarkScored());
	
	}
	


}
