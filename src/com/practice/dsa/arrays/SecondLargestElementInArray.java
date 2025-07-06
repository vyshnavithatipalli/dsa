package com.practice.dsa.arrays;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,23,45,33,11};
		int firstLargest=0;
		int secondLargest=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>firstLargest)
				firstLargest=arr[i];
			else if(arr[i]<firstLargest && arr[i]>secondLargest)
				secondLargest=arr[i];
		}
System.out.println("second largest"+secondLargest);
System.out.println("First Largest"+firstLargest);
	}

}
