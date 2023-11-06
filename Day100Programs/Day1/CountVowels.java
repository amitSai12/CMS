package com.java.day111023;

	public class CountVowels {
	    public static void main(String[] args) {
	        String text = "Powerful people places come from powerful places";
	        int vowelCount = 0;
	        System.out.println(text.length());

	        for (int i = 0; i < text.length(); i++) {
	            char c = Character.toLowerCase(text.charAt(i));
	            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
	                ++vowelCount;
	            }
	        }

	        System.out.println("Vowel count: " + vowelCount);
	       
	    }
	}

