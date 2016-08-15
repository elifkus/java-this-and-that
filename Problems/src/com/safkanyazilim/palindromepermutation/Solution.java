package com.safkanyazilim.palindromepermutation;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {

	public static boolean isPermutationOfAPalindrome1(String text) {
		HashSet<Character> set = new HashSet<>();
		
		char[] textCharArray = text.toCharArray();
		for (char c : textCharArray) {
			if (!Character.isWhitespace(c)) {
				if (set.contains(c)) {
					set.remove(c);
				} else {
					set.add(c);
				}
			}
		}
		
		boolean isPalindromePermutation = true;
		
		if (set.size() > 1) {
			isPalindromePermutation = false;
		} 
		
		return isPalindromePermutation;
	}
	
    public static boolean isPermutationOfAPalindrome2(String text) {
		
		char[] textCharArray = text.toCharArray();
		Arrays.sort(textCharArray);
		
		int index=0;
		boolean midCharacterExists = false;
		
		while (index < (textCharArray.length -1)) {
			if (textCharArray[index] == ' ') {
				index++;
			} else if (textCharArray[index] == textCharArray[index+1]) {
				index += 2;
			} else {
				if (!midCharacterExists) {
					midCharacterExists = true;
					index++;
				} else {
					return false;
				}
			}
		}
		
		if (midCharacterExists == true && index == (textCharArray.length-1)) {
			return false;
		}
		
		return true;
	}
}
