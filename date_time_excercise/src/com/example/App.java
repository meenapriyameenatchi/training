package com.example;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String dateOfBirth="1999-08-10";
        Student vicky=new Student();
       
        vicky.setRollNumber(200);
       vicky.setStudentName("Vignesh");
       vicky.setDateOfBirth(LocalDate.parse(dateOfBirth));
       vicky.setDateOfJoining(LocalDateTime.now());
       
       System.out.println(vicky.getDateOfBirth().getYear());
       System.out.println(vicky.getDateOfBirth().getMonth());
       System.out.println(vicky.getDateOfBirth().getDayOfMonth());
       
       
       LocalTime startTime=LocalTime.of(9, 30);
       LocalTime endTime=startTime.plusHours(8);
       System.out.println("startTime: "+startTime);
       System.out.println("end Time:"+endTime);

       
	}

}
