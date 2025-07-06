package com.practice.dsa.arrays;

public class CheckIfArrayIsSorted {

	public static void main(String[] args) {

		int arr[] = { 11, 12, 34, 56 };
		System.out.println(checkIfArrayisSorted(arr));

	}

	public static boolean checkIfArrayisSorted(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			
			if (arr[i + 1] < arr[i]) {
				return false;
			}
		}
		return true;

	}

}
