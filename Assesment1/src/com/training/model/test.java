package com.training.model;

public class test {

	public static void main(String[] args) {
		int[] arr = new int[] {1,5,2,1,2,6,7,1};
		
		
		int h=arr.length;
		
		int[] posx = new int[h];
	     int [] occur = new int [h];
	
	     for(int i =0;i<h;i++) {
	    	 int count = 1;
	    	 
	    	 for(int j = i+1;j<h;j++)
	    	 {
	    		 if(arr[i] == arr[j]) {
	    			 
	    			
	    			 count++;
	    			 occur[j] = -1;
	    		 }
	    		
	    		 
	    		 
	    	 }
	    	
	    	
	    	 System.out.println("number "+ arr[i]+" position :"+i );
	    	 if(occur[i] != -1) {
	    		 occur[i] = count;
	    	 }
	      }
	     for(int i =0;i<occur.length;i++)
	     {
	    	 if(occur[i] != -1)
	    	 {
	    		 System.out.println("   Numbers: "+arr[i]+ " occurence "+occur[i]);
	    		// System.out.println("position"+c[i]);
	    		
	    		
	    	 }
	    	
	     
		}
	     

	
		}
}

	



