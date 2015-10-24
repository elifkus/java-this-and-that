package com.safkanyazilim.findwords;

import static org.junit.Assert.*;

import org.junit.Test;

public class WordFinderTest {

	@Test
	public void testCountWordsInText1() {
		String text = "foo bar (foo) bar foo-bar foo_bar foo'bar bar-foo bar, foo.";
		String word = "foo";
		
		int expectedOutput = 6;
		
		int actual = WordFinder.countWordsInText1(text, word);
	
		assertEquals(expectedOutput, actual);
	
		text = "kara kara (kara) bar kara-bar kara_bar kara'bar kara-foo bar, kara";
		word = "kara";
	
		expectedOutput = 7;
		actual = WordFinder.countWordsInText1(text, word);
		
		assertEquals(expectedOutput, actual);
	
	}
	
	@Test
	public void testCountWordsInText2() {
		String text = "foo bar (foo) bar foo-bar foo_bar foo'bar bar-foo bar, foo.";
		String word = "foo";
		
		int expectedOutput = 6;
		
		int actual = WordFinder.countWordsInText2(text, word);
	
		assertEquals(expectedOutput, actual);
	
		text = "kara kara (kara) bar kara-bar kara_bar kara'bar kara-foo bar, kara";
		word = "kara";
	
		expectedOutput = 7;
		actual = WordFinder.countWordsInText2(text, word);
		
		assertEquals(expectedOutput, actual);
	
	}

	@Test
	public void testCountWordsInText3() {
		String text = "foo bar (foo) bar foo-bar foo_bar foo'bar bar-foo bar, foo.";
		String word = "foo";
		
		int expectedOutput = 6;
		
		int actual = WordFinder.countWordsInText3(text, word);
	
		assertEquals(expectedOutput, actual);
	
		text = "kara kara (kara) bar kara-bar kara_bar kara'bar kara-foo bar, kara";
		word = "kara";
	
		expectedOutput = 7;
		actual = WordFinder.countWordsInText3(text, word);
		
		assertEquals(expectedOutput, actual);
	
	}
	
	@Test
	public void testCoundWordsPerformance()
	{
	      long start = System.currentTimeMillis();

	      for (int i=0; i<1_000_000; i++) {
	    	  testCountWordsInText1();
	      }
	      long stop = System.currentTimeMillis();
	      
	      
	      String elapsedTime = String.valueOf((stop - start));
	      
	      System.out.println("Elapsed time for 1: " + elapsedTime);
	      
	      
	      start = System.currentTimeMillis();

	      for (int i=0; i<1_000_000; i++) {
	    	  testCountWordsInText2();
	      }
	      stop = System.currentTimeMillis();
	      
	      
	      elapsedTime = String.valueOf((stop - start));
	      
	      System.out.println("Elapsed time for 2: " + elapsedTime);

	      
	      start = System.currentTimeMillis();

	      for (int i=0; i<1_000_000; i++) {
	    	  testCountWordsInText3();
	      }
	      stop = System.currentTimeMillis();
	      
	      
	      elapsedTime = String.valueOf((stop - start));
	      
	      System.out.println("Elapsed time for 3: " + elapsedTime);

	}
	
}
