package com.training;
import com.training.services.BankAccountService;
import com.training.model.BankAccount;
import java.util.*;


public class MyApplication {

	public static void main(String[] args) {
		BankAccountService service =  new BankAccountService();
		BankAccount[] list=new BankAccount[2];
		int i=0;
		int a=0;
				
		Scanner sc=new Scanner(System.in);
		do {
			
		
			System.out.println("Enter BankAccountNumber");
		    int accountNumber = sc.nextInt();
		    System.out.println("AccountHolderName");
			String accountHolderName=sc.next();
			System.out.println("Enter Balance");
		    double 	balance= sc.nextDouble();
		    System.out.println("Enter AccountType");
		    String accountType=sc.next();
BankAccount account = new BankAccount(accountNumber,accountHolderName,balance,accountType);
							
			list[i]=account;	
			i++;
			System.out.println("Enter option");
			a=sc.nextInt();
			
		}while(a==1);
		
		    double[] values= service.findInterestByAccountType(list);
		    for(double eachValue : values)
		    {
		    System.out.println(eachValue);	
		    }
sc.close();
}
}
