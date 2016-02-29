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
		
		try {
			Solution.arrange(input);
		} catch (Exception e) {
			fail("Test failed");
		}
		assertEquals(expected, input);
	}

	@Test
	public void testArrange2() {
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(4,0,2,1,3));
		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(3,4,2,0,1));
		
		try {
			Solution.arrange(input);
		} catch (Exception e) {
			fail("Test failed");
		}
		assertEquals(expected, input);
	}
	
	@Test
	public void testArrange3() {
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 2, 7, 0, 9, 3, 6, 8, 5, 4));
		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(2, 7, 8, 1, 4, 0, 6, 5, 3, 9));
		
		try {
			Solution.arrange(input);
		} catch (Exception e) {
			e.printStackTrace();
			fail("Test failed\n" + e.getMessage() + "\n");
		}
		assertEquals(expected, input);
	}
	
	@Test
	public void testfindCurrentIndiceWithResult() {
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(4,0,2,1,3));
		int value=4;
		int expected = 1;
		
		int output = -1;
		try {
			 output = Solution.findNextIndiceWithResult(value, input);
			
		} catch (Exception e) {
			fail("Test failed");
		}
		
		assertEquals(expected, output);
	}

	@Test
	public void testfindCurrentIndiceWithResult1() {
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(4,0,2,1,3));
		int value= 0;
		int expected = 3;
		
		int output = -1;
		try {
			 output = Solution.findNextIndiceWithResult(value, input);
			
		} catch (Exception e) {
			fail("Test failed");
		}		
		assertEquals(expected, output);
	}

	@Test
	public void testfindCurrentIndiceWithResult2() {
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(4,0,2,1,3));
		int value = 2;
		int expected = 2;
		
		int output = -1;
		try {
			 output = Solution.findNextIndiceWithResult(value, input);
			
		} catch (Exception e) {
			fail("Test failed");
		}		
		assertEquals(expected, output);
	}

	@Test
	public void testfindCurrentIndiceWithResult3() {
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(4,0,2,1,3));
		int value = 1;
		int expected = 4;
		
		int output = -1;
		try {
			 output = Solution.findNextIndiceWithResult(value, input);
			
		} catch (Exception e) {
			fail("Test failed");
		}		
		assertEquals(expected, output);
	}

	@Test
	public void testfindCurrentIndiceWithResult4() {
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(4,0,2,1,3));
		int value = 3;
		int expected = 0;
		
		int output = -1;
		try {
			 output = Solution.findNextIndiceWithResult(value, input);
			
		} catch (Exception e) {
			fail("Test failed");
		}		
		assertEquals(expected, output);
	}

	@Test
	public void testfindCurrentIndiceWithResult5() {
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 2, 7, 0, 9, 3, 6, 8, 5, 4));
		int value = 1;
		int expected = 3;
		
		int output = -1;
		try {
			 output = Solution.findNextIndiceWithResult(value, input);
			
		} catch (Exception e) {
			fail("Test failed");
		}		
		assertEquals(expected, output);
	}
}
