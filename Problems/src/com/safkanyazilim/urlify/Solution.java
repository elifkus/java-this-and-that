package com.safkanyazilim.urlify;


/**
 * Solution for <insert problem url>
 * @author elif
 *
 */
public class Solution {
	public static String urlify(String str, int length) {
		if (length == 0 || str.length() == 0) {
			return "";
		}
		
		char[] strArray = str.toCharArray();
		
		int countOfInBetweenSpace = 0;
		
		for (int i=0; i<length; i++) {
			if (strArray[i] == ' ') {
				countOfInBetweenSpace++;
			}
		}
		
		int newLength = length + 2 * countOfInBetweenSpace;
		
		int newStringIndex = newLength-1;
		
		for (int i=length-1; i>=0; i--) {
			if (strArray[i] == ' ') {
				strArray[newStringIndex] = '0';
				newStringIndex--;
				strArray[newStringIndex] = '2';
				newStringIndex--;
				strArray[newStringIndex] = '%';
				newStringIndex--;
			} else {
				strArray[newStringIndex] = strArray[i];
				newStringIndex--;
			}
		}
		
		return new String(strArray);
	}	

}
