package com.java.day121023;

import java.util.HashMap;
import java.util.Map;

public class CountOccurHashMap {
	
	public static void main(String[] args) {
        String quote = "KEEP MOVING FORWARD AND IF IT'S TIME TO GO"
        + " IT'S TIME";
        
        String[] words = quote.split(" ");
        
        //store the value in key value pair
        //word is stored in key and occurance of word is stored in value
        Map<String, Integer> wordCount = new HashMap();
        
        //traverse the array through foreach loop
        //while traversing store the value in map
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
         
        
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            System.out.println("------------");
        }
    }

}
