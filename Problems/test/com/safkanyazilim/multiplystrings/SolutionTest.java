package com.safkanyazilim.multiplystrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testFindCommonLetter() {
		String item1 = "12";
		String item2 = "5";
		String expected = "60";
		
		assertEquals(expected, Solution.multiply(item1, item2));
	}

	
	
	

}
