package com.practice.dsa.mathematical;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=121;
int rev=findRev(x);
System.out.println(rev);
if(x==rev)
System.out.println(true);
else
System.out.println(false);	}
	
	
	public static int findRev(int x) {
		int rem=0,rev=0;
		while(x>0) {
			rem=x%10;
			x=x/10;
			rev=rev*10+rem;
			
		}
		return rev;
	}

}
