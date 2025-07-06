package com.practice.dsa.arrays;

public class MaximunConsecutiveones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//given binary array
		int arr[]= {1,1,1,1,1,1,1,1,0,0,1,1,1,1,1};
		int res=0,count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				count++;
				res=Math.max(count, res);
			}
			else {
				count=0;
				
			}
		}
System.out.println(res);
	}

}
