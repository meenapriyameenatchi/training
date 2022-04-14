package com.practice;

public class Employee {
	private int employeeId;
	private String employeeName;
	private boolean isMarried;
	private double salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public int getEmployeeId() {
		return employeeId;
	}

	public Employee(int employeeId, String employeeName, boolean isMarried, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.isMarried = isMarried;
		this.salary = salary;
	}



	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public boolean isMarried() {
		return isMarried;
	}

	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	

	
}
