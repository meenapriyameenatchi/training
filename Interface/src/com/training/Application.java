package com.training;
import com.training.ifaces.*;

public class Application {

	public static void main(String[] args) {
		//subtype =new subtype
		//CurrencyConveretr conv=new CurrencyConveretr();
		 
		//supertype=new subtype
		Function conv=new CurrencyConveretr();
		
		
		//line 9,10,11 are identical
		double response=conv.apply(100);
		System.out.println(response);
		System.out.println(conv.apply(300));
		System.out.println(Function.COUNTER);
		
		
		//casting funtion to checkcondition
		if(conv instanceof CheckCondition) {
			
		CheckCondition obj=(CheckCondition)conv;
		System.out.println("Is Discount Allowed=:" +obj.test(300));
		
	
		}
		
		Conditional condobj=new DiscountCalculater();
		System.out.println(condobj.test(900));
		System.out.println(condobj.negate(400));

	}

	
}
