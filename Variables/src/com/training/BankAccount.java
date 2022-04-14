package com.training;

public class BankAccount {
	
	//static variable
	private static int count;
	
	//instance variable
	private String accountHolderName;
	private double balance;
	private int accountNumber;
	
	
	
	
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	public BankAccount(String accountHolderName, double balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountNumber = getCount();
	}






	public static int getCount() {
		return ++count;
	}
	public static void setCount(int count) {
		BankAccount.count = count;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int  getAccountNumber() {
		return accountNumber;
	}






	public double  getUpdatedBalance(double i) {
		this.balance=this.balance+i;
		return balance ;
	}
	
	
}


	

