package com.safkanyazilim.groupanagrams;

import java.util.List;

public class Solution {

	public static void groupAnagramStringsInList(List<String> stringList) {
		stringList.sort(new AnagramComparator());
	}
	
	

}
