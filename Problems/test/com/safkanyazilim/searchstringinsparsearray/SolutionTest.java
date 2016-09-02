package com.safkanyazilim.searchstringinsparsearray;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testFindStringInSparseArray1() {
		String[] array = {"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
		String str = "ball";
		int expected = 4;
		
		assertEquals(expected, Solution.findStringInSparseArray(array, str));
	}
	
	@Test
	public void testFindStringInSparseArray2() {
		String[] array = {"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
		String str = "bal";
		int expected = -1;
		
		assertEquals(expected, Solution.findStringInSparseArray(array, str));
	}
	
	@Test
	public void testFindStringInSparseArray3() {
		String[] array = {"", "", "", "", "", "", "", "", "", "", "", "", ""};
		String str = "at";
		int expected = -1;
		
		assertEquals(expected, Solution.findStringInSparseArray(array, str));
	}	

}
