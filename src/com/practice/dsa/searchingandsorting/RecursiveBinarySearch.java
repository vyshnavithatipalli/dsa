package com.practice.dsa.searchingandsorting;

public class RecursiveBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {23,45,67,87};
		int searchElement=45;
		int low=0,high=arr.length-1;
		System.out.println(binarySearch(arr,searchElement,low,high));

	}
	public static int binarySearch(int[] arr,int searchElement,int low,int high) {
		
		int mid=low+high/2;
		if(low>high)
			return -1;
		
		if(arr[mid]==searchElement)
			return mid;
		if(searchElement<arr[mid])
			binarySearch(arr,searchElement,low,mid-1);
		if(searchElement>arr[mid])
			binarySearch(arr,searchElement,mid+1,high);
		return -1;
	}

}
