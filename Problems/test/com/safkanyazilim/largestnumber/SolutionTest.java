package com.safkanyazilim.largestnumber;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testLargestNumber1_1() {
		List<Integer> items = Arrays.asList(33, 330, 34, 5, 9 );
		String expected = "953433330";
		
		assertEquals(expected, Solution.largestNumber1(items));
	}
	
	@Test
	public void testLargestNumber1_2() {
		List<Integer> items = Arrays.asList(33, 330, 334, 5, 9 );
		String expected = "9533433330";
		
		assertEquals(expected, Solution.largestNumber1(items));
	}
	
	@Test
	public void testLargestNumber1_3() {
		List<Integer> items = Arrays.asList(33, 332, 334, 5, 9 );
		String expected = "9533433332";
		
		assertEquals(expected, Solution.largestNumber1(items));
	}
	
	@Test
	public void testLargestNumber1_4() {
		List<Integer> items = Arrays.asList(782, 240, 409, 678, 940, 502, 113, 686, 6, 825, 366, 686, 877, 357, 261, 772, 798, 29, 337, 646, 868, 974, 675, 271, 791, 124, 363, 298, 470, 991, 709, 533, 872, 780, 735, 19, 930, 895, 799, 395, 905 );
		String expected = "99197494093090589587787286882579979879178278077273570968668667867566465335024704093953663633573372982927126124019124113";
		
		assertEquals(expected, Solution.largestNumber1(items));
	} 

	//@Test
	public void testSpeedForLargestNumber1() {
		List<List<Integer>> items = new ArrayList<>(3);
		items.add(Arrays.asList(33, 330, 34, 5, 9 ));
		items.add(Arrays.asList(33, 330, 334, 5, 9 ));
		items.add(Arrays.asList(33, 332, 334, 5, 9 ));
		
		List<String> expectedList = new ArrayList<>(3);
		expectedList.add("953303433");
		expectedList.add("9533433330");
		expectedList.add("9533433332");
		
		long start = System.currentTimeMillis();
		
		for(int j=0; j<1000000; j++) {
			for (int i = 0; i<3; i++) {
				String result = Solution.largestNumber1(items.get(i));
				assertEquals(expectedList.get(i), result);
			}
		}
		
		long end = System.currentTimeMillis();
		
		long elapsedTime = end-start;
		
		System.out.println("Total time elapsed 1: "+ String.valueOf(elapsedTime));
		
	}
	
	@Test
	public void testLargestNumber2_1() {
		List<Integer> items = Arrays.asList(33, 330, 34, 5, 9 );
		String expected = "953433330";
		
		assertEquals(expected, Solution.largestNumber2(items));
	}
	
	@Test
	public void testLargestNumber2_2() {
		List<Integer> items = Arrays.asList(33, 330, 334, 5, 9 );
		String expected = "9533433330";
		
		assertEquals(expected, Solution.largestNumber2(items));
	}
	
	@Test
	public void testLargestNumber2_3() {
		List<Integer> items = Arrays.asList(33, 332, 334, 5, 9 );
		String expected = "9533433332";
		
		assertEquals(expected, Solution.largestNumber2(items));
	}
	
	@Test
	public void testLargestNumber2_4() {
		List<Integer> items = Arrays.asList(782, 240, 409, 678, 940, 502, 113, 686, 6, 825, 366, 686, 877, 357, 261, 772, 798, 29, 337, 646, 868, 974, 675, 271, 791, 124, 363, 298, 470, 991, 709, 533, 872, 780, 735, 19, 930, 895, 799, 395, 905 );
		String expected = "99197494093090589587787286882579979879178278077273570968668667867566465335024704093953663633573372982927126124019124113";
		
		assertEquals(expected, Solution.largestNumber2(items));
	} 
	

	@Test
	public void testLargestNumber2_5() {
		List<Integer> items = Arrays.asList(798, 799);
		String expected = "799798";
		
		assertEquals(expected, Solution.largestNumber2(items));
	}

	@Test
	public void testNumberWithStringComparator1() {
		NumberWithString item1 = new NumberWithString(1);
		NumberWithString item2 = new NumberWithString(2);
		
		assertTrue(item1.compareTo(item2) == -1 * item2.compareTo(item1));
	}
	
	@Test
	public void testNumberWithStringComparator2() {
		NumberWithString item1 = new NumberWithString(1);
		NumberWithString item2 = new NumberWithString(1);
		
		assertEquals(0,item1.compareTo(item2));
	}
	
	@Test
	public void testNumberWithStringComparator3() {
		NumberWithString item1 = new NumberWithString(88);
		NumberWithString item2 = new NumberWithString(889);
		
		assertTrue(item1.compareTo(item2) == -1 * item2.compareTo(item1));
	}

	@Test
	public void testNumberWithStringComparator4() {
		NumberWithString item1 = new NumberWithString(33);
		NumberWithString item2 = new NumberWithString(332);
		
		assertTrue(item1.compareTo(item2) == -1 * item2.compareTo(item1));
	}

}
