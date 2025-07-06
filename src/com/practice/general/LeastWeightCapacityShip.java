package com.practice.general;

public class LeastWeightCapacityShip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * You are given a cargo ship you need to ship few packages in d-days, you are
		 * given weights of each item. Retrun the least weight capacity to ship the
		 * packages within d-days. wt = [1,2,3,4,5,6,7,8,9,10] d = 5 output : 15 wt =
		 * [3,2,2,4,1,4] d = 3 output : 6
		 */
		int[] wt = {1,2,3,4,5,6,7,8,9,10};
        int d = 5;
				int weight=getRes(wt,d);
			System.out.println(weight);	
		
	}

	private static int getRes(int[] wt, int d) {
		// TODO Auto-generated method stub
		int low=0,high=0;
		for(int i=0;i<wt.length;i++) {
			high+=wt[i];
			low=Math.max(low, wt[i]);
				
		}
		int mid=0;
	
		while(low<high) {
			mid=(low+high)/2;
			if(canShip(mid,wt,d)) {
				high=mid;
			}
			else
				low=mid+1;
		}
		return low;
	}

	private static boolean canShip(int mid,int[] wt,int days) {
		
		// TODO Auto-generated method stub
		int day=1;
		int currentsum=0;
		for(int i=0;i<wt.length;i++) {
			
			if(currentsum+wt[i]>mid) {
				day++;
				currentsum=0;
			}
			
				currentsum+=wt[i];
			
		}
			
		return day<=days;
	}

}
