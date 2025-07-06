package com.practice.general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AvailableTimeSlots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 4. Available Time Slots Between Meetings Scenario: Given a person's list of
		 * meetings in a day (as intervals) and working hours, find free time slots
		 * where they can schedule a new meeting.
		 * 
		 * Example Input:
		 * 
		 * Working hours: [9, 17]
		 * 
		 * Meetings: [[9, 10], [12, 13], [15, 16]]
		 * 
		 * Desired meeting duration: 1 hour Output: [[10, 12], [13, 15], [16, 17]]
		 */
		
		int[][] input= {{10,11}, {12, 13}, {15, 16}};
		int[] workinghours= {9,17};
		List<List<Integer>> res=find(input,workinghours);
		for(int i=0;i<res.size();i++) {
			System.out.println(res.get(i));
		}

	}

	private static List<List<Integer>> find(int[][] input, int[] workinghours) {
		// TODO Auto-generated method stub
		Arrays.sort(input,Comparator.comparingInt(x->x[0]));
		//check timslots immediate start
		
		List<List<Integer>> list=new ArrayList<>();
		
		if(input[0][0]>workinghours[0]) {
			List<Integer> list1=new ArrayList<>();
			list1.add(workinghours[0]);
			list1.add(input[0][0]);
			list.add(list1);
		}
		for(int i=0;i<input.length-1;i++) {
			if(input[i][1]<input[i+1][0]) {
				List<Integer> list2=new ArrayList<>();
				list2.add(input[i][1]);
				list2.add(input[i+1][0]);
				list.add(list2);
			}
				
		}
		
		if(input[input.length-1][1]<workinghours[1])
		{
			List<Integer> list3=new ArrayList<>();
			list3.add(input[input.length-1][1]);
			list3.add(workinghours[1]);
			list.add(list3);
		}
		return list;
	}

}
