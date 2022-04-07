package com.training;

public abstract class BankAccount {
	private String accountType;
	private String acccountHolderName;
	private double minimumBalance;
	private double  maximumBalance;
	
	

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BankAccount(String accountType, String acccountHolderName, double minimumBalance, double maximumBalance) {
		super();
		this.accountType = accountType;
		this.acccountHolderName = acccountHolderName;
		this.minimumBalance = minimumBalance;
		this.maximumBalance = maximumBalance;
	}

	
	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAcccountHolderName() {
		return acccountHolderName;
	}

	public void setAcccountHolderName(String acccountHolderName) {
		this.acccountHolderName = acccountHolderName;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	public double getMaximumBalance() {
		return maximumBalance;
	}

	public void setMaximumBalance(double maximumBalance) {
		this.maximumBalance = maximumBalance;
	}

	public abstract double deposit(double amount);
	public abstract double withDraw(double amount);
}
