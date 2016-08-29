package com.safkanyazilim.groupanagrams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Solution {

	public static void groupAnagramStringsInList1(List<String> stringList) {
		stringList.sort(new AnagramComparator());
	}
	
	public static void groupAnagramStringsInList2(List<String> stringList) {
		HashMap<String,List<String>> map =  new HashMap<String, List<String>>();
	
		for (String item : stringList) {
			char[] itemArr = item.toCharArray();
			Arrays.sort(itemArr);
			String sorted = new String(itemArr);
			List<String> list = map.get(sorted);
			
			if (list == null) {
				list = new LinkedList<String>();
				map.put(sorted, list);
			}
			
			list.add(item);
		}
		
		stringList.clear();
		
		for (String sorted : map.keySet()) {
			List<String> anagramGroup = map.get(sorted);
			
			for (String item : anagramGroup) {
				stringList.add(item);
			}
		}
	}


}
