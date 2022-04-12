package com.training;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.training.model.Student;

public class HashMapApp2 {

	public static void main(String[] args) {

		Student ram=new Student (101,"ram",78);
		Student shyam=new Student (102,"busky",68);
		Student mukesh=new Student(103,"mukesh",78);
		
		HashMap<Integer,Student> map=new HashMap<>();
		map.put(900, ram);
		map.put(902, shyam);
		map.put(903, mukesh);
		
		//for getting values with help of key (for some numbers) not for more entries
		System.out.println(map.get(900));
		System.out.println(map.get(902));
		System.out.println(map.get(904));
		
		//for more keys 500times like   to print key values
		Set<Integer> keys=map.keySet();
		System.out.println(keys);
		for(Integer key: keys) {
			System.out.println(map.get(key));
		}
 
		//getting values alone without using key
		Collection<Student> list=map.values();
		for(Student eachStudent:list) {
			System.out.println(eachStudent);
			
		}
		//getting both key and value for ntimes
		System.out.println("both key and value");
		Set<Map.Entry<Integer,Student>> list2=map.entrySet();
		for(Map.Entry<Integer, Student> eachEntry:list2) {
			System.out.println(eachEntry.getKey());
			System.out.println(eachEntry.getValue());
		}
		
		
	}

}
