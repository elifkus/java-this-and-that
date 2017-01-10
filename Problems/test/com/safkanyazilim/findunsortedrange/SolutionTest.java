package com.safkanyazilim.findunsortedrange;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testFindUnsortedSubarrayIndices1() {
		int[] inputArray = {1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19};
		int[] expectedOutputArray = {3, 9};
		
		int[] actualOutputArray = Solution.findUnsortedSubarrayIndices(inputArray);
		assertArrayEquals(expectedOutputArray, actualOutputArray);
	}
	
	@Test
	public void testFindUnsortedSubarrayIndices2() {
		int[] inputArray = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		int[] expectedOutputArray = {0, 9};
		
		int[] actualOutputArray = Solution.findUnsortedSubarrayIndices(inputArray);
		assertArrayEquals(expectedOutputArray, actualOutputArray);
	}
	
	@Test
	public void testFindUnsortedSubarrayIndices3() {
		int[] inputArray = {};
		int[] expectedOutputArray = {};
		
		int[] actualOutputArray = Solution.findUnsortedSubarrayIndices(inputArray);
		assertArrayEquals(expectedOutputArray, actualOutputArray);
	}

	@Test
	public void testFindUnsortedSubarrayIndices4() {
		int[] inputArray = {4, 4, 4, 4};
		int[] expectedOutputArray = {};
		
		int[] actualOutputArray = Solution.findUnsortedSubarrayIndices(inputArray);
		assertArrayEquals(expectedOutputArray, actualOutputArray);
	}
	
	@Test
	public void testFindUnsortedSubarrayIndices5() {
		int[] inputArray = {5, 2, 4, 7, 10, 11, 12, 16, 18, 19};
		int[] expectedOutputArray = {0, 2};
		
		int[] actualOutputArray = Solution.findUnsortedSubarrayIndices(inputArray);
		assertArrayEquals(expectedOutputArray, actualOutputArray);
	}
	
	@Test
	public void testFindUnsortedSubarrayIndices6() {
		int[] inputArray = {2, 4, 7, 10, 11, 7, 16, 18, 19, 5};
		int[] expectedOutputArray = {2, 9};
		
		int[] actualOutputArray = Solution.findUnsortedSubarrayIndices(inputArray);
		assertArrayEquals(expectedOutputArray, actualOutputArray);
	}
	
	@Test
	public void testFindUnsortedSubarrayIndicesFaster1() {
		int[] inputArray = {1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19};
		int[] expectedOutputArray = {3, 9};
		
		int[] actualOutputArray = Solution.findUnsortedSubarrayIndicesFaster(inputArray);
		assertArrayEquals(expectedOutputArray, actualOutputArray);
	}
	
	@Test
	public void testFindUnsortedSubarrayIndicesFaster2() {
		int[] inputArray = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		int[] expectedOutputArray = {0, 9};
		
		int[] actualOutputArray = Solution.findUnsortedSubarrayIndicesFaster(inputArray);
		assertArrayEquals(expectedOutputArray, actualOutputArray);
	}
	
	@Test
	public void testFindUnsortedSubarrayIndicesFaster3() {
		int[] inputArray = {};
		int[] expectedOutputArray = {};
		
		int[] actualOutputArray = Solution.findUnsortedSubarrayIndicesFaster(inputArray);
		assertArrayEquals(expectedOutputArray, actualOutputArray);
	}

	@Test
	public void testFindUnsortedSubarrayIndicesFaster4() {
		int[] inputArray = {4, 4, 4, 4};
		int[] expectedOutputArray = {};
		
		int[] actualOutputArray = Solution.findUnsortedSubarrayIndicesFaster(inputArray);
		assertArrayEquals(expectedOutputArray, actualOutputArray);
	}
	
	@Test
	public void testFindUnsortedSubarrayIndicesFaster5() {
		int[] inputArray = {5, 2, 4, 7, 10, 11, 12, 16, 18, 19};
		int[] expectedOutputArray = {0, 2};
		
		int[] actualOutputArray = Solution.findUnsortedSubarrayIndicesFaster(inputArray);
		assertArrayEquals(expectedOutputArray, actualOutputArray);
	}
	
	@Test
	public void testFindUnsortedSubarrayIndicesFaster6() {
		int[] inputArray = {2, 4, 7, 10, 11, 7, 16, 18, 19, 5};
		int[] expectedOutputArray = {2, 9};
		
		int[] actualOutputArray = Solution.findUnsortedSubarrayIndicesFaster(inputArray);
		assertArrayEquals(expectedOutputArray, actualOutputArray);
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
