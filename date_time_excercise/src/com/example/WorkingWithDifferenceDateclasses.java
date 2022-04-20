package com.example;

import java.util.*;
import java.sql.*;
import java.sql.Date;
import java.time.*;

public class WorkingWithDifferenceDateclasses {
	
	public static void main(String[] args)
	{
		//step 1 craeting UTIL Date
		java.util.Date date1=new java.util.Date();
		//java.sql.Date date2=new java.sql.Date(566778);
		
		
		System.out.println(date1);
		System.out.println(date1.getTime());
		
		//to overcome above milliseconds.step2_ UTIL Date to SQL Date
		java.sql.Date date2=new java.sql.Date(date1.getTime());
		System.out.println(date2);
		
		//Step3 SQL Date to LOCALDATE
		LocalDate localDate=date2.toLocalDate();
		System.out.println(localDate.getDayOfWeek());
		System.out.println(localDate.getMonthValue());
		
		java.sql.Date sqlDate2= java.sql.Date.valueOf(localDate);
		System.out.println("SQL DATE "+ sqlDate2 );
		
	}
	
	
}
