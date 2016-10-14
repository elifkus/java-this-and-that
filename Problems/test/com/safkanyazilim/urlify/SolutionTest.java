package com.safkanyazilim.urlify;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testUrlify() {
		String item1 = "Mr John Smith    ";
		int length = 13;
		String expected = "Mr%20John%20Smith";
		String actual = Solution.urlify(item1, length);
		assertEquals(expected, actual);
	}
	

}
