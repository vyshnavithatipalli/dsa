package com.practice.general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FindMaxMeetings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * meeting start and end time {{0,6}, {1,3},{3,7},{4,5},{5,8},{6,7},(7,9),{8,9}}
		 * There is one meeting room, accept meeting request in such a way that max
		 * meeting can be accommodated in that room
		 */
int[][] x={{0,6}, {1,3},{3,7},{4,5},{5,8},{6,7},{7,9},{8,9}};
List<int[]> list=new ArrayList<>();
for(int[] meeting :x) {
	list.add(meeting);
	}
Collections.sort(list,Comparator.comparingInt(c->c[1]));
int count=0;
int endIdx=-1;

for(int i=0;i<list.size();i++) {
	if(list.get(i)[0]>=endIdx) {
		count++;
		endIdx=list.get(i)[1];
		
	}
}
System.out.println(count);

	}

}
