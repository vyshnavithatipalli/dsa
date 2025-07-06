package com.practice.dsa.strings;

public class ShortestDistanceBetweenStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Problem Statement – Given two words returns the shortest distance between
		 * their two midpoints in number of characters, words can appear multiple times
		 * in any order and should be case insensitive.
		 * 
		 * Signature : public static double shortestDistance(String document, String
		 * word1, String word2) { }
		 * 
		 * Test Cases:
		 * 
		 * String Document – “In publishing and graphic design, lorem ipsum is a filler
		 * text commonly used to demonstrate the graphic elements”.
		 * 
		 * shortestDistance( document, "is", "a" ) == 2.5
		 */
		
		String document="“In publishing and graphic design, lorem ipsum is a filler\r\n"
				+ "		 * text commonly used to demonstrate the graphic elements”.";
		//String document ="“In publishing and graphic design, lorem ipsum is a filler text commonly used to demonstrate the graphic elements";
		
		double shortestDistance=shortestDistance( document, "is", "a" );
		System.out.println(shortestDistance);
	}

	private static double shortestDistance(String document, String word1, String word2) {
		// TODO Auto-generated method stub
		if (document == null || word1 == null || word2 == null) return -1;
		
		String[] words=document.split("\\s+");
		int index=0;
		double shortestDistance=Integer.MAX_VALUE;
		double word1mid=-1,word2mid=-1;
		for(String word:words) {
		int startIdx=document.indexOf(word,index);
		int endIdx=startIdx+word.length()-1;
		double mid=(startIdx+endIdx)/2.0;
		//System.out.println(mid);
		if(word1.equals(word)) {
			word1mid=mid;
		}
		if(word2.equals(word)) {
			word2mid=mid;
		}
		
		if(word1mid !=-1 && word2mid!=-1) {
			shortestDistance=Math.min(shortestDistance, Math.abs(word1mid-word2mid));
		}
		
		index=endIdx+1;
		}
		return shortestDistance==Integer.MAX_VALUE?-1:shortestDistance;
	}

}
