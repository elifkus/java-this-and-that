package com.safkanyazilim.oneawaystring;

public class Solution {

	public static boolean areStringsOneAway1(String firstString, String secondString) {
		int len1 = firstString.length();
		int len2 = secondString.length();
		
		if (Math.abs(len2-len1) > 1) {
			return false;
		}
		
		boolean singleDifference = false;
		
		int index1 = 0;
		int index2 = 0;
		
		while (index1 < len1 && index2 < len2) {
			if (firstString.charAt(index1) == secondString.charAt(index2)) {
				index1++;
				index2++;
			} else if (!singleDifference) {
				singleDifference = true;
				if (index2 < len2 && firstString.charAt(index1) == secondString.charAt(index2+1)) {
					index1++;
					index2 += 2;
				} else if (index1 < len1 && firstString.charAt(index1+1) == secondString.charAt(index2))  {
					index1 += 2;
					index2++;
				} else {
					index1++;
					index2++;
				}
			} else {
				return false;
			}
		}
		
		if (!singleDifference && Math.abs(len1-len2) == 1) {
			singleDifference = true;
		}
		
		return singleDifference;
	}
	
	public static boolean areStringsOneAway2(String firstString, String secondString) {
		
		return false;
	}
	

}
