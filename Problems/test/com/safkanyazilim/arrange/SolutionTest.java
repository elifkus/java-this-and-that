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
	
	

}
