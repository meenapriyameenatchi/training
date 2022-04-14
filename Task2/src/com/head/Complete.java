package com.head;

import java.util.Scanner;

import com.example.Hotel;
import com.exercise.Customer;
import com.practice.Employee;

public class Complete {
	

	public static void main(String[] args) {
		
        Customer cus =new Customer(890,"pugal@gmail.com","pugal",780);
        System.out.println("Customer Name:"+cus.getCustomerName());
        System.out.println("Customer Id:"+cus.getCustomerId());
        System.out.println("Customer MobileNumber:"+cus.getMobileNumber());
        System.out.println("Customer MailId:"+cus.getMailId());
       Scanner obj=new Scanner(System.in);
       System.out.println("enter name");
       String EmployeeName=obj.next();
        obj.close();
        Employee emp=new Employee();
        
        emp.setEmployeeId(890);
        emp.setEmployeeName(EmployeeName);
        emp.setSalary(8909.8);
     emp.setMarried(true);
        
        System.out.println("Employee Name:"+emp.getEmployeeName());
       System.out.println("Employee Id:"+ emp.getEmployeeId());
        System.out.println("Employee Salary:"+emp.getSalary());
       System.out.println("Employee Status:"+emp.isMarried());

       Hotel hot =new Hotel("balahotel",70,"non veg",89.90);
      System.out.println("Hotel Name:"+hot.getHotelName());
      System.out.println("Hotel Type:"+hot.getHotelType());
       System.out.println("hotel mobno:"+hot.getHotelMobilenumber());
       System.out.println("hotel profit:"+hot.getHotelProfit());
        EmployeeService emps=new EmployeeService();
        System.out.println("THE BONUS:"+ emps.calculateBonus(bonus));
      

	}

}
