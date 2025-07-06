package com.practice.dsa.strings;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			rev=rev+ch;
			
		}
		
System.out.println(rev);

//another way
String str2="imp";

str2= revstr(str2);
System.out.println(str2);

	}
	 public static String revstr(String str)
     {
          return new StringBuilder(str).reverse().toString();
     }

}
