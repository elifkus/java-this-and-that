package com.safkanyazilim.sample;

import java.util.Scanner;

/**
 * Solution for <insert problem url>
 * @author elif
 *
 */
public class Solution {
	public static void main(String[] args) {
		
		String[] inputArray = readInput();
		
		
	}
	
	private static String[] readInput() {
		int numberOfTestCases;
		String[] inputArray;
		
		try (Scanner scanner = new Scanner(System.in)) { 
			numberOfTestCases = scanner.nextInt();
			inputArray = new String[numberOfTestCases];
			
			for(int i=0; i<inputArray.length; i++) {
				inputArray[i] = scanner.next();
			}
		}
		
		return inputArray;
	}

}
