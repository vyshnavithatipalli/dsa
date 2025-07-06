package com.practice.general;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class java8sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Given an int array[]={1,4,5,7,3,6} Multiply each element by 2 and collect it
		 * in a list. why should we use mapToObj here
		 */
		
		int array[]= {1,4,5,7,3,6};
		
		List<Integer> list=Arrays.stream(array).mapToObj(x->x).map(x->x*2).collect(Collectors.toList());
		System.out.println(list);

	}

}
