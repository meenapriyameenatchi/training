package com.training.model;
import com.training.ifaces.*;
import com.training.utils.*;

public class Application {

	public static void main(String[] args) {
		ObjectFactory factory =new NewObjectFactory();
		
		Conditional prfobj=factory.getConditional(1);
		Conditional studobj=factory.getConditional(2);
		Conditional princobj=factory.getConditional(3);
		
		System.out.println("Allowance:="+factory.getValue(prfobj, "chennai"));
		System.out.println("Allowance:="+factory.getValue(studobj, "ece"));
		System.out.println("Allowance:="+factory.getValue(princobj, "engg"));

	}

}
