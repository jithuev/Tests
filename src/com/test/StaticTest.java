package com.test;

import java.util.ArrayList;
import java.util.List;

public class StaticTest {
	
	private static void hi() {
		System.out.println("hi from the hi method");
	}
	
	static {
		System.out.println("hi from the static block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi from the main method");
//		StaticTest.hi();
//		List<Integer> listInt = new ArrayList<>();
//		for(int i=0; i<10; i++) {
//			listInt.add(i);
//		}
//		for(int i: listInt) {
//			System.out.print(i);
//		}
//		listInt.forEach(i -> {
//			if(i == 5)
//			System.out.println(i);
//		});
	}

}
