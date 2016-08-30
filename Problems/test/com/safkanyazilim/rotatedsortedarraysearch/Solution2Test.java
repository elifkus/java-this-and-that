package com.safkanyazilim.rotatedsortedarraysearch;

import static org.junit.Assert.*;

import org.junit.Test;

public class Solution2Test {

	@Test
	public void testFindIndexOfIntegerInRotatedArray1_1() {
		int[] array = {5, 6, 8, 10, 11, 13, 1, 3, 4};
		int number = 3;
		int expected = 7;
		int actual = Solution2.findIndexOfIntegerInRotatedArray1(array, number);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFindIndexOfIntegerInRotatedArray1_2() {
		int[] array = {5, 6, 8, 10, 11, 13, 1, 3, 4};
		int number = 8;
		int expected = 2;
		int actual = Solution2.findIndexOfIntegerInRotatedArray1(array, number);
		assertEquals(expected, actual);
	}

	@Test
	public void testSpeedForFindIndexOfIntegerInRotatedArray1() {
		int[] array = {5, 6, 8, 10, 11, 13, 1, 3, 4};
		int number = 3;
		int expected = 7;

		long start = System.currentTimeMillis();

		for (int i=0; i<1000000; i++) {
			int actual = Solution2.findIndexOfIntegerInRotatedArray1(array, number);
			assertEquals(expected, actual);
		}
		
		long end = System.currentTimeMillis();
		
		long elapsedTime = end-start;
		System.out.println("Total time elapsed 1: "+ String.valueOf(elapsedTime));
	}
	
	@Test
	public void testFindIndexOfIntegerInRotatedArray2_1() {
		int[] array = {5, 6, 8, 10, 11, 13, 1, 3, 4};
		int number = 3;
		int expected = 7;
		int actual = Solution2.findIndexOfIntegerInRotatedArray2(array, number);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFindIndexOfIntegerInRotatedArray2_2() {
		int[] array = {5, 6, 8, 10, 11, 13, 1, 3, 4};
		int number = 8;
		int expected = 2;
		int actual = Solution2.findIndexOfIntegerInRotatedArray2(array, number);
		assertEquals(expected, actual);
	}

	@Test
	public void testSpeedForFindIndexOfIntegerInRotatedArray2() {
		int[] array = {5, 6, 8, 10, 11, 13, 1, 3, 4};
		int number = 3;
		int expected = 7;

		long start = System.currentTimeMillis();

		for (int i=0; i<1000000; i++) {
			int actual = Solution2.findIndexOfIntegerInRotatedArray2(array, number);
			assertEquals(expected, actual);
		}
		
		long end = System.currentTimeMillis();
		
		long elapsedTime = end-start;
		System.out.println("Total time elapsed 2: "+ String.valueOf(elapsedTime));
	}

}
