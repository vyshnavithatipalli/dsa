package com.practice.dsa.mathematical;

public class countDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=12342,count=0;
		while(i>0) {
			
			i=i/10;
			count++;
		}
System.out.println(count);
	}

}
