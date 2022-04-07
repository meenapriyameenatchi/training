package com.training;

public class Applictaion {

	public static void main(String[] args) {
		Greeting grtobj=new Greeting();
		
		//System s = new System();
		//constructor of System class is private so we cannot able to create object
		
		System.out.println(grtobj.getMessage());
		System.out.println(Greeting.getInfo());
		
		//static method should not call in non static way 
		//System.out.println(grtobj.getInfo());
	}


}
