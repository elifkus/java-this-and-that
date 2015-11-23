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
		
		int lengthToCheck = str.length() / n;
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
	
	public static boolean checkIfSubstringMakesNIslands(String str, String sub, int n) {
		int countOfIsland = 0;
		boolean inIslandFlag = false;
		int lastInIslandIndex = 0;
		for(int i=0; i<str.length()-sub.length() + 1; i++) {
			if (sub.equals(str.substring(i,i+sub.length()))) {

				if (!inIslandFlag) {
					//System.out.println(i);
					countOfIsland++;
					
					if (countOfIsland > n) {
						break;
					}
				}
				
				lastInIslandIndex = i+sub.length()-1;
				inIslandFlag = true;
			} else if (i > lastInIslandIndex){
				inIslandFlag = false;
			}
		}
		
		/*
		if (countOfIsland == n) {
			System.out.println(sub);
		}
		*/
		return countOfIsland == n;
	}

}
