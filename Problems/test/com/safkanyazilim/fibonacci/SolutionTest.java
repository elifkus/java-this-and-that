package com.safkanyazilim.fibonacci;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testCalculateFibonacciRecursively1() {
		int n = 2;
		int expected = 1;
		assertEquals(expected, Solution.calculateFibonacciRecursively(n));
	}

	@Test
	public void testCalculateFibonacciRecursively2() {
		int n = 5;
		int expected = 5;
		assertEquals(expected, Solution.calculateFibonacciRecursively(n));
	}
	@Test
	public void testCalculateFibonacciRecursively3() {
		int n = 8;
		int expected = 21;
		assertEquals(expected, Solution.calculateFibonacciRecursively(n));
	}
	@Test
	public void testCalculateFibonacciRecursively4() {
		int n = 11;
		int expected = 89;
		assertEquals(expected, Solution.calculateFibonacciRecursively(n));
	}
	
	@Test
	public void testCalculateFibonacciWithLoop1() {
		int n = 2;
		int expected = 1;
		assertEquals(expected, Solution.calculateFibonacciWithLoop(n));
	}

	@Test
	public void testCalculateFibonacciWithLoop2() {
		int n = 5;
		int expected = 5;
		assertEquals(expected, Solution.calculateFibonacciWithLoop(n));
	}
	@Test
	public void testCalculateFibonacciWithLoop3() {
		int n = 8;
		int expected = 21;
		assertEquals(expected, Solution.calculateFibonacciWithLoop(n));
	}
	@Test
	public void testCalculateFibonacciWithLoop4() {
		int n = 11;
		int expected = 89;
		assertEquals(expected, Solution.calculateFibonacciWithLoop(n));
	}
	
	@Test
	public void testCalculateFibonacciWithAnalytically1() {
		int n = 2;
		int expected = 1;
		assertEquals(expected, Solution.calculateFibonacciAnalytically(n));
	}

	@Test
	public void testCalculateFibonacciWithAnalytically2() {
		int n = 5;
		int expected = 5;
		assertEquals(expected, Solution.calculateFibonacciAnalytically(n));
	}
	@Test
	public void testCalculateFibonacciWithAnalytically3() {
		int n = 8;
		int expected = 21;
		assertEquals(expected, Solution.calculateFibonacciAnalytically(n));
	}
	@Test
	public void testCalculateFibonacciWithAnalytically4() {
		int n = 11;
		int expected = 89;
		assertEquals(expected, Solution.calculateFibonacciAnalytically(n));
	}
	

}
