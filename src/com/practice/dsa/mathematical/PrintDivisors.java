package com.practice.dsa.mathematical;

public class PrintDivisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		
		//printDivisors(n);
		//effivient approach
		for(int i=1;i*i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			if(i!=n/i) {
				System.out.println(n/i);}
			}
		}

	}
	public static void printDivisors(int n) {
		for(int i=1;i<=n;i++) {
			if(n%i==0)
				System.out.println(i);
		}
	}

}
