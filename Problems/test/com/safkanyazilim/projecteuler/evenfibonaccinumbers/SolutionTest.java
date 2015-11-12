package com.safkanyazilim.projecteuler.evenfibonaccinumbers;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testFindSumOfEvenTerms() {
		String item1 = "10";
		String expected = "10";
		
		assertEquals(expected, Solution.findSumOfEvenTerms(item1));
		
		item1 = "100";
		expected = "44";
		assertEquals(expected, Solution.findSumOfEvenTerms(item1));
		
	}

	@Test
	public void testSpeedForFindCommonLetter() {
		String[] items = {"aabbabab",
						  "aba",
						  "sdasdfasdf",
						  "yhohksdf",
						  "hjhjhhjj",
						  "asdfafff",
						  "ijkjkkkk",
						  "asdffdsa",
						  "akkaakka",
						  "kitapcinin",
						  "aabbcbab",
						  "aba",
						  "sdasddasds",
						  "yjohmsdf",
						  "hjljhljj",
						  "asdfaaff",
						  "ijkjkakk",
						  "aslfflsa",
						  "fknafkna",
						  "kitaplinin"};
		
		long start = System.currentTimeMillis();
		
		for(int j=0; j<1000000; j++) {
			for (int i = 0; i<10; i=i+2) {
				//Solution.findCommonLetter(items[i], items[i+1]);
			}
		}
		
		long end = System.currentTimeMillis();
		
		long elapsedTime = end-start;
		
		System.out.println("Total time elapsed 1: "+ String.valueOf(elapsedTime));
		
	}
	
	@Test
	public void testFindSumOfEvenTermsFaster() {
		String item1 = "10";
		String expected = "10";
		
		assertEquals(expected, Solution.findSumOfEvenTermsFaster(item1));
		
		item1 = "100";
		expected = "44";
		assertEquals(expected, Solution.findSumOfEvenTermsFaster(item1));
		
	}

}
