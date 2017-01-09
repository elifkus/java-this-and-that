package com.safkanyazilim.findunsortedrange;


/**
 * Solution for <insert problem url>
 * @author elif
 *
 */
public class Solution {
	public static int[] findUnsortedSubarrayIndices(int[] unsortedArray) {
		int endOfSortedArrayIndex = 0;
		int endOfUnsortedSubarray = -1;
		int startOfUnsortedSubarray = -1;
		
		for (int i=1; i<unsortedArray.length; i++) {
			if (unsortedArray[i] >= unsortedArray[endOfSortedArrayIndex]) {
				endOfSortedArrayIndex = i;
			} else {
				endOfUnsortedSubarray = i;
				
				if (startOfUnsortedSubarray != 0 && (startOfUnsortedSubarray == -1 || unsortedArray[startOfUnsortedSubarray] > unsortedArray[i]))
				{
					startOfUnsortedSubarray = findIndiceToInsertBinary(unsortedArray, i);	
				}
			}
		}
		
		int[] result;
		
		if (startOfUnsortedSubarray >= 0) {
			result = new int[2];
			result[0] = startOfUnsortedSubarray;
			result[1] = endOfUnsortedSubarray;
		} else {
			result = new int[0];
		}
		
		return result;
	}	
	
	private static int findIndiceToInsert(int[] unsortedArray, int currentIndex) {
		int indexToInsert = currentIndex-1;
		
		while (indexToInsert > 0) {
			if (unsortedArray[indexToInsert] <= unsortedArray[currentIndex]) {
				return indexToInsert+1;
			}
			indexToInsert--;
		}
		
		return indexToInsert;
	}
	
	private static int findIndiceToInsertBinary(int[] unsortedArray, int currentIndex) {
		int minIndex = 0;
		int maxIndex = currentIndex-1;
		int indexToInsert;
		
		while (minIndex <= maxIndex) {
			indexToInsert = (maxIndex + minIndex) / 2;
			if(indexToInsert == 0) {
				return indexToInsert;
			} else if (unsortedArray[currentIndex] >= unsortedArray[indexToInsert] && 
					unsortedArray[currentIndex] < unsortedArray[indexToInsert+1]) {
				return indexToInsert+1;
			} else if (unsortedArray[currentIndex] < unsortedArray[indexToInsert]) {
				maxIndex = indexToInsert;
			} else {
				minIndex = indexToInsert;
			}
		}
		
		return 0;
	}

}
