package com.practice.dsa.mathematical;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mostEfficient
		int n=18;
		boolean res=checkPrime(n);
		System.out.println(res);

	}
	
	public static boolean checkPrime(int n) {
		if(n==0)
			return false;
		if(n%2==0 || n%3 ==0)
			return false;
		for(int i=5;i*i<=n;i=i+6) {
			if(n%i==0 || n%(i+2)==0)
				return false;
		}
		return true;
					
	}

}
