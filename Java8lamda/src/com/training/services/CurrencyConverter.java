package com.training.services;

import com.training.ifaces.Convereter;

public class CurrencyConverter implements Convereter<Double, Double> {

	@Override
	public Double convert(Double value) {	// TODO Auto-generated method stub
		return value*100.00;
	}

}
