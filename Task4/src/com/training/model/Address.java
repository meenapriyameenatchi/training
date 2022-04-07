package com.training.model;

public class Address {
	private String streetName;
	private int doorNo;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String streetName, int doorNo) {
		super();
		this.streetName = streetName;
		this.doorNo = doorNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	@Override
	public String toString() {
		return this.streetName +this.doorNo;
	}
	
}
