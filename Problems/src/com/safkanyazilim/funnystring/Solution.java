package com.safkanyazilim.funnystring;

import java.util.Scanner;

/**
 * Solution for <insert problem url>
 * @author elif
 *
 */
public class Solution {
	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) { 
			int numberOfTestCases = scanner.nextInt();
			
			for(int k=0; k<numberOfTestCases; k++) {
				String str1 = scanner.next();
				if (isFunnyString(str1)) {
					System.out.println("Funny");
				} else {
					System.out.println("Not Funny");
				}
			}
	
		}
	}	
	
	public static boolean isFunnyString(String str) {
		
		char[] arr = str.toCharArray();
		
		for(int i=1; i<arr.length-1; i++) {
			if (Math.abs(arr[i] -arr[i-1]) != Math.abs(arr[arr.length-i] -arr[arr.length-i-1])) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean isFunnyStringFaster(String str) {
		
		for(int i=1; i<str.length()-1; i++) {
			if (Math.abs(str.codePointAt(i) -str.codePointAt(i-1)) != Math.abs(str.codePointAt(str.length()-i) -str.codePointAt(str.length()-i-1))) {
				return false;
			}
		}
		
		return true;
	}

}
