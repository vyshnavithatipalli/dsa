package com.practice.general;

public class GivenpascalValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Problem Statement: Pascals Triangle exhibits the following behaviour:
		 * 
		 * The first and last numbers of each row in the triangle are 1 Each number in
		 * the triangle is the sum of the two numbers above it.
		 * 
		 * Example: 1 1 1 1 2 1 1 3 3 1 1 4 6 4 1 1 5 10 10 5 1 1 6 15 20 15 6 1
		 * 
		 * Please Complete the ‘pascal’ function below so that given a col and a row it
		 * will return the value in that position.
		 * 
		 * Example, pascal(1,2) should return 2
		 * 
		 * Signature: public static int pascal(int col, int row){
		 */

		int res=getPascal(1,2);
		System.out.println(res);
	}

	private static int getPascal(int i, int j) {
		// TODO Auto-generated method stub
		//i-col,j-row
		
		int res=fact(j)/fact(i)*fact(j-i);
		return res;
	}

	private static int fact(int j) {
		// TODO Auto-generated method stub
		int res=1;
		for(int i=2;i<=j;i++) {
		res=res*i;
		}
		return res;
	}

}
