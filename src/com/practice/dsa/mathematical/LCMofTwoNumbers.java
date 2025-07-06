package com.practice.dsa.mathematical;

public class LCMofTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//we use euclidean algorithm
		//a*b=LCM* GCD
		
		int x=2,y=4;
		int gcdRes=gcd(x,y);
int finalRes=x*y/gcdRes;
System.out.println(finalRes);
		

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
