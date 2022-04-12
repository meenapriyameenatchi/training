package com.training.models;

import java.util.*;

import com.training.services.Doctor;



public class Appoinment {

	 private Map<Doctor,Set<Patient>> list;
	 

	public Appoinment() {
		super();
		//must or don't add this super constructor
		list=new HashMap<>();
	}

	public Appoinment(Map<Doctor, Set<Patient>> list) {
		super();
		this.list = list;
	}

	public Map<Doctor, Set<Patient>> getList() {
		return list;
	}

	public void setList(Map<Doctor, Set<Patient>> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Appoinment [list=" + list + "]";
	}

	public Set<Patient> getPatients(Doctor key){
		return this.list.get(key);
	}

}
