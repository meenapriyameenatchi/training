package com.training;

import com.training.ifaces.Convereter;
import com.training.services.CurrencyConverter;

public class Application {
	
	public static void print(Convereter<Double,Double> conv) {
		System.out.println(conv.convert(100.00));
		
	}

	public static void main(String[] args) {
		
	
	 
		//manual
		Convereter<Double,Double> obj=new CurrencyConverter();
	  System.out.println(obj.convert(20.0));
	 
	  
	  //lambda 
	  Convereter<Double,Double> lambda=(val)->val*200.0;
     print(lambda);
     
     Convereter<String,Integer> strLength=(str)->str.length();
     System.out.println(strLength.convert("Chennai"));
	} 

}
