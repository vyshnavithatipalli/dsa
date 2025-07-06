package com.practice.dsa.searchingandsorting;

public class IndexofFirstOccuranceinSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {23,45,67,45};
		int searchElement=45;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==searchElement) {
            System.out.println(i);
			break;}
			}

	}

}
