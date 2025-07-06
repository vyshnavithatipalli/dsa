package com.practice.dsa.mathematical;

public class PowerOfExpo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Problem Statement- Given base and integer exponent, compute value of base
		 * raised to the power of exponent.
		 * 
		 * Signature: public static double power(double base, int exp) { }
		 * 
		 * Test Cases: Input: 2.0 4 Output: 16.0
		 */
		
		double base=2.0;
		int exp=4;
		double res=power(base,exp);
		System.out.println(res);


	}

	private static double power(double base, int exp) {
		// TODO Auto-generated method stub
		if(exp==0)
			return 1.0;
		
		if(exp<0) {
			base=1/base;
			exp=-exp;
		}
		
		double halfPower=power(base,exp/2);
		return exp%2==0?halfPower*halfPower:base*halfPower*halfPower;
		
	}

}
