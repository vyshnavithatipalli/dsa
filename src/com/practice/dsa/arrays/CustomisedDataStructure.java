package com.practice.dsa.arrays;

import java.util.HashMap;
import java.util.Map;

public class CustomisedDataStructure {
	
	
	
	
	static Map<Integer,Integer> map=new HashMap<Integer, Integer>();
	private static int startIndex = -1;
	private static int endIndex = -1;
	
	public static void push(int value) {
		if(map.isEmpty()) {
			startIndex=0;
			endIndex=0;
			map.put(endIndex, value);
			return;
		}
		endIndex++;
		map.put(endIndex, value);
		
	}
	
	public static int pop() {
		if(map.isEmpty()) {
			startIndex=-1;
					endIndex=-1;
			return -1;
			
		}
			
		int val=map.remove(endIndex);
		endIndex--;
		return val;
		
	}
	
	public static  int seek(int index) {
		
		if(map.get(index)!=null)
		return map.get(index);
		
		else
			return -1;
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Design a data structure with following features: 1. Push an element at the
		 * end of the data structure (O(1) time complexity) - void push(int element) 2.
		 * Pop the element from the beginning of the data structure( pop the earliest
		 * element added, O(1) time complexity) - int pop() 3. Seek an element at index
		 * i at any given state of the data structure. (O(1) time complexity) - int
		 * seek(int index) Elements can be duplicate too.
		 */
		
		push(5);
		push(4);
		push(3);
		
		seek(0);
		System.out.println(pop());
		System.out.println(seek(0));
		

	}
	
	

}
