package com.safkanyazilim.rotation;


import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testIsRotation1_1() {
		String item1 = "xysdfa";
		String item2 = "dfaxys";
		boolean expected = true;
		
		assertEquals(expected, Solution.isRotation1(item1, item2));
	}

	@Test
	public void testIsRotation1_2() {
		String item1 = "hjhjhhjj";
		String item2 = "jhjhjhhj";
		boolean expected = true;
			
		assertEquals(expected, Solution.isRotation1(item1, item2));
	}
	@Test
	public void testSpeedForIsRotation1() {
		String[] items = {"aabbabab",
						  "aba",
						  "sdasdfasdf",
						  "dfasdfsdas",
						  "hjhjhhjj",
						  "jhjhjhhj",
						  "ijkjkkkk",
						  "asdffdsa",
						  "kitapcinin",
						  "kitapcinin",
						  "aabbcbab",
						  "abbcbaba",
						  "sdasddasds",
						  "asddasdsaa",
						  "hjljhljj",
						  "hljjaaff",
						  "ijkjkakk",
						  "aslfflsa",
						  "fknafkna",
						  "kitaplinin"};
		boolean[] results = {false, true, true, false, true, false, false, false, true, false};
		long start = System.currentTimeMillis();
		
		for(int j=0; j<1000000; j++) {
			for (int i = 0; i<10; i=i+2) {
				assertEquals(i+":"+items[i] +"-"+items[i+1], results[i], Solution.isRotation1(items[i], items[i+1]));
			}
		}
		
		long end = System.currentTimeMillis();
		
		long elapsedTime = end-start;
		
		System.out.println("Total time elapsed 1: "+ String.valueOf(elapsedTime));
		
	}
	
	@Test
	public void testIsRotation2_1() {
		String item1 = "xysdfa";
		String item2 = "dfaxys";
		boolean expected = true;
		
		assertEquals(expected, Solution.isRotation2(item1, item2));
	}

	@Test
	public void testIsRotation2_2() {
		String item1 = "hjhjhhjj";
		String item2 = "jhjhjhhj";
		boolean expected = true;
			
		assertEquals(expected, Solution.isRotation2(item1, item2));
	}
	@Test
	public void testSpeedForIsRotation2() {
		String[] items = {"aabbabab",
						  "aba",
						  "sdasdfasdf",
						  "dfasdfsdas",
						  "hjhjhhjj",
						  "jhjhjhhj",
						  "ijkjkkkk",
						  "asdffdsa",
						  "kitapcinin",
						  "kitapcinin",
						  "aabbcbab",
						  "abbcbaba",
						  "sdasddasds",
						  "asddasdsaa",
						  "hjljhljj",
						  "hljjaaff",
						  "ijkjkakk",
						  "aslfflsa",
						  "fknafkna",
						  "kitaplinin"};
		boolean[] results = {false, true, true, false, true, false, false, false, true, false};
		long start = System.currentTimeMillis();
		
		for(int j=0; j<1000000; j++) {
			for (int i = 0; i<10; i=i+2) {
				assertEquals(i+":"+items[i] +"-"+items[i+1], results[i], Solution.isRotation2(items[i], items[i+1]));
			}
		}
		
		long end = System.currentTimeMillis();
		
		long elapsedTime = end-start;
		
		System.out.println("Total time elapsed 2: "+ String.valueOf(elapsedTime));
		
	}

}
