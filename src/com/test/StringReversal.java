package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringReversal {

	static String recursiveMethod(String str) throws InterruptedException
	{
	     if ((null == str) || (str.length() <= 1))
	     {
	            return str;
	     }
	     Thread.sleep(1000);
	     return recursiveMethod(str.substring(1)) + str.charAt(0);
	}
	
	public static String reverseString(String str) {
//		char[] charArray = new char[str.length()];

		char[] charArray  = str.toCharArray();
		
//		char temp;
        
//        for (int i = 0; i < charArray.length/2; i++) 
//        {
//            temp = charArray[i];
//             
//            charArray[i] = charArray[charArray.length-1-i];
//             
//            charArray[charArray.length-1-i] = temp;
//        }
         
        for (int i = charArray.length - 1; i >= 0; i--)
        {
            System.out.println(charArray[i]);     //Output : avaJyM
        }
		
//		System.out.println(stringBuilder.toString());
		return Arrays.toString(charArray);
	}
	public static void main(String[] args) throws InterruptedException {
		String str = "hello world";
//		System.out.println(str.substring(2));
//		StringReversal.recursiveMethod(str);
		System.out.println(StringReversal.recursiveMethod(str));
	}

}
