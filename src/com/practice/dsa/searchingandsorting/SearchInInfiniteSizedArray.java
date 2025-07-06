package com.practice.dsa.searchingandsorting;

public class SearchInInfiniteSizedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int arr[]= {1,2,3,4,5,6,7,8,8,9};
		int searchElement=5;
		while(true) {
			if(arr[i]==searchElement)
			{
				System.out.println(i);
				break;
			}
			if(arr[i]>searchElement) {
				System.out.println("Not Found");
				break;
			}
			i++;
		}

	}

}
