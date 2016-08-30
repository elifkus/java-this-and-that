package com.safkanyazilim.sortedsearchnosize;

public class Solution {
	
	public static int findIndex1(Listy listy, int number) {
		if (listy.elementAt(0) > number) {
			return -1;
		} 
		
		int start = 0;
		int end = 2;
		
		while(start < end) {
			if (listy.elementAt(end) >= number) {
				return binarySearch(listy, start, end, number);
			} else if (listy.elementAt(end) < 0) {
				end = start + (end - start)/2;
			} else {
				start = end;
				end = end*2;
			}
		}
		
		return -1;
	}
	
	private static int binarySearch(Listy listy, int start, int end, int number) {
		
		while (start <= end) {
			int pivotal = (end + start) / 2;
			if (listy.elementAt(pivotal) == number) {
				return pivotal;
			} else if (listy.elementAt(pivotal) < number) {
				start = pivotal+1;
			} else {
				end = pivotal-1;
			}
		}
		
		return -1;
	}

	public static int findIndex2(Listy listy, int number) {
		int index = 1;
		
		while (listy.elementAt(index) != -1 && listy.elementAt(index) < number) {
			index *= 2;
		}
		
		return binarySearchModified(listy, number, index / 2, index); 
	}
	
	private static int binarySearchModified(Listy listy, int number, int start, int end) {
		
		while (start <= end) {
			int pivotal = (end + start) / 2;
			
			if (listy.elementAt(pivotal) == number) {
				return pivotal;
			} else if (listy.elementAt(pivotal) > number || listy.elementAt(pivotal) < 0) {
				end = pivotal-1;
			} else {
				start = pivotal+1;
			}
		}
		
		return -1;
	}
}
