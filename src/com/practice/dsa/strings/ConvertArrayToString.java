package com.practice.dsa.strings;

import java.util.Arrays;

public class ConvertArrayToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = { "Welcome", "hello", "hi"};
        String str1 = ConvertArraytoString(strArray);
     System.out.println("An array converted to a string: " + str1);
     

	}
	 public static String ConvertArraytoString(String[] strArray) 
     {
       return Arrays.toString(strArray);
     }

}
