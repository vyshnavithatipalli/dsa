package com.practice.dsa.strings;

public class LongestUniformSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Problem Statement- This method should return an integer array with two
		 * elements that correctly identifies the location of the longest uniform
		 * substring within the input string. The first element of the array should be
		 * the starting index of the longest substring and the second element should be
		 * the length.
		 * 
		 * input: “abbbccda" the longest uniform substring is “bbb” (which starts at
		 * index 1 and is 3 characters long.
		 * 
		 * Signature : int[] longestUniformSubstring(String input) { }
		 * 
		 * Test Cases – Input : aabbbbbCdAA Output – [2,5]
		 */
		
		 String s = "aaabbccccddeee";
		int currentCount=1,maxCount=1,maxStart=0,currentStart=0;
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)==s.charAt(i-1))
			{
				currentCount++;
			}
			else {
				if(currentCount>maxCount) {
					maxCount=currentCount;
					maxStart=currentStart;
				}
				currentStart=i;
				currentCount=1;
			}
		}
		if(currentCount>maxCount) {
			maxCount=currentCount;
			maxStart=currentStart;
		}
		
		System.out.println(s.substring(maxStart, maxStart + maxCount));

				
				

	}

}
