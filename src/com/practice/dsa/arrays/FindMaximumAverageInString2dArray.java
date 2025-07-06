package com.practice.dsa.arrays;

import java.util.HashMap;
import java.util.Map;

public class FindMaximumAverageInString2dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] scores= {
				{"Alice","65"},
				{"Bob","62"},
				{"Bob","51"},
				{"Alice","67"},
				{"cat","57"},
				{"cat","47"}
		};
		
		
		for(int i=0;i<scores.length;i++) {	
			System.out.println("values "+scores[i][0]+"  "+scores[i][1]);
		}
		for(int i=0;i<scores.length;i++) {	
			for(int j=0;j<scores[i].length;j++) {
			System.out.println("values2 "+scores[i][j]);
		}
		}
		
		
		
		
		
		Map<String,Integer> scoreMap=new HashMap<>();
		
		Map<String,Integer> countMap=new HashMap<>();
		for(String score[]:scores) {
			String name=score[0];
			int grade=Integer.parseInt(score[1]);
			scoreMap.put(name, scoreMap.getOrDefault(name, 0)+grade);
			countMap.put(name, countMap.getOrDefault(name, 0)+1);
			
		}
		
		String topStudent="";
		double avg=0.0;
		
		
		for(String name:scoreMap.keySet()) {
			
			double curravg=scoreMap.get(name)/countMap.get(name);
			if(curravg>avg) {
				avg=curravg;
				topStudent=name;
			}
			
		}
		
		System.out.println(topStudent);
		System.out.println(avg);

	}

}
