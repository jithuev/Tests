package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaximumTest {
	   // determines the largest of three Comparable objects
	   
	public static void test() {
		System.out.println("hi from the static test method");
	}
	   public static <T12 extends Comparable<T12>> T12 maximum(T12 x, T12 y, T12 z) {
		   System.out.println("hi from the static method");
	      T12 max = x;   // assume x is initially the largest
	      short short1 = 32767;
	      List<Integer> intlist = new ArrayList<>();
	      Map<String, String> h1 = new HashMap<>();
	      
	      if(y.compareTo(max) > 0) {
	         max = y;   // y is the largest so far
	      }
	      
	      if(z.compareTo(max) > 0) {
	         max = z;   // z is the largest now                 
	      }
	      return max;   // returns the largest object   
	   }
	   
	   public static void main(String args[]) {
//	      System.out.printf("Max of %d, %d and %d is %d\n\n", 
//	         3, 4, 5, maximum( 3, 4, 5 ));
//
//	      System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n",
//	         6.6, 8.8, 7.7, maximum( 6.6, 8.8, 7.7 ));
//
//	      System.out.printf("Max of %s, %s and %s is %s\n","pear",
//	         "apple", "orange", maximum("pear", "apple", "orange"));
	   }
	}
