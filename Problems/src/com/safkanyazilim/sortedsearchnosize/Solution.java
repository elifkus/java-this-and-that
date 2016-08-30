package com.safkanyazilim.sortedsearchnosize;

public class Solution {
	
	public static int findIndex(Listy listy, int number) {
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
	
	public static int binarySearch(Listy listy, int start, int end, int number) {
		
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
}
