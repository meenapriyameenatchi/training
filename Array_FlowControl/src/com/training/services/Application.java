package com.training.services;
import com.training.model.BankAccount;

public class Application {

	public static void main(String[] args) {
		  
		BankAccountService  service = new BankAccountService();
		BankAccount ram = new BankAccount(5000,"ramesh",5000);
		
		double simpleInterest = service.calculateInterest(ram);
		System.out.println("simple interest :=" + simpleInterest);
		
	BankAccount sam = new BankAccount(6200,"rajesh",5000);
		
		double simpleInterest2 = service.calculateInterest(sam);
		System.out.println("simple interest :=" + simpleInterest2);
		
		//BankAccount[] accounts = new BankAccount[2];
		
		//accounts[0]=ram;
		//accounts[1]=sam;
		 //service.calculateInterest(accounts;)
		// below same ALTER
		 
		 BankAccount[] accounts = { ram,sam};
		 service.calculateInterest(accounts);
		 
		 //for array and eachforloop
		 System.out.println("===========");
		 double[] values = service.findInterest(accounts);
		 for(double eachValue: values)
		 {
			 System.out.println(eachValue);
		 }
		  
		 System.out.println("+======Array=======+");
		 BankAccount[] accountList = {
				 new BankAccount(800,"jay",5000,"savings"),
				 new BankAccount(801,"kam",5000,"fixed"),
				 new BankAccount(802,"tom",5000,"recurring")
				 
		 };
				 
		 
		 
		 double[] interestValues =service.findInterestByAccountType(accountList);
		 for(double eachValue:interestValues) {
			 System.out.println(eachValue);
		 }
		 
		 
		
		
	}

}
