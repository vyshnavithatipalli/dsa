package com.practice.dsa.arrays;

public class MaximumDifferenceProblemWithOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//max diff of arr[j]-arr[i]
		int arr[]= {12,56,87,54};
int minValue=arr[0];
int res=arr[1]-arr[0];
for(int j=1;j<arr.length;j++) {
	res=Math.max(res, arr[j]-minValue);
	minValue=Math.min(minValue, arr[j]);
}
System.out.println(res);
	}
	

}
