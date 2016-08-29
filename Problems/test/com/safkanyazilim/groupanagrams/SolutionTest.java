package com.safkanyazilim.groupanagrams;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class SolutionTest {

	@Test
	public void testGroupAnagrams1() {
		String[] items = {"aabbabab",
						  "abaaabbb",
						  "dfasdfsdas",
						  "hjhjhhjj",
						  "jhjhjhhj",
						  "ijkjkkkk",
						  "asdffdsa",
						  "kitapcinin",
						  "kitapcinin",
						  "aabbcbab",
						  "abbcbaba",
						  "asddasdsaa",
						  "hjljhljj",
						  "hljjaaff",
						  "ijkjkakk",
						  "aslfflsa",
						  "fknafkna",
						  "kitapninic",
						  "sdasdfasdf",
						  "sdasddasds"};
		
		String[] expected = {"sdasddasds", 
							 "sdasdfasdf", 
							 "fknafkna", 
							 "aslfflsa", 
							 "ijkjkakk", 
							 "hljjaaff", 
							 "hjljhljj", 
							 "asddasdsaa", 
							 "aabbcbab", 
							 "abbcbaba", 
							 "kitapcinin", 
							 "kitapcinin", 
							 "kitapninic", 
							 "asdffdsa", 
							 "ijkjkkkk", 
							 "hjhjhhjj", 
							 "jhjhjhhj", 
							 "dfasdfsdas", 
							 "aabbabab",
							 "abaaabbb"};
		
		List<String> itemList = new ArrayList<String>(Arrays.asList(items));
		List<String> expectedList = new ArrayList<String>(Arrays.asList(expected));
		
		Solution.groupAnagramStringsInList1(itemList);
		
		assertEquals(expectedList, itemList);
		
	}
	
	@Test
	public void testSpeedForGroupAnagrams1() {
		String[] items = {"aabbabab",
				  "abaaabbb",
				  "dfasdfsdas",
				  "hjhjhhjj",
				  "jhjhjhhj",
				  "ijkjkkkk",
				  "asdffdsa",
				  "kitapcinin",
				  "kitapcinin",
				  "aabbcbab",
				  "abbcbaba",
				  "asddasdsaa",
				  "hjljhljj",
				  "hljjaaff",
				  "ijkjkakk",
				  "aslfflsa",
				  "fknafkna",
				  "kitapninic",
				  "sdasdfasdf",
				  "sdasddasds"};

		

		List<String> itemList = new ArrayList<String>(Arrays.asList(items));
				
		long start = System.currentTimeMillis();
		
		for(int j=0; j<100000; j++) {
			Solution.groupAnagramStringsInList1(itemList);
		}
		
		long end = System.currentTimeMillis();
		
		long elapsedTime = end-start;
		
		System.out.println("Total time elapsed 1: "+ String.valueOf(elapsedTime));
		
	}

	@Test
	public void testGroupAnagrams2() {
		String[] items = {"aabbabab",
						  "abaaabbb",
						  "dfasdfsdas",
						  "hjhjhhjj",
						  "jhjhjhhj",
						  "ijkjkkkk",
						  "asdffdsa",
						  "kitapcinin",
						  "kitapcinin",
						  "aabbcbab",
						  "abbcbaba",
						  "asddasdsaa",
						  "hjljhljj",
						  "hljjaaff",
						  "ijkjkakk",
						  "aslfflsa",
						  "fknafkna",
						  "kitapninic",
						  "sdasdfasdf",
						  "sdasddasds"};
		
		String[] expected = {"ijkjkakk", 
							 "sdasddasds", 
							 "asdffdsa", 
							 "hjhjhhjj", 
							 "jhjhjhhj", 
							 "ijkjkkkk", 
							 "aabbcbab", 
							 "abbcbaba", 
							 "asddasdsaa", 
							 "hjljhljj", 
							 "aslfflsa", 
							 "fknafkna", 
							 "hljjaaff", 
							 "kitapcinin", 
							 "kitapcinin", 
							 "kitapninic", 
							 "dfasdfsdas", 
							 "sdasdfasdf", 
							 "aabbabab", 
							 "abaaabbb"};
		
		List<String> itemList = new ArrayList<String>(Arrays.asList(items));
		List<String> expectedList = new ArrayList<String>(Arrays.asList(expected));
		
		Solution.groupAnagramStringsInList2(itemList);
		
		assertEquals(expectedList, itemList);
		
	}
	
	@Test
	public void testSpeedForGroupAnagrams2() {
		String[] items = {"aabbabab",
				  "abaaabbb",
				  "dfasdfsdas",
				  "hjhjhhjj",
				  "jhjhjhhj",
				  "ijkjkkkk",
				  "asdffdsa",
				  "kitapcinin",
				  "kitapcinin",
				  "aabbcbab",
				  "abbcbaba",
				  "asddasdsaa",
				  "hjljhljj",
				  "hljjaaff",
				  "ijkjkakk",
				  "aslfflsa",
				  "fknafkna",
				  "kitapninic",
				  "sdasdfasdf",
				  "sdasddasds"};

		

		List<String> itemList = new ArrayList<String>(Arrays.asList(items));
				
		long start = System.currentTimeMillis();
		
		for(int j=0; j<100000; j++) {
			Solution.groupAnagramStringsInList2(itemList);
		}
		
		long end = System.currentTimeMillis();
		
		long elapsedTime = end-start;
		
		System.out.println("Total time elapsed 2: "+ String.valueOf(elapsedTime));
		
	}
}
