package com.practice.dsa.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Problem Statement- The sentence “The quick brown fox jumps over the lazy dog"
		 * contains every single letter in the alphabet. Such sentences are called
		 * pangrams. write a function findMissingLetters, which takes a String
		 * “sentence, and returns all the letters it is missing (which prevent it from
		 * being a pangram). You should ignore the case of the letters in sentence, and
		 * your return should be all lower case letters, in alphabetical order. you
		 * should also ignore all non US-ASCII characters.
		 * 
		 * Signature:
		 * 
		 * String findMissingLetters(String sentence) { }
		 * 
		 * 
		 * Test Cases: Input: The slow purple oryx meanders past the quiescent canine
		 * Output: bfgjkvz
		 */
		
		String sentence="The slow purple oryx meanders past the quiescent canine";
		
		String missing=findMissingLetters(sentence);
		System.out.println(missing);
	}

	private static String findMissingLetters(String sentence) {
		// TODO Auto-generated method stub
		Set<Character> set=new HashSet<>();
		for(char x='a';x<='z';x++) {
			set.add(x);
		}
		char[] cArr=sentence.toCharArray();
		for(char c:cArr) {
			if(set.contains(c)) {
				set.remove(c);
			}
		}
		
		List<Character> list=new ArrayList<>(set);
		Collections.sort(list);
		//System.out.println(list);
		StringBuilder sb=new StringBuilder();
		for(char i:list) {
			sb.append(i);
		}
		return sb.toString();
	}

}
