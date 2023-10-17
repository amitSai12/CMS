package com.java.reg;

import java.util.regex.Pattern;

public class RegEx1 {
	
	public static void main(String[] args) {
		
		System.out.println(Pattern.matches(".h","ch")); 
		//checks if the char is present or not (checking for 'h' at 2nd place)
		System.out.println(Pattern.matches("..f..i..","infinite"));
		
		System.out.println("--------------------------------------------");
		
		System.out.println(Pattern.matches("[aeiou]","a"));
		//checks if the char 'a' is present in the string or not 
		System.out.println(Pattern.matches("[aeiou]","s"));
		
		System.out.println("--------------------------------------------");
		
		System.out.println(Pattern.matches("[^aeiou]","a"));
		//checks if the char 'a' is not present in the string
		System.out.println(Pattern.matches("[^aeiou]","s"));
		
		System.out.println("--------------------------------------------");
		
		System.out.println(Pattern.matches("[abcd]+","abccdddd"));
		//any no.of occurrences in the String 
		System.out.println(Pattern.matches("[a-zA-Z]+","Prasanna"));
		//a to z limitation
		System.out.println(Pattern.matches("[a-zA-Z]+","Prasanna123"));
		
		System.out.println("-- Validate mobile No --");
		
		System.out.println(Pattern.matches("[0-9]{10}","7008402210"));
		//[0-9] : number limitations ; {10} : digit limitations
		System.out.println(Pattern.matches("[0-9]{10}","7022101"));
		System.out.println(Pattern.matches("[0-9]{10}","ABCD1234"));
		System.out.println("\n");
		
		System.out.println("-- Adhar Number --");
		
		System.out.println(Pattern.matches("[0-9]{4}\\s[0-9]{4}\\s[0-9]{4}","6016 1949 9801"));
		System.out.println(Pattern.matches("[0-9]{4}s[0-9]{4}s[0-9]{4}","601619499801"));
		System.out.println("\n");
		
		System.out.println("-- Phone No Country Code --");
		
		System.out.println(Pattern.matches("[+][9][1]-[0-9]{10}","+91-9937569630"));
		System.out.println(Pattern.matches("[+][9][1]-[0-9]{10}","+91993769630"));
		System.out.println("\n");
		
		System.out.println("----------------------------------------------------------");
		System.out.println(Pattern.matches("\\d{5}", "12345"));
		System.out.println(Pattern.matches("\\d{5}", "123645"));
		//checks the number only with fixed digit {5} : //d
		System.out.println(Pattern.matches("\\D+", "12345"));
		System.out.println(Pattern.matches("\\D+", "ABC$%#@"));
		//checks the characters only with chars : //D and '+' for n no.of characters
		System.out.println(Pattern.matches("\\D+", "AB1C$%#@"));
		System.out.println("\n");
		
		System.out.println("----------------------------------------------------------");
		
		System.out.println(Pattern.matches("\\S+","Hi How")); //if space : false
		System.out.println(Pattern.matches("\\S+","HiHow")); //if no space : true
		System.out.println("\n");
		
		
		System.out.println("-- Password --");
		
		String regex = "^(?=.*[0-9])"
						+"(?=.*[a-z])(?=.*[A-Z])"
						+"(?=.*[@#$^%&+=])"
						+"(?=.\\S+$).{8,20}";
						
		System.out.println(Pattern.matches(regex, "Am@12$assss"));
		
		  String regex1 = "^(?=.*[0-9])"
	                + "(?=.*[a-z])(?=.*[A-Z])"
	                + "(?=.*[@#$%^&+=])"
	                + "(?=\\S+$).{8,20}";
		  
	        System.out.println(Pattern.matches(regex1, "Prasanna@1"));
	    	System.out.println(Pattern.matches(regex1, "Am@12$assss"));
		
	}

}
