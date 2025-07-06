package com.practice.dsa.strings;

public class PrintAllPermutationsOfString {
	public static void main(String[] args) {
		//For example, the string CAT has a total of 6 permutations i.e., [CAT, CTA, ACT, ATC, TCA, TAC]
		String s = "cat";
		  printallPermutns(s, "");
		  
	}
	static void printallPermutns(String str, String str2)
	   {
	       // check if string is empty or null
	       if (str.length() == 0) 
	         {
	           System.out.print(str2 + " ");
	           return;
	         }
	      
	       for (int i = 0; i < str.length(); i++) 
	         { 
	           // ith character of str
	    	   
	           char ch = str.charAt(i); 
	           // Rest of the string after excluding
	           // the ith character
	           String str3 = str.substring(0, i) + str.substring(i + 1);
	           // Recursive call
	           printallPermutns(str3, str2 + ch);
	        }
	   } 
}
