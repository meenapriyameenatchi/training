package com.training.model;

public class SavingsAccount extends BankAccount {

	private String nominee;
	
	
	//whenever sub class constructor is called its super class
	//constructor also called even if super keyword is not present
	//public SavingsAccount(){
		//super();
		//System.out.println("constructor of SUB CLASS Called");
//}
	
	
	
	//public SavingsAccount(){
		//super(1020,"ram",5000);
		//System.out.println("constructor of SUB CLASS Called");
		
	//}
	
	
	public String getNominee() {
		return nominee;
	}


	public void setNominee(String nominee) {
		this.nominee = nominee;
	}


	public SavingsAccount(int accountNumber, String aacountHolderName, double balance, String accountType,
			String nominee) {
		super(accountNumber, aacountHolderName, balance, accountType);
		this.nominee = nominee;
	}
	
	
}
