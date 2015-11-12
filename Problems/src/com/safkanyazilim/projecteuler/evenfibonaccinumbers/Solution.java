package com.safkanyazilim.projecteuler.evenfibonaccinumbers;

import java.math.BigInteger;
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
         while (second.compareTo(number) <= 0) {
             if (second.mod(new BigInteger("2")).compareTo(BigInteger.ZERO) == 0) {
                 evenSum = evenSum.add(second);
             }
             swap = new BigInteger(second.toString());
             second = second.add(first);
             first = new BigInteger(swap.toString());
             
            
         }
         
         return evenSum.toString();
	}

}
