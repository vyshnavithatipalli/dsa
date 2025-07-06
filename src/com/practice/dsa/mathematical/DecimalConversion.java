package com.practice.dsa.mathematical;

import java.util.HashMap;

public class DecimalConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Problem Statement: Implement the method that provided numerator and
		 * denominator will return a string representing fraction's decimal form. Some
		 * fractions in decimal form have cyclic decimal points. public static String
		 * vulgarToDecimal(Long numerator, Long denominator) { } Test Cases:
		 * vulgarToDecimal(1l, 2l).equals("0.5"); vulgarToDecimal(1l,
		 * 3l).equals("0.(3)"); vulgarToDecimal(1l, 30l).equals("0.0(3)");
		 * vulgarToDecimal(1l, 75l).equals("0.01(3)"); vulgarToDecimal(4l,
		 * 7l).equals("0.(571428)");
		 */

		
long x1=4l;
long x2=7l;
String finalres=vulgurTodecimal(x1,x2);
System.out.println(finalres);
	}

	private static String vulgurTodecimal(long x1, long x2) {
		  if (x1 == 0) return "0"; // If numerator is 0, the result is 0.
		  StringBuilder s=new StringBuilder();
	      
	        // Handle negative numbers
	        if (x1 < 0 ^ x2 < 0) {
	            s.append("-");
	        }

	        // Convert to absolute values
	        long num = Math.abs(x1);
	        long den = Math.abs(x2);
		// TODO Auto-generated method stub
		
		long res=x1/x2;
		s.append(res);
		x1=x1%x2;
		if(x1==0)
			return s.toString();
		s.append(".");
	HashMap<Long,Integer> map=new HashMap<>();
		while(x1!=0) {
			if(map.containsKey(x1)) {
				int index=map.get(x1);
				s.insert(index,"(");
				s.append(")");
				break;
			}
			map.put(x1, s.length());
			
			x1=x1*10;
			long res1=x1/x2;
			s.append(res1);
			x1=x1%x2;
			
			
			
		}
		
		
		
		return s.toString();
	}

}
