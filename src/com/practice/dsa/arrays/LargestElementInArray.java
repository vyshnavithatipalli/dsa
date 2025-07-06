package com.practice.dsa.arrays;

public class LargestElementInArray {

	public static void main(String[] args) {
		int arr[]= {34,43,11,23};
		int largestElement=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largestElement)
				largestElement=arr[i];
		}
		System.out.println(largestElement);

	}

}
