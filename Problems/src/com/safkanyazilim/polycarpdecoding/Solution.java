package com.safkanyazilim.polycarpdecoding;

import java.util.Scanner;

/**
 * Solution for http://codeforces.com/problemset/problem/746/B
 * @author elif
 *
 */
public class Solution {
	public static void main(String[] args) {
			
		try (Scanner scanner = new Scanner(System.in)) { 
			int numberOfTestCases = scanner.nextInt();
			
			for(int k=0; k<numberOfTestCases; k++) {
				//String str1 = scanner.next();
				
			}
	
		}		
		
	}	
	
	public static String decodePolyCarp(String encodedWord){
		char[] decodedArray = new char[encodedWord.length()]; 
		
		boolean even = (encodedWord.length() % 2) == 0;
		
		int midIndex;
		int diff = 1;
		int signMultiplier = -1;
		
		
		if (even) {
			midIndex = (encodedWord.length() / 2) -1;
		} else {
			midIndex = encodedWord.length() / 2;
			diff = -1;
		}
		
		int index = midIndex; 
		decodedArray[index] = encodedWord.charAt(0);
		
		for (int i=1; i<encodedWord.length(); i++) {
			
			index = midIndex + diff;
			decodedArray[index] = encodedWord.charAt(i);
			
			if (even) {
				diff -= (i+1) & 1; 
			} else {
				diff += (i+1) & 1;
			}
			
			diff *=  signMultiplier;
			
		}
		
		//System.out.println("");
		return new String(decodedArray);
	}
	
	
	public static String decodePolyCarp2(String s) {
		 for (int i = s.length() - 1; i >= 0; i--){
			  //System.out.println(s.substring(i, s.length()));
		      s = s.substring(0, i) + makeFirstToMedian(s.substring(i, s.length()));
		      //System.out.println(s);
		  }
		 return s;
	}

	private static String makeFirstToMedian(String chars) {
	    int median = (chars.length() - 1) / 2;
	    StringBuilder b = new StringBuilder(chars);
	
	    char c = chars.charAt(0);
	
	    b.deleteCharAt(0);
	    b.insert(median, c);
	
	    return b.toString();
  }
	
	

}
