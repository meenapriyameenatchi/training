package com.training;

public class ToyotaCar implements AutoMobile {

	@Override
	public String getColor() {
		
		return "blue";
	}

	@Override
	public double getPrice() {
		
		return 90000;
	}

	@Override
	public String getModel() {
		
		return "Toyotonew";
	}

}
