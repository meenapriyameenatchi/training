package com.training.utils;
import com.training.ifaces.*;
import com.training.model.Professor;

public class ObjectFactory {

	public Conditional getConditional(int key) {
		switch(key)
		{
		case 1:
			return new Professor("phd");
		case 2:
			return new Student(89);
			default:
				return null;
		}
	
}
	public double getValue(Conditional poly,Object value) {
		boolean result=poly.test(value);
		double travelAllowance=1000;
		if(result){
			travelAllowance=2000;
		}
		return travelAllowance;
		
	}
}