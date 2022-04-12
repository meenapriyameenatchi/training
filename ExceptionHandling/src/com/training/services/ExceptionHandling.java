package com.training.services;

public class ExceptionHandling {

	public void usingArrayIndexException(String[] args) {
		try {
			System.out.println(args[2]);
		} catch ( ArrayIndexOutOfBoundsException e) {
		System.out.println("method requires three valuea to be passed[a,b,c]");
			e.printStackTrace();
		}
	}
	public void usingNumberFormatexception(String value) {
		int age=0;
		try {
			age=Integer.parseInt(value);
		} catch (NumberFormatException e) {
			System.out.println("no age found");
			e.printStackTrace();
			}
		
			System.out.println(age);	
			}
	public void usingFinallyBlock() {
		int denominator=0;
		try
		{
			System.out.println(4/denominator);
		}catch(ArithmeticException e) {
			System.err.println("denominator should not be zero");
		}
		finally
		{
			System.out.println("INSIDE FINALLY ===");
		}
		System.out.println("thanks,bye,bye");
	}
	
	
	
	public String underStandFinallyBlock() {
		int denominator=0;
		try
		{
			System.out.println(4/denominator);
		}catch(ArithmeticException e) {
			System.err.println("denominator should not be zero");
			//return "welcome";
			
			
			try {
				throw new Exception();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		finally
		{
			System.out.println("INSIDE FINALLY ===");
		}
		System.out.println("thanks,bye,bye");
		return "thanks";
	}
	}
	

