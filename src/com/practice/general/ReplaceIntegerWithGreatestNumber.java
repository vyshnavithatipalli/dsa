package com.practice.general;

public class ReplaceIntegerWithGreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create a new array by replacing each integer value with next greatest number
		 * and if not present than set it with default value i.e. -1. int[] input1 =
		 * [5,10,6,8,6] int[] output1 = [10,-1,8,-1,-1]
		 */
		
		int arr[]= {5,10,6,8,6};
		int res[]=findGreatestNumberwithoutsecondarry(arr);
for(int i:res) {
	System.out.println(i);
}
	}

	private static int[] findGreatestNumber(int[] arr) {
		// TODO Auto-generated method stub
		int[] res=new int[arr.length];
		
		res[arr.length-1]=-1;
		int largest=0;
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]>largest) {
				largest=arr[i];
				res[i]=-1;
			}
			else
				res[i]=largest;
		}
		return res;
	}
	private static int[] findGreatestNumberwithoutsecondarry(int[] arr) {
		// TODO Auto-generated method stub
		//int[] res=new int[arr.length];
		
		//res[arr.length-1]=-1;
		int largest=arr[arr.length-1];
		arr[arr.length-1]=-1;
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]>largest) {
				largest=arr[i];
				arr[i]=-1;
			}
			else
				arr[i]=largest;
		}
		return arr;
	}


}
