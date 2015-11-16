package com.safkanyazilim.funnystring;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testIsFunnyString() {
		String item1 = "acxz";
		boolean expected = true;	
		assertEquals(expected, Solution.isFunnyString(item1));
		
		item1 = "bcxz";
		expected = false;
		assertEquals(expected, Solution.isFunnyString(item1));
	}

	@Test
	public void testSpeedForIsFunnyString() {
		String[] items = {"aabbabab",
							"acxz",
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
				Solution.isFunnyString(items[i]);
			}
		}
		
		long end = System.currentTimeMillis();
		
		long elapsedTime = end-start;
		
		System.out.println("Total time elapsed 1: "+ String.valueOf(elapsedTime));
		
	}
	
	@Test
	public void testIsFunnyStringFaster() {
		String item1 = "acxz";
		boolean expected = true;	
		assertEquals(expected, Solution.isFunnyStringFaster(item1));
		
		item1 = "bcxz";
		expected = false;
		assertEquals(expected, Solution.isFunnyStringFaster(item1));
	}

	@Test
	public void testSpeedForIsFunnyStringFaster() {
		String[] items = {"aabbabab",
							"acxz",
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
				Solution.isFunnyStringFaster(items[i]);
			}
		}
		
		long end = System.currentTimeMillis();
		
		long elapsedTime = end-start;
		
		System.out.println("Total time elapsed 2: "+ String.valueOf(elapsedTime));
		
	}

}
