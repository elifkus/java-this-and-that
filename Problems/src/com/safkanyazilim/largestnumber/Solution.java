package com.safkanyazilim.largestnumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Solution for https://www.interviewbit.com/problems/largest-number/
 * @author elif
 *
 */

public class Solution {
    
	public static String largestNumber1(final List<Integer> a) {
	    List<String> numbers = new ArrayList<String>(a.size());
	    int sum = 0;
	    
	    for (Integer n : a) {
	        numbers.add(n.toString());
	        sum += n;
	    }
	    
	    if (sum < 1) {
	        return "0";
	    }
	    
	    Collections.sort(numbers);
	    Collections.reverse(numbers);
	    
	    for (int i=0; i<numbers.size()-1; i++) {
	        if (numbers.get(i).charAt(0) == numbers.get(i+1).charAt(0) && numbers.get(i).length() != numbers.get(i+1).length()) {
                if (!compareNumberStringsWithSameBeginning(numbers.get(i),numbers.get(i+1))) {
                    String swap = numbers.get(i);
                    numbers.set(i, numbers.get(i+1));
                    numbers.set(i+1, swap);
                }
	        }
	    }
	    
	    return String.join("", numbers);
	}


	private static boolean compareNumberStringsWithSameBeginning(String a, String b) {
	    int index = 0;
	    int size = a.length() < b.length() ? a.length() : b.length();
	    char aChar = '0';
	    char bChar = '0';
	    
	    while (index < size && a.charAt(index) == b.charAt(index)) {
	        aChar = a.charAt(index);
	        bChar = b.charAt(index);
	        index++;
	    }
	    
	    if (a.length() > b.length()) {
	        aChar = a.charAt(index);
	    } else {
	        bChar = b.charAt(index);
	    }
	    
	    return aChar > bChar;
	}
	
	public static String largestNumber2(final List<Integer> a) {
	    int sum = 0;
	    
	    for (Integer n : a) {
	        sum += n;
	    }
	    
	    if (sum < 1) {
	        return "0";
	    }
	    

	    ArrayList<NumberWithString> list = new ArrayList<>(a.size());
	    
	    for (Integer i : a) {
	    	list.add(new NumberWithString(i));
	    }
	    
	    Collections.sort(list); 
	    
	    

	    return String.join("", list);
	    
	}

}
