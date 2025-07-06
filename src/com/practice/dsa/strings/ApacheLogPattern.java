package com.practice.dsa.strings;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ApacheLogPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Problem Statement- Given an Apache log file, return IP address(es) which
		 * accesses the site most often. our log is in this format (Common Log Format).
		 * One entry per line. 10.0.0.1 - frank [10/Dec/2000:12:34:56 -0500]
		 * "GET /a.gif HTTP/1.0" 200 234 Log file entries are passsed as an array. NOTE:
		 * In case of tie, this returns a comma-separated list of the IP addresses. Tie
		 * is not mentioned explicitly in the exercise on purpose.
		 * 
		 * Signature: String findTopIpaddress(String[] lines){ }
		 * 
		 * Test Cases: Input: String lines[] = new String[]{
		 * "10.0.0.1 - frank [10/Dec/2000:12:34:56 -0500] \"GET /a.gif HTTP/1.0\" 200 234"
		 * ,
		 * "10.0.0.1 - frank [10/Dec/2000:12:34:57 -0500] \"GET /b.gif HTTP/1.0\" 200 234"
		 * ,
		 * "10.0.0.2 - nancy [10/Dec/2000:12:34:58 -0500] \"GET /c.gif HTTP/1.0\" 200 234"
		 * }; Output : 10.0.0.1
		 * 
		 * Input: String lines[] = new String[]{
		 * "10.0.0.1 - frank [10/Dec/2000:12:34:56 -0500] \"GET /a.gif HTTP/1.0\" 200 234"
		 * ,
		 * "10.0.0.1 - frank [10/Dec/2000:12:34:57 -0500] \"GET /b.gif HTTP/1.0\" 200 234"
		 * ,
		 * "10.0.0.2 - nancy [10/Dec/2000:12:34:58 -0500] \"GET /c.gif HTTP/1.0\" 200 234"
		 * ,
		 * "10.0.0.2 - nancy [10/Dec/2000:12:34:59 -0500] \"GET /c.gif HTTP/1.0\" 200 234"
		 * ,
		 * "10.0.0.3 - logan [10/Dec/2000:12:34:59 -0500] \"GET /d.gif HTTP/1.0\" 200 234"
		 * ,}; Output - 10.0.0.1,10.0.0.2
		 */
	String lines[] = new String[]{
				 "10.0.0.1 - frank [10/Dec/2000:12:34:56 -0500] \"GET /a.gif HTTP/1.0\" 200 234"
				  ,
				  "10.0.0.1 - frank [10/Dec/2000:12:34:57 -0500] \"GET /b.gif HTTP/1.0\" 200 234"
				  ,
				  "10.0.0.2 - nancy [10/Dec/2000:12:34:58 -0500] \"GET /c.gif HTTP/1.0\" 200 234"
				  ,
				  "10.0.0.2 - nancy [10/Dec/2000:12:34:59 -0500] \"GET /c.gif HTTP/1.0\" 200 234"
				  }; 
		
	String res=FindTopIpaddress(lines);
	System.out.println(res);
	}

	private static String FindTopIpaddress(String[] lines) {
		// TODO Auto-generated method stub
		Map<String,Integer> map=new HashMap<>();
		int maxCount=0;
		for(String x:lines) {
		String ip=x.split(" ")[0];
		map.put(ip, map.getOrDefault(ip, 0)+1);
		maxCount=Math.max(maxCount, map.getOrDefault(ip, 0));
		}
		int val=maxCount;
		List<String> res=map.entrySet().stream().filter(x->x.getValue()==val).map(y->y.getKey()).collect(Collectors.toList());
		
		/*
		 * for (Map.Entry<String, Integer> entry : ipCountMap.entrySet()) { if
		 * (entry.getValue() == maxCount) { topIps.add(entry.getKey()); } }
		 */
		return String.join(",", res);
	}

}
