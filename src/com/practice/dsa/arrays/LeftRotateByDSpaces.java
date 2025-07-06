package com.practice.dsa.arrays;

public class LeftRotateByDSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,56,87,54};
		int d=2;
reverse(arr,0,d-1);
reverse(arr,d,arr.length-1);
reverse(arr,0,arr.length-1);
for(int i=0;i<arr.length;i++)
System.out.println(arr[i]);

	}
public static void reverse(int[] arr,int i,int j) {
	while(i<j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
	}
}
}
