package com.practice.dsa.arrays;

public class MaximumSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {-5,1,-2,3,-1,2,-2};
int maxEnding = arr[0];
int res=arr[0];
for(int i=1;i<arr.length;i++) {
	maxEnding=Math.max(maxEnding+arr[i], arr[i]);
	res=Math.max(res, maxEnding);
}
System.out.println(maxEnding);
	}

}
