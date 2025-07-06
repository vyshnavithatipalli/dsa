package com.practice.dsa.searchingandsorting;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {23,45,67,87};
		int searchElement=45;
		int res=binarySearch(arr,searchElement);
		System.out.println(res);
		

	}
	public static int binarySearch(int[] arr,int searchElement) {
		int low=0,high=arr.length-1;
		int mid=low+high/2;
		while(low<=high) {
			if(searchElement==arr[mid])
				return mid;
			if(searchElement<arr[mid])
			
				high=low-1;
				
			
			if(searchElement>arr[mid])
				low=mid+1;
		}
		
		return -1;
	}

}
