package com.practice.dsa.strings;

import java.util.Arrays;

public class CheckAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//If two strings contain the same characters but in a different order, they can be said to be anagrams.
		String str1="ab";
		String str2="ba";
		str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char[] str1charArray = str1.toCharArray();
        char[] str2charArray = str2.toCharArray();
        
        Arrays.sort(str1charArray);
        Arrays.sort(str2charArray);
        boolean result = Arrays.equals(str1charArray, str2charArray);
        if(result) 
        {
           System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
         }
        else {
           System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
         }
	}

}
