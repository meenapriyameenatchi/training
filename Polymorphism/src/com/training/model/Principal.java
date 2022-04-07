package com.training.model;
import com.training.ifaces.Conditional;

public class Principal implements Conditional{
	
	private  String collegeType;
	

	public Principal() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Principal(String collegeType) {
		super();
		this.collegeType = collegeType;
	}


	public String getCollegeType() {
		return collegeType;
	}


	public void setCollegeType(String collegeType) {
		this.collegeType = collegeType;
	}


	@Override
	public boolean test(Object value) {
		String strType=(String)value;
		boolean result=false;
		if(this.collegeType.equals("engg") || strType.equals("rural")) 
		{
			
			result=true;
		}
		return result;
	}
		}	
 

