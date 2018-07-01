package com.test;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>();
		hashSet.add("jithu");
		hashSet.add(new String("jithu"));
		System.out.println(hashSet.size());
	}

}
