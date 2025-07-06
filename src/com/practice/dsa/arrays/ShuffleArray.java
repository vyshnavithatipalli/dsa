package com.practice.dsa.arrays;

import java.util.Random;

public class ShuffleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4};
		int[] res=shufflearr(arr);
for(int i=0;i<res.length;i++) {
	System.out.println(res[i]);
}
	}

	private static int[] shufflearr(int[] arr) {
		// TODO Auto-generated method stub
		
		Random ran=new Random();
		for(int i=1;i<arr.length;i++) {
			int j=ran.nextInt(i+1);
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		return arr;
	}

}
