package com.practice.dsa.arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {12,32,43,11};
		int low=0;
		int high=arr.length-1;
		int temp;
		
		while (low<high) {
			temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
