package com.safkanyazilim.projecteuler.evenfibonaccinumbers;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Solution for https://www.hackerrank.com/contests/projecteuler/challenges/euler002/
 * @author elif
 *
 */
public class Solution {
	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) { 
			int numberOfTestCases = scanner.nextInt();
			
			for(int k=0; k<numberOfTestCases; k++) {
				String str1 = scanner.next();
				
				String result = findSumOfEvenTerms(str1);
				
				System.out.println(result);
			}
	
		}
		
	}
	
	public static String findSumOfEvenTerms(String n) {
		 BigInteger number = new BigInteger(n);
         
         BigInteger first = BigInteger.ONE;
         BigInteger second = new BigInteger("2");
         BigInteger evenSum = BigInteger.ZERO;
         BigInteger swap = BigInteger.ZERO;
         
         boolean[] evenOrOdd = {true, false, false};
         int counter = 0;
         
         while (second.compareTo(number) <= 0) {
             if (evenOrOdd[(counter % 3)]) {
                 evenSum = evenSum.add(second);
             }
             swap = second;
             second = second.add(first);
             first = swap;
             
             counter++;
            
         }
         
         return evenSum.toString();
	}

}
