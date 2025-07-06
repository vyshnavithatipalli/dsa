package com.practice.general;

import java.util.Arrays;
import java.util.Comparator;

public class FindMinimumNumberofMeetingRooms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2. Meeting Room II — Minimum Number of Meeting Rooms Scenario: Given an array
		 * of meeting intervals, return the minimum number of conference rooms required.
		 * 
		 * Example Input: [[0, 30], [5, 10], [15, 20]] Output: 2
		 */
		int[][] input= {{0, 30}, {5, 10}, {15, 20}};
		int x=findmin(input);
		System.out.println(x);
	}

	private static int findmin(int[][] input) {
		// TODO Auto-generated method stub
		
		int count=1;
		Arrays.sort(input,Comparator.comparingInt(x->x[1]));
		
		for(int i=0;i<input.length-1;i++) {
			if(input[i][1]>input[i+1][0])
				count++;
		}
		return count;
	}

}
