package com.safkanyazilim.rotation;

public class Solution {

	public static boolean isRotation(String first, String second) {
		
		int length = first.length();
		
		if (length != second.length()) {
			return false;
		}
		
		int index = 0;
		int indexRotated = 0;

		while (index < length) {
			if (index == 0 && indexRotated >= length) {
				return false;
			}
		
			if (first.charAt(index) == second.charAt((indexRotated % length))) {
				index++;
				indexRotated++;
			} else {
				indexRotated = indexRotated - index + 1;
				index = 0;
			}
		}
		
		return true;
	}

}
