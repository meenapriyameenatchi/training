package com.training.services;
import com.training.model.*;

public class StudentService {
	
	private Student student;

	public StudentService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentService(Student student) {
		super();
		this.student = student;
	}
	
	//applying the handling rule of exception 
	public String sendDetails() {
		
		String name=null;
		
		try {
		name=this.student.getFirstName();
	} catch(NullPointerException  e) {
		System.out.println("student Object Is not passed chech Again");
		
	}
	
	return name;
	}	
public String findRank() throws Exception {
	String grade="A";
	if(this.student.getMarkScored()>90) {
		grade="o";
	}
	return grade;
}
}
