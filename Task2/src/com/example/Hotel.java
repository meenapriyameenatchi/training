package com.example;

public class Hotel {
	private String hotelName;
	private int hotelMobilenumber;
	private String hotelType;
	private double hotelProfit;
	
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getHotelMobilenumber() {
		return hotelMobilenumber;
	}

	public void setHotelMobilenumber(int hotelMobilenumber) {
		this.hotelMobilenumber = hotelMobilenumber;
	}

	public String getHotelType() {
		return hotelType;
	}

	public void setHotelType(String hotelType) {
		this.hotelType = hotelType;
	}

	public double getHotelProfit() {
		return hotelProfit;
	}

	public void setHotelProfit(double hotelProfit) {
		this.hotelProfit = hotelProfit;
	}

	public Hotel(String hotelName, int hotelMobilenumber, String hotelType, double hotelProfit) {
		super();
		this.hotelName = hotelName;
		this.hotelMobilenumber = hotelMobilenumber;
		this.hotelType = hotelType;
		this.hotelProfit = hotelProfit;
	}
	
	
	
	

}
