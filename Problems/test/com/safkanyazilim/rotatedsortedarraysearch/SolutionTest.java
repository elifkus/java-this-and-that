package com.safkanyazilim.rotatedsortedarraysearch;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testFindIndexOfIntegerInRotatedArray() {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(5, 6, 8, 10, 11, 13, 1, 3, 4));
		int number = 3;
		int expected = 7;
		int actual = Solution.search(list, number);
		assertEquals(expected, actual);
	}

}
