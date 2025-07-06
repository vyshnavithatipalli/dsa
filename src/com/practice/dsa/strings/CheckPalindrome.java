package com.practice.dsa.strings;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str1 = "rotator";                         
	       String revstr = reverseString(str1); //revstr=reverse string
	       if (str1.equals(revstr)) 
	          {
	              System.out.println("The string" + str1 + " is a Palindrome String.");
	          } 
	        else 
	          {
	           System.out.println("The string" + str1 + " is not a Palindrome String.");
	          }
	      //another efficient way 
	      boolean val= checkPalindrome(str1);
	      System.out.println(val);
	       
	}
	public static String reverseString(String str2) 
    {
        String revstr = "";
        for (int i = str2.length() - 1; i >= 0; i--) 
         {
            revstr += str2.charAt(i);
         }
            return revstr;
     }
	public static boolean checkPalindrome(String str) {
		
		for(int i=0;i<str.length()/2;i++) {
			
			
			if(str.charAt(i)!=str.charAt(str.length()-i-1))
				return false;
		}
		return true;
		
	}

}
