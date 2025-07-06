package com.practice.general;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class LongestUniqueUserNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] users = {
	            {"1", "user1"},
	            {"2", "user2"},
	            {"5", "user5"},
	            {"4", "user1"},
	            {"3", "user3"}
	        };

	        System.out.println(lengthOfLongestUniqueUserNames(users)); // Output: 3
	}

	private static int lengthOfLongestUniqueUserNames(String[][] users) {
		
		//Arrays.sort(users,Comparator.comparingInt(x->Integer.parseInt(x[0])));
		
		// TODO Auto-generated method stub
		Set<String> set=new HashSet<>();
		int res=0;
		int start=0;
		for(int i=0;i<users.length;i++) {
			
		String currentuser=users[i][1];
		
		if(set.contains(currentuser)) {
			set.remove(users[start][1]);
			start++;
		}
		set.add(currentuser);
		res=Math.max(res, i-start+1);
		
		}
		return res;
	}

}
