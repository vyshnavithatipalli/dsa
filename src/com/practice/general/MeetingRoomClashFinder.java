package com.practice.general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MeetingRoomClashFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 3. Meeting Room Schedule Clash Finder Scenario: Given a list of meetings with
		 * start and end times, return all pairs of meetings that overlap.
		 * 
		 * Example Input: [[1, 5], [3, 6], [7, 10], [9, 12]] Output: Overlapping pairs:
		 * [ [1, 5], [3, 6] ] [ [7, 10], [9, 12] ]
		 */
		
		int[][] input= {{1, 5}, {3, 6}, {7, 10}, {9, 12}};
		List<int[]> res=find(input);
	
	for (int[] arr : res) {
		
        System.out.println(Arrays.toString(arr));
    }

	}

	private static List<int[]> find(int[][] input) {
		// TODO Auto-generated method stub
		
		List<int[]> list=new ArrayList<int[]>();
		Arrays.sort(input,Comparator.comparingInt(x->x[1]));

		for(int i=0;i<input.length-1;i++) {
			if(input[i][1]>input[i+1][0])
			{
				int[] arr= input[i];
				int[] arr1= input[i+1];
				list.add(arr);
				list.add(arr1);
			}
		}
		return list;
	}

}
