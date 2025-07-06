package com.practice.dsa.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Problem Statement: Given a list of words, group them by anagrams Input: List
		 * of "cat", "dog", "god" Output: A Set of Sets of anagrams: {{‘cat'}, {‘dog',
		 * ‘god'}}
		 * 
		 * Signature : Set<Set<String>> group(List<String> words){ }
		 * 
		 * Test Cases – Input : ["cat", "dog", "god"] Output: [[“cat”],[“dog”,”god”]]
		 */
		
		List<String> list=Arrays.asList("cat","dog","god");
		
		Set<Set<String>> result=group(list);
		System.out.println(result);

	}

	private static Set<Set<String>> group(List<String> list) {
		// TODO Auto-generated method stub
		
		Map<String,Set<String>> map=new HashMap<>();
		for(int i=0;i<list.size();i++) {
			String SortedKey=sorted(list.get(i));
			map.putIfAbsent(SortedKey, new HashSet());
			map.get(SortedKey).add(list.get(i));
			
		}
		return new HashSet<>(map.values());
	}

	private static String sorted(String s) {
		// TODO Auto-generated method stub
		
		char[] c=s.toCharArray();
		Arrays.sort(c);
		
		return new String(c);
	}

}
