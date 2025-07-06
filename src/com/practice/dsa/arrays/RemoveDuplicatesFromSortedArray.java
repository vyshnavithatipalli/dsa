package com.practice.dsa.arrays;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {

		int res=1;
		int arr[]= {11,11,23,45,76};
		for(int i=1;i<arr.length;i++) {
			if(arr[i] !=arr[res-1]) {
				arr[res]=arr[i];
				res++;
			}
		}
		
		for(int i=0;i<res;i++)
		System.out.println(arr[i]);
	}

}
