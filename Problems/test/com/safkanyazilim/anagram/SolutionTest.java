package com.safkanyazilim.anagram;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testfindDifferenceToMakeAnagram() {
		String item = "aabbabab";
		int expected = 0;
		
		assertEquals(expected, Solution.findDifferenceToMakeAnagram(item));
	}

	@Test
	public void testSpeedForFindDifferenceToMakeAnagram() {
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
			for (int i = 0; i<20; i++) {
				Solution.findDifferenceToMakeAnagram(items[i]);
			}
		}
		
		long end = System.currentTimeMillis();
		
		long elapsedTime = end-start;
		
		System.out.println("Total time elapsed 1: "+ String.valueOf(elapsedTime));
		
	}

	@Test
	public void testfindDifferenceToMakeAnagramFaster() {
		String item = "aabbabab";
		int expected = 0;
		
		assertEquals(expected, Solution.findDifferenceToMakeAnagramFaster(item));
	}

	@Test
	public void testSpeedForFindDifferenceToMakeAnagramFaster() {
		String[] items = {"aabbabab",
						  "aba",
						  "sdasdfasdf",
						  "yhohksdf",
						  "hjhjhhjj",
						  "asdfafff",
						  "ijkjkkkk",
						  "asdffdsa",
						  "akkaakka",
						  "kitapcinin"};
		
		long start = System.currentTimeMillis();
		
		for(int j=0; j<1000000; j++) {
			for (int i = 0; i<10; i++) {
				Solution.findDifferenceToMakeAnagramFaster(items[i]);
			}
		}
		
		long end = System.currentTimeMillis();
		
		long elapsedTime = end-start;
		
		System.out.println("Total time elapsed 2: "+ String.valueOf(elapsedTime));
		
	}
	
	@Test
	public void testfindDifferenceToMakeAnagramEvenFaster() {
		String item = "aabbabab";
		int expected = 0;
		
		assertEquals(expected, Solution.findDifferenceToMakeAnagramEvenFaster(item));
	}

	@Test
	public void testSpeedForFindDifferenceToMakeAnagramEvenFaster() {
		String[] items = {"aabbabab",
						  "aba",
						  "sdasdfasdf",
						  "yhohksdf",
						  "hjhjhhjj",
						  "asdfafff",
						  "ijkjkkkk",
						  "asdffdsa",
						  "akkaakka",
						  "kitapcinin"};
		
		long start = System.currentTimeMillis();
		
		for(int j=0; j<1000000; j++) {
			for (int i = 0; i<10; i++) {
				Solution.findDifferenceToMakeAnagramEvenFaster(items[i]);
			}
		}
		
		long end = System.currentTimeMillis();
		
		long elapsedTime = end-start;
		
		System.out.println("Total time elapsed 3: "+ String.valueOf(elapsedTime));
		
	}

}
