package com.practice.general;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Given two arrays, merge them to single sorted array. For Example: • input:
		 * arr1[] = {1,3,5,7}, arr2[] = {0,2,4,6} • output: result [] = {0, 1, 2, 3, 4,
		 * 5, 6, 7}
		 */
		
		int arr1[] = {1,3,5,7}, arr2[] = {0,2,4,6};
		int res=0,i=0,j=0;
		int x[] = new int[arr1.length+arr2.length];
		while(i<arr1.length && j<arr2.length){
			
			
			if(arr1[i]<arr2[j]) {
				x[res]=arr1[i];
				res++;
				i++;
			}
			else {
				x[res]=arr2[j];
				res++;
				j++;
			}
			}
		 // Copy remaining elements from arr1
        while (i < arr1.length) {
            x[res++] = arr1[i++];
        }

        // Copy remaining elements from arr2
        while (j < arr2.length) {
            x[res++] = arr2[j++];
	
			
		}
        System.out.println(Arrays.toString(x));
	}
}


