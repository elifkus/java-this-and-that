package com.safkanyazilim.matrixsearch;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testSearchMatrix1() {
		/*
		 * [  [1,   3,  5,  7],
			  [10, 11, 16, 20],
			  [23, 30, 34, 50]
			]
		*/
		ArrayList<ArrayList<Integer>> inputArray = new ArrayList<ArrayList<Integer>>();
		inputArray.add(new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7)));
		inputArray.add(new ArrayList<Integer>(Arrays.asList(10, 11, 16, 20)));
		inputArray.add(new ArrayList<Integer>(Arrays.asList(23, 30, 34, 50)));
		
		int inputNumber = 3;
		
		int expected = 1;
		int actual = -1;
		
		try {
			actual = Solution.searchMatrix(inputArray, inputNumber);
		} catch (Exception e) {
			fail("Test failed" + e.getMessage());
		}
		assertEquals(expected, actual);
	}


	@Test
	public void testSearchMatrix2() {
		/*
		 * A : 
				[
				  [3]
				  [29]
				  [36]
				  [63]
				  [67]
				  [72]
				  [74]
				  [78]
				  [85]
				]
				B : 41
		*/
		ArrayList<ArrayList<Integer>> inputArray = new ArrayList<ArrayList<Integer>>();
		inputArray.add(new ArrayList<Integer>(Arrays.asList(3)));
		inputArray.add(new ArrayList<Integer>(Arrays.asList(29)));
		inputArray.add(new ArrayList<Integer>(Arrays.asList(36)));
		inputArray.add(new ArrayList<Integer>(Arrays.asList(63)));
		inputArray.add(new ArrayList<Integer>(Arrays.asList(67)));
		inputArray.add(new ArrayList<Integer>(Arrays.asList(72)));
		inputArray.add(new ArrayList<Integer>(Arrays.asList(74)));
		inputArray.add(new ArrayList<Integer>(Arrays.asList(78)));
		inputArray.add(new ArrayList<Integer>(Arrays.asList(85)));
		
		
		int inputNumber = 41;
		
		int expected = 0;
		int actual = -1;
		
		try {
			actual = Solution.searchMatrix(inputArray, inputNumber);
		} catch (Exception e) {
			fail("Test failed" + e.getMessage());
		}
		assertEquals(expected, actual);
	}
	
}
