package com.practice.dsa.mathematical;

public class primeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=100;
		primeFactors(n);

	}
	
	public static void primeFactors(int n) {
		for(int i=2;i*i<n;i++) {
			if(n%i==0) {
				System.out.println(i);
				n=n/i;
			}
			
		}
		if(n>1) {
			System.out.println(n);
		}
	}

}
