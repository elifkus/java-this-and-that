package com.safkanyazilim.romannumerals;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testIntegerToRomanNumerals1() {
		int number=1000;
		String expected = "M";
		assertEquals(expected, Solution.integerToRomanNumerals(number));
	}
	
	@Test
	public void testIntegerToRomanNumerals2() {
		int number=3;
		String expected = "III";
		assertEquals(expected, Solution.integerToRomanNumerals(number));
	}
	
	@Test
	public void testIntegerToRomanNumerals3() {
		int number=9;
		String expected = "IX";
		assertEquals(expected, Solution.integerToRomanNumerals(number));
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
	
	

}
