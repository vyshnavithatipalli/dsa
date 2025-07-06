package com.practice.dsa.arrays;

public class LeadersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,56,87,54};
		//leader-element>all the elemntss on right, last element is always leadetr
		int currLeader=arr[arr.length-1];
		System.out.println(currLeader);

		for(int i=arr.length-2;i>0;i--)
		{
			if(arr[i]>currLeader) {
			currLeader=arr[i];
			System.out.println(currLeader);}
		}
		

	}

}
