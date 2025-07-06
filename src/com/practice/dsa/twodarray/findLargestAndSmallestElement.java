package com.practice.dsa.twodarray;

public class findLargestAndSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,2},{3,4}};
		int largest=arr[0][0];
		int smallest=arr[0][0];
		for(int[] row:arr) {
			for(int col:row) {
				if(col>largest) {
					largest=col;
			}
				else if(col<smallest) {
					smallest=col;
				}
		}
		}
System.out.println("largest"+largest);
System.out.println("smallest"+smallest);
	}

}
