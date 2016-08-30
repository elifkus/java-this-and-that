package com.safkanyazilim.rotatedsortedarraysearch;

import static org.junit.Assert.*;

import org.junit.Test;

public class Solution2Test {

	@Test
	public void testFindIndexOfIntegerInRotatedArray() {
		int[] array = {5, 6, 8, 10, 11, 13, 1, 3, 4};
		int number = 3;
		int expected = 7;
		int actual = Solution2.findIndexOfIntegerInRotatedArray(array, number);
		assertEquals(expected, actual);
	}

	
	
	

}
