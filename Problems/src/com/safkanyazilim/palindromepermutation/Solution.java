package com.safkanyazilim.palindromepermutation;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {

	public static boolean isPermutationOfAPalindrome1(String text) {
		HashSet<Character> set = new HashSet<>();
		
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (Character.isLetter(c)) {
				c = Character.toLowerCase(c);
				
				//if (!set.remove(c)) {
				//	set.add(c);
				//}
				
				if (!set.add(c)) {
					set.remove(c);
				}
			}
		}
		
		
		return set.size() < 2;
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
		
		return !midCharacterExists || index != (textCharArray.length-1);
	}
    
	public static boolean isPermutationOfAPalindrome3(String text) {
		int counter = 0;
		int base = (int)'a';

		
		for (int i = 0; i < text.length(); i++) {
			int offset = (int)text.charAt(i) - base;
			
			if (offset >= 0) {
				counter ^= 1 << offset;
			}
		} 	
		
		return ((counter == 0) || (counter & (counter - 1)) == 0);
	}
}
