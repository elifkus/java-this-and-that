package com.safkanyazilim.palindromepermutation;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testIsPermuationOfAPalindrome1_1() {
		String item1 = "aabbabab";
		
		boolean expected = true;
		
		assertEquals(expected, Solution.isPermutationOfAPalindrome1(item1));
	}
	
	@Test
	public void testIsPermuationOfAPalindrome1_2() {
		String item1 = "aabbcdabab";
		
		boolean expected = false;
		
		assertEquals(expected, Solution.isPermutationOfAPalindrome1(item1));
	}
	
	@Test
	public void testIsPermuationOfAPalindrome1_3() {
		String item1 = "cat of o cat";
		
		boolean expected = true;
		
		assertEquals(expected, Solution.isPermutationOfAPalindrome1(item1));
	}
	
	@Test
	public void testIsPermuationOfAPalindrome1_4() {
		String item1 = "abbabbg";
		
		boolean expected = true;
		
		assertEquals(expected, Solution.isPermutationOfAPalindrome1(item1));
	}

	@Test
	public void testSpeedForIsPermuationOfAPalindrome1() {
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
		
		for(int j=0; j<10000; j++) {
			for (int i = 0; i<20; i++) {
				boolean isPermutation = Solution.isPermutationOfAPalindrome1(items[i]);
				System.out.print(items[i] + ":" + isPermutation + "|");
			}
		}
		System.out.println("");
		long end = System.currentTimeMillis();
		
		long elapsedTime = end-start;
		
		System.out.println("Total time elapsed 1: "+ String.valueOf(elapsedTime));
		
	}
	
	@Test
	public void testIsPermuationOfAPalindrome2_1() {
		String item1 = "aabbabab";
		
		boolean expected = true;
		
		assertEquals(expected, Solution.isPermutationOfAPalindrome2(item1));
	}
	
	@Test
	public void testIsPermuationOfAPalindrome2_2() {
		String item1 = "aabbcdabab";
		
		boolean expected = false;
		
		assertEquals(expected, Solution.isPermutationOfAPalindrome2(item1));
	}
	
	@Test
	public void testIsPermuationOfAPalindrome2_3() {
		String item1 = "cat of o cat";
		
		boolean expected = true;
		
		assertEquals(expected, Solution.isPermutationOfAPalindrome2(item1));
	}
	
	@Test
	public void testIsPermuationOfAPalindrome2_4() {
		String item1 = "abbabbg";
		
		boolean expected = true;
		
		assertEquals(expected, Solution.isPermutationOfAPalindrome2(item1));
	}

	@Test
	public void testSpeedForIsPermuationOfAPalindrome2() {
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

		for(int j=0; j<10000; j++) {
			for (int i = 0; i<20; i++) {
				boolean isPermutation = Solution.isPermutationOfAPalindrome2(items[i]);
				System.out.print(items[i] + ":" + isPermutation + "|");
			}
		}
		System.out.println("");
		long end = System.currentTimeMillis();
		
		long elapsedTime = end-start;
		
		System.out.println("Total time elapsed 1: "+ String.valueOf(elapsedTime));
		
	}
	
	@Test
	public void testIsPermuationOfAPalindrome3_1() {
		String item1 = "aabbabab";
		
		boolean expected = true;
		
		assertEquals(expected, Solution.isPermutationOfAPalindrome3(item1));
	}
	
	@Test
	public void testIsPermuationOfAPalindrome3_2() {
		String item1 = "aabbcdabab";
		
		boolean expected = false;
		
		assertEquals(expected, Solution.isPermutationOfAPalindrome3(item1));
	}
	
	@Test
	public void testIsPermuationOfAPalindrome3_3() {
		String item1 = "cat of o cat";
		
		boolean expected = true;
		
		assertEquals(expected, Solution.isPermutationOfAPalindrome3(item1));
	}
	
	@Test
	public void testIsPermuationOfAPalindrome3_4() {
		String item1 = "abbabbg";
		
		boolean expected = true;
		
		assertEquals(expected, Solution.isPermutationOfAPalindrome3(item1));
	}

	@Test
	public void testSpeedForIsPermuationOfAPalindrome3() {
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

		for(int j=0; j<10000; j++) {
			for (int i = 0; i<20; i++) {
				boolean isPermutation = Solution.isPermutationOfAPalindrome3(items[i]);
				System.out.print(items[i] + ":" + isPermutation + "|");
			}
		}
		System.out.println("");
		long end = System.currentTimeMillis();
		
		long elapsedTime = end-start;
		
		System.out.println("Total time elapsed 1: "+ String.valueOf(elapsedTime));
		
	}

}
