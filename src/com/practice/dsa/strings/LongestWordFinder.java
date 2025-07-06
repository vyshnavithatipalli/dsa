package com.practice.dsa.strings;
import java.util.*;
class Dictionary {
    private Set<String> words;
    
    public Dictionary(String[] wordArray) {
        words = new HashSet<>(Arrays.asList(wordArray));
    }

    public Set<String> getWords() {
        return words;
    }
}

public class LongestWordFinder {

	

	    public static Set<String> longestWord(String letters, Dictionary dictionary) {
	        // Step 1: Count available letter frequencies
	        Map<Character, Integer> letterCount = new HashMap<>();
	        for (char ch : letters.toCharArray()) {
	            letterCount.put(ch, letterCount.getOrDefault(ch, 0) + 1);
	        }

	        Set<String> longestWords = new HashSet<>();
	        int maxLength = 0;
	        
	        System.out.println(letterCount);

	        // Step 2: Check each word in the dictionary
	        for (String word : dictionary.getWords()) {
	            if (canFormWord(word, letterCount)) {
	                if (word.length() > maxLength) {
	                    maxLength = word.length();
	                    longestWords.clear();  // Found a longer word, reset the set
	                }
	                if (word.length() == maxLength) {
	                    longestWords.add(word);
	                }
	            }
	        }

	        return longestWords;
	    }

	    private static boolean canFormWord(String word, Map<Character, Integer> letterCount) {
	        // Create a temporary frequency map for the word
	        Map<Character, Integer> wordCount = new HashMap<>();
	        for (char ch : word.toCharArray()) {
	            wordCount.put(ch, wordCount.getOrDefault(ch, 0) + 1);
	        }
//System.out.println("word count"+wordCount);
	        // Check if the word can be formed
	        for (char ch : wordCount.keySet()) {
	            if (wordCount.get(ch) > letterCount.getOrDefault(ch, 0)) {
	                return false;  // Not enough letters available
	            }
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        Dictionary dict = new Dictionary(new String[]{"eot","to", "toe", "toes", "doe", "dog", "god", "dogs", "book", "banana"});
	        System.out.println(longestWord("toe", dict));     // Output: ["toe"]
	        //System.out.println(longestWord("oetdg", dict));   // Output: ["doe", "toe", "dog", "god"]
	        //System.out.println(longestWord("abcdef", dict));  // Output: []
	    }
	}


