package com.training.model;

public class MobileBill {
	private String cutomerName;
	private long mobileNumber;
	private String planName;
	private Address address;
	public static final String Brand="jio";
	
	
	
	public MobileBill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MobileBill(String cutomerName, long mobileNumber, String planName, Address address) {
		super();
		this.cutomerName = cutomerName;
		this.mobileNumber = mobileNumber;
		this.planName = planName;
		this.address = address;
	}

	public String getCutomerName() {
		return cutomerName;
	}
	public void setCutomerName(String cutomerName) {
		this.cutomerName = cutomerName;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public double findMethod() {
		double amount=0;
		String plan=getPlanName(); 
		 switch(plan)
		 {
		 case "prepaid":
			  
			 amount=200;
		 
		  case "postpaid":
			  
			 amount=300;
		}
		 return amount;
		}

}
