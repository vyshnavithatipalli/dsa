package com.practice.dsa.arrays;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,0,23,0,0,12,0};
		moveZerosToEndEfficientApproach(arr);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]!=0)
					{
						

						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
break;						}
					}
				
			}
		}
for(int 
		i=0;i<arr.length;i++) {
	//System.out.println(arr[i]);
}
	}
	
	public static void moveZerosToEndEfficientApproach(int arr[]) {
		int res=0;
		for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0) {
			int temp=arr[i];
			arr[i]=arr[res];
			arr[res]=temp;
			res++;
		}
		
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

	}
