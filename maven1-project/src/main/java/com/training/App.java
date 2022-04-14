package com.training;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Book book=new Book("novel",90);
    	System.out.println("Book Name:= " +book.getBookName());
    	System.out.println("Book Number:= "+book.getBookNumber());
        System.out.println( "Hello World!" );
    }
}
