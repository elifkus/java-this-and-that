package com.safkanyazilim.rotatedsortedarraysearch;

//An attempt to solve a problem that I solved before
public class Solution2 {

	public static int findIndexOfIntegerInRotatedArray(int[] array, int number) {
		int start = findMinIndex(array);
		int end = (start - 1) % array.length;
		
		while (array[start] < array[end]) {
			int pivot;
			if (start < end) {
				pivot = start + (end - start)/2;
			} else {
				pivot = (start + ((end + array.length)-start)/2) % array.length;
			}
			
			if (array[pivot] == number) {
				return pivot;
			} else if (array[pivot] < number) {
				start = pivot;
			} else {
				end = pivot;
			}
		}
		
		return -1;
	}
	
	private static int findMinIndex(int[] array) {
		int start = 0;
		int end = array.length-1;
		
		if (array[end] > array[start]) {
			return start;
		}
		
		
		while (start < end) {
			int pivot = (end + start) / 2;

			if (array[pivot] > array[pivot+1]) {
				return pivot+1;
			} else if (array[pivot] < start) {
				end = pivot;
			} else {
				start = pivot;
			}
		}
		
		return -1;
	} 
}
