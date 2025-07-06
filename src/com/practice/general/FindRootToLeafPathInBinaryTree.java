package com.practice.general;

import java.util.ArrayList;
import java.util.List;

public class FindRootToLeafPathInBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Could you write a code solution for the LeetCode problem concerning finding
		 * the root-to-leaf path in a binary tree? What considerations should be kept in
		 * mind while solving this problem?
		 */
		  TreeNode root = new TreeNode(1);
	        root.left = new TreeNode(2);
	        root.right = new TreeNode(3);
	        root.left.right = new TreeNode(5);

	 
	        System.out.println(binaryTreePaths(root)); 
		
	}
	public static List<String> binaryTreePaths(TreeNode root) {
		 List<String> result = new ArrayList<>();
	        if (root != null) {
	            dfs(root, "", result);
	        }
	        return result;
		
		
		
	}
	
	public static void dfs(TreeNode node, String path, List<String> result) {
		if (node.left == null && node.right == null) { // Leaf node
            result.add(path + node.val); // Add path to result
            return;
        }
		
		if (node.left != null) {
            dfs(node.left, path + node.val + "->", result);
        }
        if (node.right != null) {
            dfs(node.right, path + node.val + "->", result);
        }
		
	}

}

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val)
    { this.val = val;
    }
}
