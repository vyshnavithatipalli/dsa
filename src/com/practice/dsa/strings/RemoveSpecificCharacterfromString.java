package com.practice.dsa.strings;

public class RemoveSpecificCharacterfromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Heleloe";
//remove the specified character.
str.replace("e", "");
System.out.println(str.replace("e", ""));
//remove the first occurrence of the specified character.
System.out.println("String after removing First 'e' = "+str.replaceFirst("e", ""));   
//remove all occurrences of the specified character.
System.out.println("String after replacing all small letters = "+str.replaceAll("([A-Z])", "")); 
	}

}
