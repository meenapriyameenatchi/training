package com.training.model;

public class LifeInsurance extends Insurance{
	private int age;
	
     @Override
	public double calculatePerimium() {
		double premium=1000;
		if(age<50)
		{
			premium=5000;
		}
		return premium;
	}
     
     
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public LifeInsurance(int policynumber, String policyHolderName, int age) {
		super(policynumber, policyHolderName);
		this.age = age;
		
	}
	public LifeInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LifeInsurance(int policynumber, String policyHolderName) {
		super(policynumber, policyHolderName);
		// TODO Auto-generated constructor stub
	}
	
	

	

}
