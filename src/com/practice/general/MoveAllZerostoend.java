package com.practice.general;

public class MoveAllZerostoend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,0,23,0,0,12,0,12,0,0};
		
		
		int start=0;
		int end=arr.length-1;
		
		while(start<end) {
			if(arr[start]==0) {
				while(arr[end]==0 && start<end)
					end--;
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			
			}
			else {
				start++;
			}
			
		}
		
		/*
		 * int res=0; for(int i=0;i<arr.length;i++) { if(arr[i]!=0) { int temp=arr[i];
		 * arr[i]=arr[res]; arr[res]=temp; res++; }
		 * 
		 * }
		 */
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
