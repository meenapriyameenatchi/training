package com.training.model;
import com.training.model.BankAccount;
import com.training.model.SavingsAccount;
import com.training.services.BankAccountService;
import com.training.services.SavingAccountService;

public class Application {

	public static void main(String[] args) {
		BankAccount ramsAccount =new BankAccount(1010, "Ramesh", 50000,"savings");
			System.out.println(ramsAccount);
			 
		SavingsAccount account = new SavingsAccount(1010, "ramesh",1000, "joint", "rajesh");
		System.out.println(account.getAacountHolderName());
		System.out.println(account.getNominee());
		
		SavingAccountService service=new SavingAccountService();
		System.out.println(service.getCustomerInfo(account));
		System.out.println(service.calculateInterest(account));
		BankAccountService service2= new SavingAccountService();
		//cannot access sub clASS Method with super class refrence
		//service2.getCustomerInfo(account);sln below
		
		// casting 
		SavingAccountService savingservice2=(SavingAccountService)service2;
		
		BankAccountService sc2=new SavingAccountService();
		//sc2.   (superclass method only come here)
		System.out.println(savingservice2.getCustomerInfo(account));
				
	}

}
