package com.practice.dsa.arrays;

public class FrequencyInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,1,2,3,3,5};
		int i=1,f=1;
		while(i<arr.length) {
			System.out.println(i);
			while(i<arr.length && arr[i]==arr[i-1])
				
			{
			f++;
			i++;
			}
			System.out.println("element"+arr[i-1] +"frequency"+f);
			i++;
			f=1;
		}
		if(arr.length==1 || arr[arr.length-1]!=arr[arr.length-2]) {
			System.out.println("element"+arr[arr.length-1]+"freq"+1);
		}
		

	}

}
