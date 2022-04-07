package com.training.model;

public class BankAccount {
	private int accountNumber;
	private String aacountHolderName;
	private double balance;
	private String accountType;
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public BankAccount(int accountNumber, String aacountHolderName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.aacountHolderName = aacountHolderName;
		this.balance = balance;
	}
	
	
	
	public String getAccountType() {
		return accountType;
	}


	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


	public BankAccount(int accountNumber, String aacountHolderName, double balance, String accountType) {
		super();
		this.accountNumber = accountNumber;
		this.aacountHolderName = aacountHolderName;
		this.balance = balance;
		this.accountType = accountType;
	}


	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAacountHolderName() {
		return aacountHolderName;
	}
	public void setAacountHolderName(String aacountHolderName) {
		this.aacountHolderName = aacountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	

}
