package com.head;

import com.practice.Employee;

public class EmployeeService {
	public double calculateBonus(Employee object)
	{
		double salary=object.getSalary();
		double bonus=salary*0.33;
		return bonus;
	}

}
