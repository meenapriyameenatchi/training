package com.training;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.training.models.Appoinment;
import com.training.models.Patient;
import com.training.services.Doctor;

public class Application {

	public static void main(String[] args) {
		
		Patient ram=new Patient(100,"Ram","Chennai",907865);
		Patient sam=new Patient(101,"Sam","Madurai",9088);
		
		Set<Patient> patients=new HashSet<>();
		patients.add(ram);
	      patients.add(sam);
		
	      Doctor doctor=new Doctor(890, "Nisha", "cardiologist", patients);
		//System.out.println(doctor.getDoctorName());
//		for(Patient eachPatient:doctor.getPatients()) {
//			System.out.println(eachPatient);
//		}
		
		
		Patient ram1=new Patient(200,"dinesh","Chennai",907865);
		Patient sam1=new Patient(201,"ramesh","Madurai",9088);
		Set<Patient> patients1=new HashSet<>();
		
		patients1.add(ram1);
	      patients1.add(sam1);
	     
	      Doctor doctor1=new Doctor(890, "ganga", "cardiologist", patients);
			//System.out.println(doctor1.getDoctorName());
			
			Map<Doctor,Set<Patient>> list=new HashMap<>();
			list.put(doctor, patients);
			list.put(doctor1, patients1);
			
			Appoinment app=new Appoinment(list);
			
			System.out.println(doctor.getDoctorName() +app.getPatients(doctor));
			System.out.println(doctor1.getDoctorName()+app.getPatients(doctor1));
			
			
		}

	}



