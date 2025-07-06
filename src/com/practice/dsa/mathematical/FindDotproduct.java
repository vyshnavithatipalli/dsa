package com.practice.dsa.mathematical;

public class FindDotproduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Problem Statement-
        Given two arrays of integers, returns the dot product of the arrays.
Signature:
         long dotProduct( int[] array1, int array2[] ){
         }  
Test Cases:           INPUT:
array1 = [1, 2];
          array2 = [2, 3]; 
          OUTPUT: hint {1*2+2*3}
          Result =[8]   */

int arr1[]= {2,3};
int arr2[]= {1,2};

long result=findDotproduct(arr1,arr2);
System.out.println(result);
	}

	private static long findDotproduct(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		
		if(arr1.length!=arr2.length)
			throw new IllegalArgumentException();
		int res=0;
		for(int i=0;i<arr1.length;i++) {
			res+=(long)arr1[i]*arr2[i];
		}
		return res;
	}

}
