package com.practice.general;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class UniqueTuples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Problem Statement: Given a string and size of the tuples, extracts all unique
		 * tuples(substrings) of the given size.
		 * 
		 * Signature:
		 * 
		 * HashSet<String> uniqueTuples( String input, int len ){ }
		 * 
		 * Test Cases: Input : abbccde, 2 Output : ["ab" "bb", "bc", "cc", "cd", "de"]
		 */
		String s="abbccde";
		int len=2;
		Set<String> list=uniquetuples(s,len);
		System.out.println(list);
		

	}

	private static Set<String> uniquetuples(String s,int len) {
		// TODO Auto-generated method stub
		Set<String> set=new HashSet<>();
		for(int i=0;i<=s.length()-len;i++) {
			set.add(s.substring(i,i+len));
		}
		return set;
		
	}

}
