package com.practice.dsa.mathematical;

public class FactorialOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=4,res=1;
		for(int i=1;i<=x;i++) {
			res=res*i;
		}
		System.out.println(res);
		
		int factResult=recursiveFactorial(x);
		System.out.println(factResult);
			

	}
	
	public static int recursiveFactorial(int x) {
		if(x<1)
			return 1;
		return x*recursiveFactorial(x-1);
	}

}
