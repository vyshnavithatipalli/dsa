package com.practice.dsa.strings;

import java.util.*;

public class UniqueSubstringSplitter {
    public static List<String> getSubstringLengths(String s) {
        Map<Character, Integer> lastIndexMap = new HashMap<>();
        //ababcdcd
//a-2,b-3,c-6,d-7
        
        // Step 1: Record the last occurrence of each character
        for (int i = 0; i < s.length(); i++) {
            lastIndexMap.put(s.charAt(i), i);
        }

        List<Integer> result = new ArrayList<>();
        List<String> resultString = new ArrayList<>();
        int start = 0;
        int end = 0;

        // Step 2: Traverse and split
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, lastIndexMap.get(s.charAt(i)));
            if (i == end) {
            	String s1=s.substring(start,end+1);
            	if(s1.length()!=1) {
                result.add(end - start + 1);
                resultString.add(s1);
                start = i + 1;
            	}
            }
        }

        return resultString;
    }

    public static void main(String[] args) {
        String input = "ababbacaadefgegdehjikjljkl";
        List<String> lengths = getSubstringLengths(input);
        System.out.println(lengths);  // Output: [9, 8, 9]
    }
}
