package com.training.model;

public class Customer {
	private int customerId;
	private String customerName;
	private double phoneNumber;
	private String email;
	public Customer(int customerId, String customerName, double phoneNumber, String email) throws InvalidEmailException{
		super();
		{
			if(email.contains("@") &&  (email.endsWith(".com") || email.contains(".org") || email.contains(".in"))){
				this.customerId = customerId;
				this.customerName = customerName;
				this.phoneNumber = phoneNumber;
				this.email = email;
				
			}else {
					throw new InvalidEmailException("mail must contains @,.com,.in,.org");
				

			
		}
	}
		
	
	}
		
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
	public double getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(double phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) throws InvalidEmailException{
		if(email.contains("@")||email.contains(".com")||email.contains(".org")||email.contains("in"))
		{
			this.email = email;
			System.out.println("valid email");
		}
		else {
			throw new InvalidEmailException("enter proper");
		}
			
		
	}
	

}
