package com.practice.general;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueSubstringSplitter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Split the string into substrings and return their lengths. Given the string
		 * "ababbacaadefgegdehjikjljkl", split it into substrings such that no two
		 * substrings contain the same characters, with the result being [9, 8, 9].
		 * (i.e., [len("ababbacaa"), len("defgegde"), len("hjikjljkl")] ) in java
		 */	
	
	String s="ababbacaadefgegdehjikjljkl";
	List<Integer> list=getSubstringLengths(s);
	System.out.println(list);
	
}
	public static List<Integer> getSubstringLengths(String s) {
        // Step 1: Map each character to its last occurrence index
        Map<Character, Integer> lastIndexMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            lastIndexMap.put(s.charAt(i), i);
        }

        List<Integer> result = new ArrayList<>();
        int start = 0;
        int end = 0;

        // Step 2: Walk through string and split when i == end
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            end = Math.max(end, lastIndexMap.get(c));

            if (i == end) {
                result.add(end - start + 1);
                start = i + 1;
            }
        }

        return result;
    }

}
