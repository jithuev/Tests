package com.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map<Student,String> testMap = new HashMap<>();
		Student stud1 = new Student();
		Student stud2 = new Student();
		
		testMap.put(stud2, "kuttookaran");
		testMap.put(stud1, "jithu");
		
		System.out.println(testMap.size());
//		System.out.println(testMap.containsKey("first name"));
		System.out.println(stud1.hashCode());
		System.out.println(stud2.hashCode());
		System.out.println(testMap.get(stud1).toString());
	}

}
