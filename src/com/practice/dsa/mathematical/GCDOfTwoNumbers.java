package com.practice.dsa.mathematical;

public class GCDOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=2, y=4;
		
		int gcdRes=gcd(x,y);
		System.out.println(gcdRes);

	}
	public static int gcd(int a , int b) {
		while(a!=b) {
			if(a>b)
				a=a-b;
			else
				b=b-a;
		}
		return a;
	}

}
