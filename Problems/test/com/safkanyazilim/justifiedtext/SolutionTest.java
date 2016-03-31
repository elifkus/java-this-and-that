package com.safkanyazilim.justifiedtext;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testFullJustify1() {
		ArrayList<String> input1 = new ArrayList<String>(Arrays.asList("This", "is", "an", "example", "of", "text", "justification."));
		int input2 = 16;
		ArrayList<String> expected = new ArrayList<String>(Arrays.asList("This    is    an", "example  of text", "justification.  "));
		ArrayList<String> actual = Solution.fullJustify(input1, input2);
		
		assertEquals(expected, actual);
	}

	@Test
	public void testFullJustify2() {
		ArrayList<String> input1 = new ArrayList<String>(Arrays.asList("America"));
		int input2 = 7;
		ArrayList<String> expected = new ArrayList<String>(Arrays.asList("America"));
		ArrayList<String> actual = Solution.fullJustify(input1, input2);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFullJustify3() {
		ArrayList<String> input1 = new ArrayList<String>(Arrays.asList("dinosaurs"));
		int input2 = 11;
		ArrayList<String> expected = new ArrayList<String>(Arrays.asList("dinosaurs  "));
		ArrayList<String> actual = Solution.fullJustify(input1, input2);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFullJustify4() {
		ArrayList<String> input1 = new ArrayList<String>(Arrays.asList("What", "must", "be", "shall", "be."));
		int input2 = 12;
		ArrayList<String> expected = new ArrayList<String>(Arrays.asList("What must be", "shall be.   "));
		ArrayList<String> actual = Solution.fullJustify(input1, input2);
		
		assertEquals(expected, actual);
	}
	
	
	

}
