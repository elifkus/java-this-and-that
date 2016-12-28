package com.safkanyazilim.polycarpdecoding;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testDecodePolyCar1() {
		String input = "logva";
		String expected = "volga";
		
		String actual = Solution.decodePolyCarp(input);
		assertEquals(expected, actual);
	}

	@Test
	public void testDecodePolyCar2() {
		String input = "no";
		String expected = "no";
		
		String actual = Solution.decodePolyCarp(input);
		assertEquals(expected, actual);
	}

	@Test
	public void testDecodePolyCar3() {
		String input = "abba";
		String expected = "baba";
		
		String actual = Solution.decodePolyCarp(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDecodePolyCar4() {
		String input = "rahmaakn";
		String expected = "kahraman";
		
		String actual = Solution.decodePolyCarp(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDecodePolyCar5() {
		String input = "daernaikz";
		String expected = "karadeniz";
		
		String actual = Solution.decodePolyCarp(input);
		assertEquals(expected, actual);
	}

	@Test
	public void testSpeedForFindCommonLetter() {
		String[] items = {"aabbaaabab",
						  "aba",
						  "sdasdfasdf",
						  "yhohksdf",
						  "hjhjhhjj",
						  "asdfafff",
						  "ijkjkkkk",
						  "asdffdsa",
						  "akkaakka",
						  "kitapcinin",
						  "aabbcbab",
						  "aba",
						  "sdasddasds",
						  "yjohmsdf",
						  "hjljhljj",
						  "asdfaaff",
						  "ijkjkakk",
						  "aslfflsa",
						  "fknafkna",
						  "kitaplinin"};
		
		
		long start = System.currentTimeMillis();
		
		for(int j=0; j<1000000; j++) {
			for (int i = 0; i<10; i=i+2) {
				Solution.decodePolyCarp(items[i]);
			}
		}
		
		long end = System.currentTimeMillis();
		
		long elapsedTime = end-start;
		
		System.out.println("Total time elapsed 1: "+ String.valueOf(elapsedTime));
		
	}
	
	

}
