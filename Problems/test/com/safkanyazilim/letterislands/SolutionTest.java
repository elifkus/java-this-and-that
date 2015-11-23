package com.safkanyazilim.letterislands;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testFindNoOfSubstringsThatMakeNIslands() {
		String item1 = "abaab";
		int noOfIslands = 2;	
		int expected = 3;
		assertEquals(expected, Solution.findNoOfSubstringsThatMakeNIslands(item1, noOfIslands));
	
		item1 = "ababa";
		noOfIslands = 2;
		expected = 1;
		assertEquals(expected, Solution.findNoOfSubstringsThatMakeNIslands(item1, noOfIslands));
		
		item1 = "aaababaababababbabaabaabaaaababaababaabbabaababaaa";
		noOfIslands = 1;
		expected = 946;
		assertEquals(expected, Solution.findNoOfSubstringsThatMakeNIslands(item1, noOfIslands));
		
		item1 = "aaaabababbaabaaabababbababaabaababaababaabaababaaa";
		noOfIslands = 3;
		expected = 5;
		assertEquals(expected, Solution.findNoOfSubstringsThatMakeNIslands(item1, noOfIslands));	
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
