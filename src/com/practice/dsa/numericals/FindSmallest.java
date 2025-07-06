package com.practice.dsa.numericals;

public class FindSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				/*
				 * Problem Statement- Returns the smallest number in array that has been rotated
				 * For example - Array {3,4,5,6,1,2} returns 1 Input array was originally sorted
				 * in increasing orders FindMinInArray must have O(log n) runtime Input array
				 * does not have any duplicates Signature: public static int FindMin(int a[]){ }
				 * 
				 * Test Cases: Input: [3, 4, 5, 6, 1, 2] Output: 1
				 * 
				 * Input: [2, 1] Output:1
				 */

		int[] a= {3,4,5,6,1,2};
		int min=findMin(a);
		System.out.println(min);

			}

			private static int findMin(int[] a) {
				// TODO Auto-generated method stub
				
				int low=0,high=a.length-1;
				int mid=low+high/2;
				while(low<high) {
					if(a[mid]>a[high])
						low=mid+1;
					else
						high=mid;
					
					low++;
					high--;
					
				}
				return a[low];
	}

}
