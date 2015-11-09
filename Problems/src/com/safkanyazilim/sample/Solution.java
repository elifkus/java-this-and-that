package com.safkanyazilim.sample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
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
			
			for(int i=0; i<numberOfTestCases; i++) {
				String item = scanner.next();
				int output = findDifferenceToMakeAnagram(item);
				System.out.println(output);
			}
		}
		
	}
	
	private static int findDifferenceToMakeAnagram(String concatenatedString) {
		
		if ((concatenatedString == null) || (( concatenatedString.length() % 2) != 0)) {
			return -1;
		}
		
		int half = concatenatedString.length() / 2;
		char[] first = concatenatedString.substring(0, half).toCharArray();
		char[] second = concatenatedString.substring(half).toCharArray();
		
		HashMap<Character, Integer> secondMap = new HashMap<Character, Integer>();
		
		for (int i=0; i<second.length; i++) {
			if (!secondMap.containsKey(second[i])) {
				secondMap.put(second[i],1);
			} else {
				int count = secondMap.get(second[i]);
				secondMap.put(second[i], ++count);
			}
		}
		
		int diffCount = 0;
		
		for (int i=0; i<first.length; i++) {
			if (secondMap.containsKey(first[i])) {
				if (secondMap.get(first[i]) == 1) {
					secondMap.remove(first[i]);
				} else {
					int count = secondMap.get(first[i]);
					secondMap.put(first[i], --count);
				}
				continue;
			} else {
				diffCount++;
			}
		}
		
		return diffCount;
	}
	
	

}
