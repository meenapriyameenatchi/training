package com.training.services;
public class StringService {
	
	public void stringEquals(String str1,String str2) {
		
		System.out.println("Is VAlue same := "+str1.equals(str2));
		System.out.println("location same:= "+(str1==str2));
	}
	
	
	public void stringObjectEquals() {
		String ram=new String("Ram");
		String ramudu=new String("Ram");
		
		System.out.println("Is VAlue same := "+ ram.equals(ramudu));
		System.out.println("location same:= "+(ram==ramudu));
	}
	public String usingTrim(String name) {
		System.out.println("without TRIM:= "+name);
		System.out.println("Left Trim : ="+name.trim());
		return name.trim();
	}
	
	public void lengthOfString(String name) {
		 //getting trim frm before method
		// String resp=usingTrim(name);
		 
		 //directly calling trim frm above method
		 System.out.println("String Length" +name.trim().length());
	 }
 
	 public void usingSubString(String name) {
	 System.out.println(name.substring(3));
	 System.out.println(name.substring(0,3));
	 
	 }
 
 public void usingCharAtAndIndexOf(String name) {
	 System.out.println("Index position of @:= "+ name.indexOf("@"));
	 System.out.println( "Character At position 3:= "+name.charAt(3));
 }

 public void usingReplace(String str1,String str2) {
	 System.out.println(str1.replace(".com", ".org"));
	 System.out.println(str2.replace('C', 'm'));
 }
 public void usingConcat(String str1,String str2) {
	 //string is immutable
	 System.out.println(str1.concat(str2));
	
	 //string builder is mutable can change
	 StringBuilder builder=new StringBuilder(str1);
	 builder.append(str2);
	 System.out.println(builder.toString());
 }
 public void usingCompareTo(String str1,String str2) {
	 System.out.println(str1.compareTo(str2));
 }
 public void suingStringFormat(String str1, double mark) {
	 String frnString=String.format("Name %S",str1);
	 System.out.println(frnString);
	 System.out.println(String.format("Mark %.2f",mark));
			 
 }
 public void susingStringFormat(int mark) {
	 System.out.println(String.format("octal %o" ,mark));
	 System.out.println(String.format("Hexadecimal %x" ,mark));
	 
 }
 public void susingStringFormat(int mark1,int mark2) {
	 System.out.println(String.format("octal %1$o,Hexa %2$x",mark1,mark2));
	 
 }
 public void susingStringFormat(String str1,String str2) {
	 System.out.println(String.format("%1$s,%2$S", str1,str2));
 }
 public void susingStringFormat(long value1) {
	 System.out.println(String.format("%+d", value1));
 }
 
}
