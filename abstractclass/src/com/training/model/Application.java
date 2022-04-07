package com.training.model;

public class Application {
	public static void printPremium(Insurance object) {
		
			System.out.println("Premium=" +object.calculatePerimium());
	}
	public static void main(String[] args) {
		
		VehicleInsurance car = new VehicleInsurance(1010, "ram", "car", 2019);
		printPremium(car);
		
		LifeInsurance life=new LifeInsurance(100,"ramesh",52);
		printPremium(life);
		
		String[] illness= {"bp","sugar","ent","throid"};
		HealthInsurance health =new HealthInsurance(130,"vicky",illness);
		printPremium(health);
	}

}
