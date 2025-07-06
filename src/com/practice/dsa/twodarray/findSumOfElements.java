package com.practice.dsa.twodarray;

public class findSumOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,2},{3,4}};
		int sum=0;
		for(int[] row:arr) {
			for(int col:row) {
				sum+=col;
			}
		}
		/*
		 * for(int i=0;i<arr.length;i++) { for(int j=0;j<arr[i].length;j++) {
		 * sum=sum+arr[i][j]; } }
		 */
System.out.println(sum);
	}

}
