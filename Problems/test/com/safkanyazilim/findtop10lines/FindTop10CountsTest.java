package com.safkanyazilim.findtop10lines;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class FindTop10CountsTest {
	private static List<String> lines;
	
	@BeforeClass
	public static void readFile() {
		String projectDirectory = System.getProperty("user.dir"); 
		try(BufferedReader br = new BufferedReader(new FileReader(projectDirectory + "/testdata/useragents.txt"))) {
			System.out.println("Reading file");
			String line = br.readLine();
			
			lines = new ArrayList<String>();

			while(line!=null) {
				lines.add(line);
				line = br.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Test
	public void testFindTop10Counts() {
		assertEquals(lines.size(), 1001);
		
		List<LineCount> counts = FindTop10Counts.findTop10Counts(lines);
		assertNotNull(counts);
		assertEquals(10, counts.size());
		
		//assertEquals(expected, Solution.findCommonLetter(item1, item2));
	}

	@Test
	public void testSpeedForFindCommonLetter() {
		String[] items = {"aabbabab",
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
				//Solution.findCommonLetter(items[i], items[i+1]);
			}
		}
		
		long end = System.currentTimeMillis();
		
		long elapsedTime = end-start;
		
		System.out.println("Total time elapsed 1: "+ String.valueOf(elapsedTime));
		
	}
	
	

}
