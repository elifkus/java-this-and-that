package com.safkanyazilim.lovelettermistery;

import java.util.Scanner;

/**
 * Solution for https://www.hackerrank.com/challenges/the-love-letter-mystery
 * @author elif
 *
 */
public class Solution {
	public static void main(String[] args) {
			
		try (Scanner scanner = new Scanner(System.in)) { 
			int numberOfTestCases = scanner.nextInt();
			
			for(int k=0; k<numberOfTestCases; k++) {
				String str = scanner.next();
				int changes = 0;
				
				for (int i=0; i<(str.length()/2); i++) {
					changes+= Math.abs(str.charAt(i)-str.charAt(str.length()-1-i));
				}
				
				System.out.println(changes);
			}
		}
		
	}	

}
