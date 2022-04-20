package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Application {

	public static void main(String[] args) {
		 Student ram=new Student(101, "Ram",LocalDate.of(1972,10, 12),LocalDateTime.of(2000, Month.JUNE,5,9,30));
Student sam= new Student(102, "Sam", LocalDate.now(), LocalDateTime.now());


System.out.println("Rams year of birth : " +ram.getDateOfBirth().getYear());
System.out.println("Rams first birthday:"+ ram.getDateOfBirth().plus(1,ChronoUnit.YEARS));

System.out.println("Sams year of birth:"+ sam.getDateOfBirth().getYear());
System.out.println("Sams sixtyth birthday :"+sam.getDateOfBirth().plus(1,ChronoUnit.MONTHS));
System.out.println("Sams sixtyth birthday :"+sam.getDateOfBirth().plus(60,ChronoUnit.YEARS));
System.out.println("sams previous birthday:"+sam.getDateOfBirth().minus(1,ChronoUnit.YEARS));
	}

}
