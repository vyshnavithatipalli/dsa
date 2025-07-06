package com.practice.general;

import java.util.ArrayList;
import java.util.List;

/*Given a binary tree, find all paths from root to leaves (leftmost path to rightmost path)
*/	 
	class Solution {
		public static class TreeNode {
		      int val;
		      TreeNode left;
		     TreeNode right;
		      TreeNode() {}
		      TreeNode(int val) { this.val = val; }
		      TreeNode(int val, TreeNode left, TreeNode right) {
		         this.val = val;
		         this.left = left;
		         this.right = right;
		     }
		 }
		public static void main(String[] args) {
			TreeNode root=new TreeNode(1);
			 
		        root.left = new TreeNode(2);
		        root.right = new TreeNode(3);
		        root.left.right = new TreeNode(5);

		     
		       

		       
			
			List<String> res=binaryTreePaths(root);
			System.out.println(res);
			
		}
	    public static List<String> binaryTreePaths(TreeNode root) {
	    	
	    	List<String> list=new ArrayList<>();
	    	if(root!=null)
	    		dfs(root,"",list);
			return list;
	    	
			
	        
	    }



private static void dfs(TreeNode root, String path, List<String> list) {
			// TODO Auto-generated method stub
			if(root==null) {
				return;
			}
			path+=root.val;
			if(root.left==null && root.right==null) {
				list.add(path);
			}
			path+="->";
			dfs(root.left,path,list);
			dfs(root.right,path,list);
		}




	}

