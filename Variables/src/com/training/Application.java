package com.training;

public class Application {

	public static void main(String[] args) {
		
		BankAccount account=new BankAccount("Suresh",2000);
		System.out.println(account.getUpdatedBalance(2000));
		System.out.println(BankAccount.getCount());
		System.out.println(account.getAccountHolderName());
		

		BankAccount account2=new BankAccount("Ramesh",2000);
		System.out.println(account2.getUpdatedBalance(2000));
		System.out.println(BankAccount.getCount());
		System.out.println(account2.getAccountHolderName());
		
	}

}
