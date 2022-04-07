package com.example.demo;

import java.util.*;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name");
		String name=sc.next();
		
		System.out.println("Enter the Farenhit Temp");
		double farenTemp =sc.nextDouble();
		
		System.out.println("Enter the amount");
		double amount  =sc.nextDouble();

		System.out.println("Enter the current to covert 1-USD 2-EURO:");
		int frm   =sc.nextInt();
		
		Converter convobj= new Converter();
		System.out.println(convobj.convert(name));
		System.out.println("Celcius Temp =" + convobj.convert(farenTemp));
		System.out.println("After conversion=" + convobj.convert(amount, frm));
		
		sc.close();

	}

}
