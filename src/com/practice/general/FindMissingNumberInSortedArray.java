package com.practice.general;

public class FindMissingNumberInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Find the missing number in a sorted array containing numbers from 1 to N.(binary search)
	
	int[] a= {1,2,3,5,6};

	System.out.println(findMissingNumber(a));
	}
	
	public static int findMissingNumber(int[] arr) {
		int low=0,high=arr.length-1;
		int mid=0;
		while(low<high) {
			mid=(low+high)/2;
			if(arr[mid]==mid+1)
				low=mid+1;
			else
				high=mid;
			
			
		}
		return low+1;
	}

}

