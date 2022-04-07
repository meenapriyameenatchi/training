package com.training.ifaces;

//class cannot extend interface but implement the interface one or more implements
// class Dummy extends Function{
//	 
// }


public class CurrencyConveretr implements Function,CheckCondition {

	@Override
	public double apply(double value) {
		
		return value*100;
	}

	@Override
	public boolean test(int value) {
	
		return value>5000;
	}

}
