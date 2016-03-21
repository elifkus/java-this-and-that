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
	
	public static int calculateFibonacciWithLoop(int n) {
		int fibonacci;
		if (n == 0 || n == 1) {
			fibonacci = n;
		} else {
			int previous = 0;
			fibonacci = 1;
			int temp;
			
			for (int i=2; i<=n; i++) {
				temp = fibonacci;
				fibonacci +=  previous;
				previous = temp;
			}
		}
		
		return fibonacci;
	}

	
	
}
