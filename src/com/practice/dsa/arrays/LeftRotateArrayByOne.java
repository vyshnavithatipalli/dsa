package com.practice.dsa.arrays;

public class LeftRotateArrayByOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,56,87,54};
		int temp=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp;
		for(int i=0;i<arr.length;i++) {

		System.out.println(arr[i]);}

	}

}
