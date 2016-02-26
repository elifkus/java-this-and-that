package com.safkanyazilim.arrange;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testArrange1() {
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1,0));
		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(0,1));
		
		Solution.arrange(input);
		assertEquals(expected, input);
	}

	@Test
	public void testArrange2() {
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(4,0,2,1,3));
		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(3,4,2,0,1));
		
		Solution.arrange(input);
		assertEquals(expected, input);
	}
	
	@Test
	public void testfindCurrentIndiceWithResult() {
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(4,0,2,1,3));
		int value=4;
		int expected = 1;
		
		int output = Solution.findNextIndiceWithResult(value, input);
		
		assertEquals(expected, output);
	}

	@Test
	public void testfindCurrentIndiceWithResult1() {
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(4,0,2,1,3));
		int value= 0;
		int expected = 3;
		
		int output = Solution.findNextIndiceWithResult(value, input);
		
		assertEquals(expected, output);
	}

	@Test
	public void testfindCurrentIndiceWithResult2() {
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(4,0,2,1,3));
		int value = 2;
		int expected = 2;
		
		int output = Solution.findNextIndiceWithResult(value, input);
		
		assertEquals(expected, output);
	}

	@Test
	public void testfindCurrentIndiceWithResult3() {
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(4,0,2,1,3));
		int value = 1;
		int expected = 4;
		
		int output = Solution.findNextIndiceWithResult(value, input);
		
		assertEquals(expected, output);
	}

	@Test
	public void testfindCurrentIndiceWithResult4() {
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(4,0,2,1,3));
		int value = 3;
		int expected = 0;
		
		int output = Solution.findNextIndiceWithResult(value, input);
		
		assertEquals(expected, output);
	}

}
