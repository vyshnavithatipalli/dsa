package com.practice.general;

import java.util.Arrays;
import java.util.Comparator;

public class CheckIfaPersonCanAttendAllmeetings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. Meeting Room I — Can Attend All Meetings Scenario: You’re given a list of
		 * meeting time intervals [[start1, end1], [start2, end2], ...]. Determine if a
		 * person can attend all meetings (i.e., no overlaps).
		 * 
		 * Example Input: [[0, 30], [5, 10], [15, 20]] Output: False (overlap between
		 * [0,30] and [5,10])
		 * 
		 */
		
		int[][] input= {{0, 30}, {5, 10}, {15, 20}};
		boolean res=check(input);
		System.out.println(res);
		
	}

	private static boolean check(int[][] input) {
		// TODO Auto-generated method stub
		
		Arrays.sort(input,Comparator.comparingInt(x->x[1]));
		for(int i=0;i<input.length-1;i++) {
			
			if(input[i][1]>input[i+1][0])
				return false;
		}
		return true;
	}

}
