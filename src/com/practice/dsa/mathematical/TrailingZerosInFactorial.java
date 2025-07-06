package com.practice.dsa.mathematical;

public class TrailingZerosInFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//efficient approch if x is larger number
		//for every five element there will be atleast 1 five so n/5
		//for every 25 element there will be atleast 2 five so n/25
		int res=0;
		int n=5;
		for(int i=5;i<=n;i=i*5) {
			res=res+n/i;
		}
		System.out.println(res);
	}

}
