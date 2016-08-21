package com.safkanyazilim.oneawaystring;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testAreStringsOneAway1_1() {
		String item1 = "flea";
		String item2 = "plea";
		boolean expected = true;
		
		assertEquals(expected, Solution.areStringsOneAway1(item1, item2));
	}

	@Test
	public void testAreStringsOneAway1_2() {
		String item1 = "fish";
		String item2 = "plea";
		boolean expected = false;
		
		assertEquals(expected, Solution.areStringsOneAway1(item1, item2));
	}
	
	@Test
	public void testAreStringsOneAway1_3() {
		String item1 = "flea";
		String item2 = "flea";
		boolean expected = false;
		
		assertEquals(expected, Solution.areStringsOneAway1(item1, item2));
	}
	
	@Test
	public void testAreStringsOneAway1_4() {
		String item1 = "flea";
		String item2 = "lea";
		boolean expected = true;
		
		assertEquals(expected, Solution.areStringsOneAway1(item1, item2));
	}
	
	@Test
	public void testAreStringsOneAway1_5() {
		String item1 = "fle";
		String item2 = "flea";
		boolean expected = true;
		
		assertEquals(expected, Solution.areStringsOneAway1(item1, item2));
	}
	
	//@Test
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
