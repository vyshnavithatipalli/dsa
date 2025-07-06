package com.practice.dsa.strings;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Problem Statement : Takes String str and returns a new String such that the
		 * characters are in reversed order. Example: reverseStr(str) where str is “abcd
		 * " returns “dcba".
		 * 
		 * Signature: public static String reverseStr( String str ){
		 */
		
		String s="@ab&c%$de";
		String res=reverse(s);
		System.out.println(res);

	}

	private static String reverse(String s) {
		// TODO Auto-generated method stub
		
		int low=0,high=s.length()-1;
		char[] c=s.toCharArray();
		while(low<high) {
			if(!Character.isAlphabetic(c[low]))
				low++;
			if(!Character.isAlphabetic(c[high]))
                high--;
			char temp=c[low];
			c[low]=c[high];
			c[high]=temp;
			low++;
			high--;
			
		}
		return new String(c);
	}

}
