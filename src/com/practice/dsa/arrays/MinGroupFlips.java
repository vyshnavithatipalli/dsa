package com.practice.dsa.arrays;

public class MinGroupFlips {

	public static void main(String[] args) {
		
		//input should be binary array
		//consecutive o's or 1's can be treated as 1 flip
		// TODO Auto-generated method stub
		int arr[]= {1,1,0,0,0,1,0};
		
		//there are 2 possibilities
		//one is the difference between flipping 0's to flipping 1's is 1
		//second is the difference between flipping 0's to flipping 1's is 0
		//the min flip happens when we flip the element which appears second(other than what is in arr[0])
		//diff is 1 if have diff first and last element in array
		//diff is 0 if have same element in first and last of array
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=arr[i-1]) {
				if(arr[i]!=arr[0]) {
					System.out.println("from"+i);
				}
				else {
					System.out.println("to"+ (i-1));
				}
			}
		}
if(arr.length-1!=arr[0]) {
	System.out.println("to "+(arr.length-1));
}
	}

}
