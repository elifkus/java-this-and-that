package com.safkanyazilim.letterislands;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Solution for https://www.hackerrank.com/challenges/letter-islands
 * @author elif
 *
 */
public class Solution {
	public static void main(String[] args) {
			
		try (Scanner scanner = new Scanner(System.in)) { 
			
				String str1 = scanner.next();
				int noOfIslands = scanner.nextInt();
			
				int result = findNoOfSubstringsThatMakeNIslands(str1, noOfIslands);
				System.out.println(result);
			
	
		}		
		
	}	
	
	public static int findNoOfSubstringsThatMakeNIslands(String str, int n) {
		
		int lengthToCheck = (str.length() % 2 != 0) ? (str.length()/2) : (str.length()/2 - 1);
		int satisfyingSubstring  = 0;
		
		HashSet<String> set = new HashSet<String>();
		
		while (lengthToCheck > 0) {
			
			int index = 0;
			
			while (index < str.length() - lengthToCheck + 1) {
				String sub = str.substring(index, index + lengthToCheck);
				
				if (!set.contains(sub)) {
					if (checkIfSubstringMakesNIslands(str, sub, n)) {
						satisfyingSubstring++;
					};
					set.add(sub);
				}
				
				index++;
			}
			
			
			lengthToCheck--;
		}
		
		return satisfyingSubstring;
	}
	
	private static boolean checkIfSubstringMakesNIslands(String str, String sub, int n) {
		int countOfIsland = 0;
		boolean inIslandFlag = false;
		
		for(int i=0; i<str.length()-sub.length() + 1; i++) {
			if (sub.equals(str.substring(i,i+sub.length()))) {
				i = i+sub.length()-1;
				
				if (!inIslandFlag) {
					countOfIsland++;
				}
				
				inIslandFlag = true;
			} else {
				inIslandFlag = false;
			}
		}
		
		
		return countOfIsland == n;
	}

}
