package com.practice.dsa.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Problem Statement – Finds the first character that does not repeat anywhere
		 * in the input string If all characters are repeated, return 0 Given “apple”,
		 * the answer is “a” Given “racecars”, the answer is “e"
		 * 
		 * Signature : char findFirst(String input){ }
		 * 
		 * Test Cases- Input: apple Output: a
		 * 
		 * Input – xxyyzz Output - 0
		 * 
		 */
		
		String s="abbccds";
		Map<Character,Integer> map=new LinkedHashMap<>();
		for(char c :s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
			
		}
		
		for(char c:s.toCharArray()) {
			if(map.get(c)==1) {
				System.out.println(c);
				break;
			}
		}
		

	}

}
