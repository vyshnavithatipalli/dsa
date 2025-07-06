package com.practice.dsa.arrays;

public class FindmaximumSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(subArrayExceedsSum(new int[]{4, 2, 3, 1}, 6));  // Output: 2
		   System.out.println(subArrayExceedsSum(new int[]{1, 2, 3, 4}, -1)); // Output: 1-not working
		   System.out.println(subArrayExceedsSum(new int[]{1, 1, 1, 1}, 10)); // Output: -1
	}

	private static int subArrayExceedsSum(int[] arr, int sum) {
		int currentSum=0;
		int result=Integer.MAX_VALUE;
		int start=0;
		for(int i=0;i<arr.length;i++) {
			currentSum+=arr[i];
			
			
			while(currentSum>=sum && start<arr.length) {
				result=Math.min(result,i-start+1 );
				
				currentSum-=arr[start];
				start++;
			}
		}
		
		return result==Integer.MAX_VALUE?-1:result;
	}

}
