package com.example;
import java.util.logging.*;

public class Application {

	public static void main(String[] args) {
	
//here date ,time ,fullyqualified name,given message displayed
		Logger log=Logger.getLogger("com.example.Application");
		
		log.setLevel(Level.ALL);
		log.info("Info meassge");
		 
		//syso is same as log here replacing syso =with log.info
		//just display the given message
		//System.out.println("info meassge");
		
		log.warning("WARNING MESSAGE ******************");
		log.severe("SEVERE MESSAGE %%%%%%%%%%%%%%%");
		log.fine("I AM FINE Message##############");
		

	}

}
