package com.safkanyazilim.largestnumber;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testLargestNumber1() {
		List<Integer> items = Arrays.asList(33, 330, 34, 5, 9 );
		String expected = "953303433";
		
		assertEquals(expected, Solution.largestNumber(items));
	}
	
	@Test
	public void testLargestNumber2() {
		List<Integer> items = Arrays.asList(33, 330, 334, 5, 9 );
		String expected = "9533433330";
		
		assertEquals(expected, Solution.largestNumber(items));
	}
	
	@Test
	public void testLargestNumber3() {
		List<Integer> items = Arrays.asList(33, 332, 334, 5, 9 );
		String expected = "9533433332";
		
		assertEquals(expected, Solution.largestNumber(items));
	}
	
	@Test
	public void testLargestNumber4() {
		List<Integer> items = Arrays.asList(782, 240, 409, 678, 940, 502, 113, 686, 6, 825, 366, 686, 877, 357, 261, 772, 798, 29, 337, 646, 868, 974, 675, 271, 791, 124, 363, 298, 470, 991, 709, 533, 872, 780, 735, 19, 930, 895, 799, 395, 905 );
		String expected = "99197494093090589587787286882579979879178278077273570968668667867566465335024704093953663633573372982927126124019124113";
		
		assertEquals(expected, Solution.largestNumber(items));
	} 

	//@Test
	public void testSpeedForFindCommonLetter() {
		List<Integer> items =Arrays.asList(33, 330, 34, 5, 9 );
		
		long start = System.currentTimeMillis();
		
		for(int j=0; j<1000000; j++) {
			for (int i = 0; i<10; i=i+2) {
				//Solution.findCommonLetter(items[i], items[i+1]);
			}
		}
		
		long end = System.currentTimeMillis();
		
		long elapsedTime = end-start;
		
		System.out.println("Total time elapsed 1: "+ String.valueOf(elapsedTime));
		
	}
	
	

}
