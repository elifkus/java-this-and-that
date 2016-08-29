package com.safkanyazilim.groupanagrams;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class SolutionTest {

	@Test
	public void testGroupAnagrams() {
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
		
		List<String> itemList = Arrays.asList(items);
		List<String> expectedList = Arrays.asList(expected);
		
		Solution.groupAnagramStringsInList(itemList);
		
		assertEquals(expectedList, itemList);
		
	}
	
	@Test
	public void testSpeedForGroupAnagrams() {
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

		

		List<String> itemList = Arrays.asList(items);
				
		long start = System.currentTimeMillis();
		
		for(int j=0; j<100000; j++) {
			for (int i = 0; i<10; i=i+2) {
				Solution.groupAnagramStringsInList(itemList);
			}
		}
		
		long end = System.currentTimeMillis();
		
		long elapsedTime = end-start;
		
		System.out.println("Total time elapsed 1: "+ String.valueOf(elapsedTime));
		
	}

}
