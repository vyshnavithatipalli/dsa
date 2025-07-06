package com.practice.dsa.mathematical;

import java.util.Arrays;

public class AddFraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Problem Statement- Given two fractions passed in as int arrays, returns the
		 * fraction which is result of adding the two input fractions Fraction is
		 * represented as a two-element array - [ numerator, denominator ] The returned
		 * fraction has to be in its simplest form. Signature: int[] addFractions (
		 * int[] fraction1, int[] fraction2 ){ } Test Cases: INPUT: fraction1 - [2, 3];
		 * fraction2 - [1, 2]; OUTPUT: Hint- {2/3 +1/2} result = [7,6]
		 */
		
		int[] fraction1= {1,2};
		int[] fraction2= {2,3};
		
		int[] result=addFractions(fraction1,fraction2);
		System.out.println(Arrays.toString(result));
		
		


	}

	private static int[] addFractions(int[] fraction1, int[] fraction2) {
		// TODO Auto-generated method stub
		int num1=fraction1[0];
		int den1=fraction1[1];
		int num2=fraction2[0];
		int den2=fraction2[1];
		
		int lcm=(den1*den2)/gcd(den1,den2);
		
		
		int newNum1=num1*(lcm/den1);
		int newNum2=num2*(lcm/den2);
		
		
		int finalNum=newNum1+newNum2;
		int finalden=lcm;
		
		
		int commonfactor=gcd(finalNum,finalden);
		
		finalNum/=commonfactor;
		finalden/=commonfactor;
		
		int[] finalValue= {finalNum,finalden};
		
		
		return finalValue;
	}

	private static int gcd(int den1, int den2) {
		// TODO Auto-generated method stub
		
		if(den2==0)
			return den1;
		else
			return gcd(den2,den1%den2);
	
	}

}
