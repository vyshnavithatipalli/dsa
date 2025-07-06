package com.practice.dsa.numericals;

public class FindSecondSmallest {

	public static void main(String[] args) {
		/*
		 * Returns second smallest element in array x. If x has fewer than 2 elements
		 * returns 0.
		 * 
		 * Signature: int secondSmallest(int[] x)
		 * 
		 * Test Cases: Input:[ -1, 0, 1, -2, 2] Output: -1
		 * 
		 * Input:[ 0, 1] Output: 1
		 */
		int[] a= {-1,0,1,-2,2};
		int secondSmallest=secondSmallest(a);
		System.out.println(secondSmallest);
		}

	private static int secondSmallest(int[] a) {
		// TODO Auto-generated method stub
		 if (a == null || a.length < 2) {
	            return 0;  // Return 0 if fewer than 2 elements
	        }
		int smallest=Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++){
		if(a[i]<smallest) {
			secondSmallest=smallest;
			smallest=a[i];
		}
		else if(a[i]<secondSmallest && a[i]!=smallest) {
			secondSmallest=a[i];
		}
	}
		
		return secondSmallest==Integer.MAX_VALUE?0:secondSmallest;

	}

}
