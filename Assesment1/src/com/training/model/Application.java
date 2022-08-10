package com.training.model;

public class Application {

	public static void main(String[] args) {
		int[] a= {1,5,2,1,2,6,7,1};
		int[] c=new int[8];
		int count=0;
		
		for(int i=0;i>8;i++) {
			if(a[i]==a[i+1]) {
				a[i+1]=0;
				count=1;
				count++;
				c[i]=count;
				}
			
			
				
			
			System.out.println("occurance and position"+a[i]+c[i]+i);
			
	}

}
	}
		
		
	

