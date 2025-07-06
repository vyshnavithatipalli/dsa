package com.practice.general;

public class ConvertStringToIntegerWithoutInBuilt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//convert string to integer
		String s="aa1234";
		
int res=convert(s);
System.out.println(res);
	}

	private static int convert(String s) {
		// TODO Auto-generated method stub
		 if (s == null || s.isEmpty()) {
	            throw new IllegalArgumentException("Invalid input");
	        }

	        int sign=1;
	    	int i=0,result=0;

	    	
	        // Check if the number is negative
	        if (s.charAt(0) == '-') {
	            sign = -1;
	            i = 1; // Start from the next character
	        }
	
		
		while(i<s.length()) {
			
			char c = s.charAt(i);
			 // Ensure the character is a digit
            if (c < '0' || c > '9') {
                throw new IllegalArgumentException("Invalid character in input");
            }
            int digit = c - '0';
         // Check for overflow before updating result
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
			
			
			result = result * 10 + digit;
			i++;
		}
		return result*sign;
	}

}
