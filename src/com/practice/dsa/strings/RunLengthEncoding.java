package com.practice.dsa.strings;

public class RunLengthEncoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Problem Statement- For a string input the function returns output encoded as
		 * follows:
		 * 
		 * "a" -> "a1" "aa" -> "a2" "aabbb" -> "a2b3" "aabbbaa" -> "a2b3a2"
		 * 
		 * Signature : String rle(String input) { }
		 * 
		 * Test Case: Input : aaabbbaad Output: a3b3a2d1
		 */
		
		String s="aabbb";
		String res=rle(s);
		System.out.println(res);


	}

	private static String rle(String s) {
		// TODO Auto-generated method stub
		
		StringBuilder res=new StringBuilder();
		int count=1;
		for(int i=1;i<s.length();i++) {
			
			if(s.charAt(i)==s.charAt(i-1)) {
				count++;
			}
			else
			{
				res.append(s.charAt(i-1));
				res.append(count);
				count=1;
			}
		}
		
		res.append(s.charAt(s.length()-1)).append(count);
		return res.toString();
	}

}
