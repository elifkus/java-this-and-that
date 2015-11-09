package com.safkanyazilim.twostrings;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;


/**
 * Solution for https://www.hackerrank.com/challenges/two-strings
 * @author elif
 *
 */
public class Solution {
	public static void main(String[] args) {
		
		
		
		try (Scanner scanner = new Scanner(System.in)) { 
			int numberOfTestCases = scanner.nextInt();
			
			for(int i=0; i<numberOfTestCases; i++) {
				String str1 = scanner.next();
				String str2 = scanner.next();
				
				if (findCommonLetter(str1, str2)) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		}
		
	}

	public static boolean findCommonLetter(String str1, String str2) {
		boolean success = false;
		
		if (str1 == null || str2 == null || str1.length() < 1 || str2.length() < 1) {
			return success;
		}
		
		Set<Character> set = str1.chars().mapToObj(e->(char)e).collect(Collectors.toSet());
		
		List<Character> str2List = str2.chars().mapToObj(e->(char)e).collect(Collectors.toList());

		
		for (Character item : str2List) {
			if (set.contains(item)) {
				return true;
			}
		}
		
		return success;
	}
	
	public static boolean findCommonLetterFaster(String str1, String str2) {
		
		if (str1 == null || str2 == null || str1.length() < 1 || str2.length() < 1) {
			return false;
		}
		
		int[] charArray = new int[26];
		
		char[] str1Arr = str1.toCharArray();
		
		for(int i=0;i<str1Arr.length;i++){
			charArray[str1Arr[i] - 'a'] += 1; 
		}
		
		for (int i=0;i<str2.length();i++) {
			if (charArray[str2.charAt(i) - 'a'] > 0) {
				return true;
			}
		}
		
		return false;
	}

public static boolean findCommonLetterEvenFaster(String str1, String str2) {
		
		if (str1 == null || str2 == null || str1.length() < 1 || str2.length() < 1) {
			return false;
		}
		
		boolean[] charArray = new boolean[26];
		
		char[] str1Arr = str1.toCharArray();
		
		for(int i=0;i<str1Arr.length;i++){
			charArray[str1Arr[i] - 'a'] = true; 
		}
		
		for (int i=0;i<str2.length();i++) {
			if (charArray[str2.charAt(i) - 'a']) {
				return true;
			}
		}
		
		return false;
	}
}
