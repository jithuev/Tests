package com.test;

public class StairCase {

	public static void main(String[] args) {
		for(int i=0; i<4; i++) {
			for(int j=0; j<10; j++) 
				System.out.print(i<10-j ? " ":"#");
			for(int k=0; k<10; k++)
				System.out.print(i<10-k ?"":"#");
			System.out.println("");
		}

	}

}
