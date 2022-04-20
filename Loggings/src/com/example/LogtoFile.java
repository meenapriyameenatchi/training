package com.example;
import java.io.IOException;
import java.util.logging.*;

public class LogtoFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger log=Logger.getLogger(LogtoFile.class.getName());
		FileHandler handler;
		
		
		try {
			handler = new FileHandler("logs.logs");
			log.addHandler(handler);
			log.info("try block called");
			throw new RuntimeException("k is great programmer");
		
		} catch (SecurityException e) {
			log.warning(e.getMessage());
		
		
		} catch (IOException e) {
		    log.warning(e.getMessage());
			
		}catch (Exception e) {
			  log.warning(e.getMessage());
		}
		

	}

}
