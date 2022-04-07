package com.training.model;

public class HealthInsurance extends Insurance {
	private String[] preExistingDisease;
	


	public HealthInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}

     public HealthInsurance(int policynumber, String policyHolderName, String[] preExistingDisease) {
		super(policynumber, policyHolderName);
		this.preExistingDisease = preExistingDisease;
	}



	public String[] getPreExistingDisease() {
		return preExistingDisease;
	}



	public void setPreExistingDisease(String[] preExistingDisease) {
		this.preExistingDisease = preExistingDisease;
	}

//override both are same bcoz.  for to get string as correct case

	@Override
	public double calculatePerimium() {
	
		double premium=10000;
		for(String eachItem:preExistingDisease) {
			String item=eachItem.toLowerCase();			
			if(eachItem.equals("bp")||eachItem.equals("sugar")) {
				premium=15000;
			}
		}
						return premium;
	}

//	@Override
//	public double calculatePerimium() {
//	
//		double premium=10000;
//		for(String eachItem:preExistingDisease) {
//		
//			if(eachItem.equalsIgnoreCase("bp")||eachItem.equalsIgnoreCase("sugar")) {
//				premium=15000;
//			}
//		}
//				
//		return premium;
//	}

}
