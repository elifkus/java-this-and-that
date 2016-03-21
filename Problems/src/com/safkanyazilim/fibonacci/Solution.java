package com.safkanyazilim.fibonacci;

import java.util.Scanner;

/**
 * Solution for <insert problem url>
 * @author elif
 *
 */
public class Solution {
	
	public static int calculateFibonacciRecursively(int n) {
		if (n == 0 ) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return calculateFibonacciRecursively(n-1) + calculateFibonacciRecursively(n-2);
		}
		
	}
	

	
	
}
