package com.practice.general;

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,2,0,3,2,5};

		int lmax[]=new int[arr.length];
		int rmax[]=new int[arr.length];
		int result=0;
		lmax[0]=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			
	lmax[i]=Math.max(arr[i], lmax[i-1]);
		}
		rmax[arr.length-1]=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--) {
			
rmax[i]=Math.max(arr[i], rmax[i+1]);			}
		
	for(int i=0;i<arr.length;i++) {
		result=Math.min(lmax[i], rmax[i])+result-arr[i];
	}
	System.out.println(result);
	}

}
