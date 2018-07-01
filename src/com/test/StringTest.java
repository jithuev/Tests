package com.test;

public class StringTest {

	public static void main(String[] args) {
		String test = "jithuvargheseeluvathingalkuttookaran";
		String test1 = "itgsdgsdgsd";
		if(test.contains(test1))
			System.out.println("contains");
		else
		{
			for(int i=0; i<test1.length(); i++) {
				if(test.contains(test1.substring(0, i))) {
//					if(test1.substring(0, i).)
					System.out.println(test1.substring(0, i)+" >> "+i);
				}
			}
		}
	}

}
