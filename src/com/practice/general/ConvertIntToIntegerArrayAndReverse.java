package com.practice.general;

import java.util.Arrays;

public class ConvertIntToIntegerArrayAndReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * In Java 8, how can you convert an Integer to an int array and then reverse
		 * the array? Can you provide a code snippet to demonstrate this?
		 */
		
		  int number = 12345;
	        int[] reversedArray = convertAndReverse(number);

	        System.out.println(Arrays.toString(reversedArray));
		
	}
	 public static int[] convertAndReverse(int number) {
	        return new StringBuilder(String.valueOf(number))
	        		.reverse()
	        		.chars()
	        		.map(c->c-'0')
	        		.toArray();
	    }

}
