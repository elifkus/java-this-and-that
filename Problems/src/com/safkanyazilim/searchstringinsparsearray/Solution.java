package com.safkanyazilim.searchstringinsparsearray;

public class Solution {
	public static int findStringInSparseArray(String[] array, String str) {
		
		int start = 0;
		int end = str.length();
		
		while (start <= end) {
			int pivot = (start + end) / 2;
			int direction = 1;
			int offset = 1; 
			
			while (array[pivot].isEmpty() && (pivot >= start && pivot <= end)) {
				pivot = pivot + offset * direction;
				direction = direction * -1;
				offset = Math.abs(offset)+1;
			}
			
			if (str.equals(array[pivot])) {
				return pivot;
			} else if (str.compareTo(array[pivot]) > 0) {
				start = pivot+1;
			} else {
				end = pivot -1;
			}
		}
		
		return -1;
	}
}
