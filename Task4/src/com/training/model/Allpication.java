package com.training.model;

public class Allpication {

	public static void main(String[] args) {
		
		Address address1= new Address("gandhinagar",9);
		
       MobileBill mobile=new MobileBill("ram",98790,"prepaid",address1);	
   
        System.out.println(mobile.getMobileNumber());		
        System.out.println(mobile.getCutomerName());
		System.out.println(mobile.getPlanName());
		
		System.out.println(" final static varaible: "+ MobileBill.Brand);
		
		
		
		System.out.println(address1);
		

		
 	     System.out.println("amount="+mobile.findMethod());
		
		
	}

}
