package com.training.ifaces;
@FunctionalInterface
public interface Conditional<T> {
	public boolean test(T t);
	
 default boolean negate(Double t) {
	 return t<=80.00;
 }
 
 public static String getMessage()
 {
	 return "Static Mehtod in Interface -yes its real";
 }


}
