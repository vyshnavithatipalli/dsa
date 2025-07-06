package com.practice.dsa.dsImplementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class LargestTreeFinder {
	public static Integer largestTree(final Map<Integer, Integer> immediateParent) {
        // Step 1: Identify all nodes and find roots
        Set<Integer> allNodes = new HashSet<>(immediateParent.keySet());
        Set<Integer> potentialRoots = new HashSet<>(immediateParent.values());
        
        // Roots are nodes that never appear as children
        potentialRoots.removeAll(allNodes);
        
        // Step 2: Build adjacency list representation of the forest
        Map<Integer, List<Integer>> tree = new HashMap<>();
        for (int child : immediateParent.keySet()) {
            int parent = immediateParent.get(child);
            tree.computeIfAbsent(parent, k -> new ArrayList<>()).add(child);
        }
        
        // Step 3: Find the size of each tree using BFS/DFS
        Map<Integer, Integer> treeSizes = new HashMap<>();
        for (int root : potentialRoots) {
            treeSizes.put(root, computeTreeSize(root, tree));
        }
        
        // Step 4: Find the largest tree (smallest ID in case of ties)
        int maxSize = 0;
        int smallestRoot = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : treeSizes.entrySet()) {
            int root = entry.getKey();
            int size = entry.getValue();
            if (size > maxSize || (size == maxSize && root < smallestRoot)) {
                maxSize = size;
                smallestRoot = root;
            }
        }
        
        return smallestRoot;
    }
    
    private static int computeTreeSize(int root, Map<Integer, List<Integer>> tree) {
        int size = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            int node = queue.poll();
            size++;
            if (tree.containsKey(node)) {
                queue.addAll(tree.get(node));
            }
        }
        
        return size;
    }

    public static void main(String[] args) {
        Map<Integer, Integer> immediateParent = new HashMap<>();
        immediateParent.put(1, 2);
        immediateParent.put(3, 4);
        immediateParent.put(5, 2);
        immediateParent.put(6, 4);
        immediateParent.put(7, 4);
        immediateParent.put(4, 2);
        immediateParent.put(8, 4);
        
        
        System.out.println(largestTree(immediateParent)); // Expected output: 2
    }
}
