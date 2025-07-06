package com.practice.general;

public class FindOptimalPath {
	public static void main(String[] args) {
		  Integer[][] grid1 = {
		            {0, 0, 0, 0, 5},
		            {0, 1, 1, 1, 0},
		            {2, 0, 0, 0, 0}
		        };
		        // Expected: 2 + 0 + 1 + 1 + 1 + 0 + 5 = 10
		  System.out.println(optimalPath(grid1));
		        System.out.println(optimalPath(grid1) == 10 ? "Test 1 passed." : "Test 1 failed.");


	}

	private static int optimalPath(Integer[][] grid1) {
		// TODO Auto-generated method stub
		
		int rows=grid1.length;
		int cols=0;
		for(Integer[] grid:grid1) {
			cols=grid.length;
		}
		int dp[][]=new int[rows][cols];
		
		for(int i=rows-1;i>=0;i--) {
			for(int j=0;j<cols;j++) {
				int fromleft=j>0?dp[i][j-1]:0;
				int frombottom=i<rows-1? dp[i+1][j]:0;
				dp[i][j]=Math.max(fromleft, frombottom)+grid1[i][j];
			}
		}
		
		

		return dp[0][cols-1];
	}

}
