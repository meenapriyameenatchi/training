package com.training.services;

import com.training.AgeCondition;
import com.training.ifaces.Conditional;

public class StudentResultService implements Conditional<Double>,AgeCondition<Double> {

	@Override
	public boolean test(Double t) {
		return t>80;
	}

	@Override
	//in real time we use one alone
	public boolean negate(Double value) {
		if(value < 100) {
			return true;
		}else {
			return false;
		}
		 
		//only one used
		//boolean result1=AgeCondition.super.negate(value);
		//if(result1) {
//			return true;
//		}else{
//			return false;
//		}
		
		
		// above first same
//		boolean result1=AgeCondition.super.negate(value);
//		boolean result2= Conditional.super.negate(value);
//		if(result1 && result2) {
//			return true;
//		}else{
//			return false;
//		}
	}

}
