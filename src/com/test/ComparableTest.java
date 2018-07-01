package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ComparableTest {

	public static void main(String[] args) {
		List<Student1> studentList = new LinkedList<>();
		Student1 s4 = new Student1(4 ,"stud 4");
		Student1 s1 = new Student1(1 ,"stud 1");
		Student1 s2 = new Student1(2 ,"stud 2");
		Student1 s3 = new Student1(3 ,"stud 3");
		
		studentList.add(s4);
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		
		Iterator studIterator = studentList.iterator();
		
		Collections.sort(studentList);
		studentList.forEach(e -> System.out.println("roll no : "+e.rollNo+" name :"+e.name));
	}

}

class Student1 implements Comparable<Student1> {
	int rollNo;
	String name;
	
	Student1(int roll, String n){
		this.rollNo = roll;
		this.name = n;
	}

	@Override
	public int compareTo(Student1 st) {
		if(rollNo == st.rollNo)
			return 0;
		else if (rollNo > st.rollNo)
			return 1;
		else 
			return -1;
	}
}
