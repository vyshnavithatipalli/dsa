package com.practice.dsa.mathematical;

import java.util.ArrayList;

public class PrimeFactorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Problem Statement: Return an array containing prime numbers whose product is
		 * x Examples: primeFactorization( 6 ) == [2,3] primeFactorization( 5 ) == [5]
		 * primeFactorization( 12 ) == [2,2,3] Signature: public static
		 * ArrayList<Integer> primeFactorization(int x) { } Test Cases- Input: 6
		 * Output:[2,3]
		 */
		
		int x=12;
		ArrayList<Integer> list=getprimeFactors(x);
		System.out.println(list);


	}

	private static ArrayList<Integer> getprimeFactors(int x) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		while(x%2==0) {
			list.add(2);
			x=x/2;
		}
		for(int i=3;i*i>x;i+=2) {
			while(x*i==0) {
				list.add(i);
				x=x/i;
			}
		}
		if(x>2)
			list.add(x);
		return list;
	}

}
