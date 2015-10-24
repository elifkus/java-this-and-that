package com.safkanyazilim.findwords;

import static org.junit.Assert.*;

import org.junit.Test;

public class WordFinderTest {

	@Test
	public void testCountWordsInText() {
		String text = "foo bar (foo) bar foo-bar foo_bar foo'bar bar-foo bar, foo.";
		String word = "foo";
		
		int expectedOutput = 6;
		
		int actual = WordFinder.countWordsInText(text, word);
	
		assertEquals(expectedOutput, actual);
	
		text = "kara kara (kara) bar kara-bar kara_bar kara'bar kara-foo bar, foo.";
		word = "kara";
	
		expectedOutput = 6;
		actual = WordFinder.countWordsInText(text, word);
		
		assertEquals(expectedOutput, actual);
	
	}

	@Test
	public void testCoundWordsPerformance()
	{
	      long start = System.currentTimeMillis();

	      
	      for (int i=0; i<1_000_000; i++) {
	    	  testCountWordsInText();
	      }
	      long stop = System.currentTimeMillis();
	      
	      
	      String elapsedTime = String.valueOf((stop - start));
	      
	      System.out.println("Elapsed time: " + elapsedTime);
	}
}
