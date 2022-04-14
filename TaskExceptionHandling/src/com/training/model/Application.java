package com.training.model;

public class Application {

	public static void main(String[] args) throws InvalidEmailException{
		Customer info=null;
		try {
			 info=new Customer(300,"ram",787989,"priya@gmail.com");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("inavlid");
			e.printStackTrace();
		}
		System.out.println(info.getEmail());
	}

}
