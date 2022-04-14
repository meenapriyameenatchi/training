package com.exercise;

public class Customer {
	private int customerId;
	private String customerName;
	private String mailId;
	private int mobileNumber;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}



	public Customer(int customerId, String customerName, String mailId, int mobileNumber) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.mailId = mailId;
		this.mobileNumber = mobileNumber;
	}
	
	

}