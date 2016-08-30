package com.safkanyazilim.sortedsearchnosize;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testFindIndex1_1() {
		Listy listy = new Listy(1,4,5,6,8,9,10,14,16,18,20,23,25,28,29,30,31,33,38);
		int number = 20;
		int expected = 10;
		int actual = Solution.findIndex1(listy, number);
		assertEquals(expected, actual);
	}

	@Test
	public void testFindIndex1_2() {
		Listy listy = new Listy(1,4,5,6,8,9,10,14,16,18,20,23,25,28,29,30,31,33,38);
		int number = 31;
		int expected = 16;
		int actual = Solution.findIndex1(listy, number);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFindIndex1_3() {
		Listy listy = new Listy(1,4,5,6,8,9,10,14,16,18,20,23,25,28,29,30,31,33,38);
		int number = 15;
		int expected = -1;
		int actual = Solution.findIndex1(listy, number);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFindIndex1_4() {
		Listy listy = new Listy(1,4,5,6,8,9,10,14,16,18,20,23,25,28,29,30,31,33,38);
		int number = 40;
		int expected = -1;
		int actual = Solution.findIndex1(listy, number);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSpeedForFindIndex1() {
		Listy listy = new Listy(1,4,5,6,8,9,10,14,16,18,20,23,25,28,29,30,31,33,38);
		int number = 31;

		long start = System.currentTimeMillis();
		
		for(int j=0; j<10000000; j++) {
			Solution.findIndex1(listy, number);
			
		}
		
		long end = System.currentTimeMillis();
		
		long elapsedTime = end-start;
		
		System.out.println("Total time elapsed 1: "+ String.valueOf(elapsedTime));
		
	}
	
	@Test
	public void testFindIndex2_1() {
		Listy listy = new Listy(1,4,5,6,8,9,10,14,16,18,20,23,25,28,29,30,31,33,38);
		int number = 20;
		int expected = 10;
		int actual = Solution.findIndex2(listy, number);
		assertEquals(expected, actual);
	}

	@Test
	public void testFindIndex2_2() {
		Listy listy = new Listy(1,4,5,6,8,9,10,14,16,18,20,23,25,28,29,30,31,33,38);
		int number = 31;
		int expected = 16;
		int actual = Solution.findIndex2(listy, number);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFindIndex2_3() {
		Listy listy = new Listy(1,4,5,6,8,9,10,14,16,18,20,23,25,28,29,30,31,33,38);
		int number = 15;
		int expected = -1;
		int actual = Solution.findIndex2(listy, number);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFindIndex2_4() {
		Listy listy = new Listy(1,4,5,6,8,9,10,14,16,18,20,23,25,28,29,30,31,33,38);
		int number = 40;
		int expected = -1;
		int actual = Solution.findIndex2(listy, number);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSpeedForFindIndex2() {
		Listy listy = new Listy(1,4,5,6,8,9,10,14,16,18,20,23,25,28,29,30,31,33,38);
		int number = 31;

		long start = System.currentTimeMillis();
		
		for(int j=0; j<10000000; j++) {
			Solution.findIndex2(listy, number);
			
		}
		
		long end = System.currentTimeMillis();
		
		long elapsedTime = end-start;
		
		System.out.println("Total time elapsed 2: "+ String.valueOf(elapsedTime));
		
	}

}
