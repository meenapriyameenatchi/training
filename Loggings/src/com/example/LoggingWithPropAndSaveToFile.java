package com.example;

import java.io.IOException;
import java.util.logging.FileHandler;

import com.example.model.Book;

public class LoggingWithPropAndSaveToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String file=LoggingWithPropFile.class.getClassLoader().getResource("logging.properties").getFile();
	     
		System.out.println(file);
	System.setProperty("java.util.logging.config.file", file);
	FileHandler handler;
	try {
		handler = new FileHandler("logs2.log");
		Book.log.addHandler(handler);
	} catch (SecurityException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
                Book.log.info("LOgging properties done right");
                   Book java=new Book();
//        System.out.println(java);

 Book.log.info(java.toString());

	}

}
