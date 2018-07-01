package com.test;

import java.util.ArrayList;
import java.util.List;

public class StreamsTest {

	public static void main(String[] args) {
		List<Integer> dList = new ArrayList<>();
		for(int i=0; i<100; i++) {
			dList.add(i);
		}

		System.out.println(
				dList.stream()
//					.filter(e -> e %2 ==1)
					.mapToDouble(e->e)
					.sum()
				);
	}

}
