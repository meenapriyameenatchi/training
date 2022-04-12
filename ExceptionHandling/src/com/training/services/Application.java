package com.training.services;
import java.util.*;
import com.training.exception.RangeCheckException;
import com.training.model.Student;

public class Application {

	public static void main(String[] args) {
//		Student ram=null;
//		try {
//			ram = new Student(1010,"ramesh",-98);
//		} catch ( RangeCheckException e1) {
//			
//			e1.printStackTrace();
//		}
//		StudentService service=new StudentService(ram);
//		System.out.println(service.sendDetails());
//		
//		StudentService service2=new StudentService(ram);
//		try {
//			System.out.println("grade ="+service2.findRank());
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//		System.out.println("name is not passed");
//		}
		
		ExceptionHandling exHandling=new ExceptionHandling();
//		exHandling.usingArrayIndexException(args);
//		exHandling.usingNumberFormatexception("45");
		exHandling.usingFinallyBlock();
		System.out.println(exHandling.underStandFinallyBlock());
		
		//try with resources 
		try(Scanner scan=new Scanner(System.in)){
			System.out.println("Enter Number");
			int num=scan.nextInt();
			System.out.println(num);
			
		}catch(Exception e) {
			// catch must contain some statement
			e.printStackTrace();
			
		}
	}
	

}
