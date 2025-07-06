package com.practice.dsa.mathematical;

public class checkIsPowerOf10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Problem Statement- Returns true if x is a power-of-10. Otherwise returns
		 * false. Signature: bool isPowerOf10(int x){ } Test Cases: INPUT: Input1: 3
		 * Output1: false
		 */

		int x=3;
		boolean res=checkPowerof10(x);
		System.out.println(res);

	}

	private static boolean checkPowerof10(int x) {
		// TODO Auto-generated method stub
		
		while(x>1) {
			if(x%10!=0)
				return false;
			x=x/10;
						
		}
		return true;
	}

}
