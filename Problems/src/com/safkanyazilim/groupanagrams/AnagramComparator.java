package com.safkanyazilim.groupanagrams;

import java.util.Arrays;
import java.util.Comparator;

public class AnagramComparator implements Comparator<String> {

	@Override
	public int compare(String str1, String str2) {
		char[] strArr1 = str1.toCharArray();
		char[] strArr2 = str2.toCharArray();
		
		Arrays.sort(strArr1);
		Arrays.sort(strArr2); 
		
		return Arrays.equals(strArr1, strArr2) ? 0 : -1;
	}
	

}
