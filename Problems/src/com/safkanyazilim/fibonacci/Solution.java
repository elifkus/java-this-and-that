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

	public static int calculateFibonacciAnalytically(int n) {
		int fibonacci;
		if (n == 0 || n == 1) {
			fibonacci = n;
		} else if (n == 2){
			fibonacci = 1;
		} else {
			fibonacci = (int)((1d/Math.sqrt(5d)) * Math.pow(((1+ Math.sqrt(5d))/2),n) - (1/Math.sqrt(5))* Math.pow(((1- Math.sqrt(5d))/2),n));
		}
		
		return fibonacci;
	}
	
	
}
