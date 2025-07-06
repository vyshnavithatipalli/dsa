package com.practice.general;

import java.util.HashMap;
import java.util.Map;

public class BestAverageGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Given a list of student test scores, find the best average grade. Each
		 * student may have more than one test score in the list.
		 * 
		 * Complete the bestAverageGrade function in the editor below. It has one
		 * parameter, scores, which is an array of student test scores. Each element in
		 * the array is a two-element array of the form [student name, test score] e.g.
		 * [ "Bobby", "87" ]. Test scores may be positive or negative integers.
		 * 
		 * If you end up with an average grade that is not an integer, you should use a
		 * floor function to return the largest integer less than or equal to the
		 * average. Return 0 for an empty input.
		 * 
		 * Example:
		 * 
		 * Input: [ [ "Bobby", "87" ], [ "Charles", "100" ], [ "Eric", "64" ], [
		 * "Charles", "22" ] ].
		 * 
		 * Expected output: 87 Explanation: The average scores are 87, 61, and 64 for
		 * Bobby, Charles, and Eric, respectively. 87 is the highest.
		 * 
		 * Signatue:
		 * 
		 * public static Integer bestAverageGrade(String[][] scores) { }
		 * 
		 * Test Cases:
		 * 
		 * Input : {{"Sarah", "91"}, {"Goldie", "92"}, {"Elaine", "93"}, {"Elaine",
		 * "95"}, {"Goldie", "94"}, {"Sarah", "93"}} Output: 94
		 */
		String[][] grades={{"Sarah", "91"}, {"Goldie", "92"}, {"Elaine", "93"}, {"Elaine",
			 "95"}, {"Goldie", "94"}, {"Sarah", "93"}};
		
		System.out.println(bestAverageGrade(grades));
		

	}
	public static Integer bestAverageGrade(String[][] scores) {
		Map<String,Integer> map=new HashMap<>();
		Map<String,Integer> countmap=new HashMap<>();
		
		for(String[] grade:scores) {
			
			String name=grade[0];
			String marks=grade[1];
			
			map.put(name, map.getOrDefault(name, 0)+Integer.parseInt(marks));
			countmap.put(name, countmap.getOrDefault(name, 0)+1);
			
			}
		
		System.out.println(map);
		System.out.println(countmap);
		int maxvalue=0;
		for(Map.Entry<String, Integer> x:map.entrySet()) {
			String name=x.getKey();
			int avg=map.get(name)/countmap.get(name);
			maxvalue=(int) Math.max(maxvalue, avg);
			
		}
		
		
		
		return maxvalue; 
		
	}

}
