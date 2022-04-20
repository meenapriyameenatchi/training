package com.training;

import java.security.cert.PKIXRevocationChecker.Option;
import java.util.Optional;

public class UsingOptional {
	
	public static Optional<String> getvalue(int key){
		Optional<String> response=Optional.empty();
		if(key==1) {
			response=Optional.of("Hiii");
		}
		return response;
		
	}
	
	public static Object getString(int key) {
		switch (key) {
		case 1:
			return new String("chocobar");
		case 2:
			return new StringBuffer("cassatta");
			

		default:
			return null;
			
		}
	}
	
	public static void main(String[] args) {
		//will throw null pointer exception
		//System.out.println(getString(3).toString());
		
		//to avoid pointer exception and return a default value
		//new features of java 8 optional id used
		Optional<Object> optional=Optional.ofNullable(getString(3));
		System.out.println(optional.orElse("vennila").toString());
		
		
		//here we are checking if value present or not
		
		Optional<Object> opt2=Optional.ofNullable(getString(3));
			if(opt2.isPresent()) {
				System.out.println("value is present : " +opt2.get());
			}
			else {
				System.out.println("value is not present");
			}
			
			
			//using lambda
			
			Optional<Object> opt3=Optional.ofNullable(getString(2));
			opt3.orElseThrow(() -> new RuntimeException("No  Object for value 3 Try again"));
			
			//call the getvalue 
			Optional<String> opt4 = getvalue(1);
			if(opt4.isPresent()) {
				System.out.println(opt4.get().toString());
			}else
			{
				System.out.println("invalid choice enter 1");
			}
			
			
			
		Optional<String> opt5 = getvalue(3);
		if(opt5.isPresent()) {
				System.out.println(opt4.get().toString());
		}
		opt5.orElseThrow(() -> new RuntimeException());
			
		}
	}

