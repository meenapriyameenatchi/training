package com.training;

import com.training.model.Student;
import java.util.*;
public class HashSetApplication {

	public static void main(String[] args) {
		
		Student ram=new Student (101,"ram",78);
		Student shyam=new Student (102,"shyam",68);
		Student magesh=new Student (103,"magesh",88);
		Student chinnamagesh=new Student (103,"magesh",88);
		 
		Set<Student> set=new HashSet<>();
		set.add(chinnamagesh);
		set.add(magesh);
		set.add(shyam);
		set.add(ram);
		System.out.println(set);
		System.out.println(set.size());

	}

}
