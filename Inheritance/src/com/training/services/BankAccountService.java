package com.training.services;
import com.training.model.BankAccount;

public class BankAccountService {
	public double calculateInterest(BankAccount account)
	{
		double simpleInterest =0.05;
	if(account.getAccountNumber()<=5000)	
	{
		simpleInterest =0.06;
	}
	return account.getBalance()*1*simpleInterest;
	}
	
	//overloaded method
	public void calculateInterest(BankAccount[] accounts)
	{
		for(BankAccount eachAccount : accounts) {
			System.out.println(calculateInterest(eachAccount));
		}
		
	}
	  
	public double[] findInterest(BankAccount[] accounts)
	{
		double[]  values= new double[3];
		int i=0;
				  for(BankAccount eachAccount : accounts) 
				  {
					  values[i]=calculateInterest(eachAccount);
					  i++;
				  }
		  return values;
				  
	}
	
	private double calculateByAccountType(BankAccount account, double rateOfInterest) {
//		
//		String type=account.getAccountType();
//		double rateOfInterest=0.07;
//		if(type.equals("savings"))
//		{
//			rateOfInterest=0.05;
//		}
//		if(type.equals("fixed")|| type.equals("recurring"))
//		{
//			rateOfInterest=0.05;
//		}
		return account.getBalance()*1*rateOfInterest;
	}
	
	
	public  double[] findInterestByAccountType(BankAccount[] accounts) {
		// using hte new features of java  7 switch case with string
		int i=0;
		double[]  values= new double[5];
		for(BankAccount eachAccount : accounts) {
			
				
			
		String key= eachAccount.getAccountType();
	switch (key) 
	{
	
	case "savings":
		values[i]=calculateByAccountType(eachAccount,0.05);
		
		break;
    case "fixed":
	values[i]=calculateByAccountType(eachAccount,0.07);
		
		break;
    case "recuring":
	values[i]=calculateByAccountType(eachAccount,0.07);
	
	break;

	default:
		break;
	}
	i++;
	}
	return values;
		}
}





