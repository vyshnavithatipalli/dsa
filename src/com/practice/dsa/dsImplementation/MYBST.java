package com.practice.dsa.dsImplementation;

import java.util.ArrayList;
import java.util.List;

public class MYBST {
	 static class BST {
	        private Node root;

	        public BST() {
	            this.root = null;
	        }

	        public void put(int value) {
	            root = put(root, value);
	        }

	        private Node put(Node node, int value) {
	            if (node == null) {
	                return new Node(value);
	            }
	            if (value < node.val) {
	                node.left = put(node.left, value);
	            } else if (value > node.val) {
	                node.right = put(node.right, value);
	            }
	            return node;
	        }

	        public boolean contains(int value) {
	            return contains(root, value);
	        }

	        private boolean contains(Node node, int value) {
	            if (node == null) {
	                return false;
	            }
	            if (value == node.val) {
	                return true;
	            }
	            return value < node.val ? contains(node.left, value) : contains(node.right, value);
	        }

	        public List<Integer> inOrderTraversal() {
	            List<Integer> acc = new ArrayList<>();
	            inOrderTraversal(root, acc);
	            return acc;
	        }

	        private void inOrderTraversal(Node node, List<Integer> acc) {
	            if (node == null) {
	                return;
	            }
	            inOrderTraversal(node.left, acc);
	            acc.add(node.val);
	            inOrderTraversal(node.right, acc);
	        }

	        private static class Node {
	            Integer val;
	            Node left, right;

	            Node(int val) {
	                this.val = val;
	                this.left = null;
	                this.right = null;
	            }

				@Override
				public String toString() {
					return "Node [val=" + val + ", left=" + left + ", right=" + right + "]";
				}
	            
	        }

			@Override
			public String toString() {
				return "BST [root=" + root + "]";
			}
	        
	        
	    }

	    public static void testBST() {
	        BST searchTree = new BST();
	        searchTree.put(3);
	        searchTree.put(1);
	        searchTree.put(2);
	        searchTree.put(5);
	        
	        
	       System.out.println(searchTree);
	    }
	    

	   

	    public static void main(String[] args) {
	        testBST();
	    }
}
