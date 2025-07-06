package com.practice.general;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class FindMinNoOfmeetingRooms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] input= {{5, 10}, {15, 20},{10,14},{0, 15}};
		/*
		 * There is one meeting room, accept meeting request in such a way that min
		 * meeting can be accommodated in that room.
		 */		int x=findmin(input);
		System.out.println(x);
	}



	private static int findmin(int[][] input) {
		// TODO Auto-generated method stub
		
		Arrays.sort(input,Collections.reverseOrder(Comparator.comparingInt(a->a[1]-a[0])));
		for(int[] x:input) {
			System.out.println(x[0]+" "+x[1]);
		}
		int count=1;
		for(int i=0;i<input.length-1;i++) {
			if(input[i][1]<=input[i+1][0]) {
				count++;
			}
		}
		return count;
	}
}