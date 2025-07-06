package com.practice.dsa.strings;

public class LongestPalindromicSubstringInaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="EBBABAD";
		
		String finalvalue=longestPalindrome(str);
		System.out.println(finalvalue);

	}
	
	public static String check(String str,int low,int high,String LPS) {
		while(str.charAt(low)==str.charAt(high)) {
			
			low--;
			high++;
			
			if(low==-1 || high==str.length()) {
				break;
			}
		}
		
		String palindrome=str.substring(low+1,high);
		
		if(palindrome.length()>LPS.length())
			LPS=palindrome;
		return LPS;
	}
	
	
	public static String longestPalindrome(String str) {
		
		if(str.length()<=1) {
			return str;
		}
		String LPS="";
		
		for(int i=1;i<str.length();i++) {
			//odd length
			int low=i;
			int high=i;
			LPS=check(str,low,high,LPS);
			
			//even
			LPS=check(str,low-1,high,LPS);
			
			}
		return LPS;
		
		
	}

}
