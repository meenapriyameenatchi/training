package com.training.model;
import com.training.*;
public class Application {

	public static void main(String[] args) {
		ObjectFactory factory=new ObjectFactory();
		AutoMobile marutobj=factory.getObject(1);
		AutoMobile toyotaobj=factory.getObject(2);
		
		factory.printQuote(marutobj);
		factory.printQuote(toyotaobj);
		
	}

}
