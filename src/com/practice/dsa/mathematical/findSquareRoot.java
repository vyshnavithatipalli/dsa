package com.practice.dsa.mathematical;

public class findSquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Problem Statement- Returns square root of the given double Signature: double
		 * squareRoot( double x ){ } Test Cases: Input1: 4 Ouput1:2 Input2:2 Output2:
		 * 1.41421
		 */

		double x = 3;
		double finalresult = getSquareRoot(x);

 finalresult = Math.round(finalresult * 100.0) / 100.0;
		System.out.println(finalresult);

	}

	private static double getSquareRoot(double x) {
		// TODO Auto-generated method stub

		if (x < 0)
			throw new IllegalArgumentException("Negative number not allowed.");
		if (x == 0 || x == 1)
			return x;
		double low = 0, high = x;
		double precision = 1e-6;
		double mid = 0;

		while ((high - low) > precision) {
			mid = (low + high) / 2;
		if (mid * mid > x)
			high = mid;
		else
			low = mid;
		//System.out.println(high);
		}
		return (low + high) / 2;
		
	}

}
