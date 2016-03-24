package com.safkanyazilim.multiplystrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testMultiply1() {
		String item1 = "12";
		String item2 = "5";
		String expected = "60";
		
		assertEquals(expected, Solution.multiply(item1, item2));
	}

	@Test
	public void testMultiply2() {
		String item1 = "99999999";
		String item2 = "2";
		String expected = "199999998";
		
		assertEquals(expected, Solution.multiply(item1, item2));
	}

	@Test
	public void testMultiply3() {
		String item1 = "48794287394823794234";
		String item2 = "0";
		String expected = "0";
		
		assertEquals(expected, Solution.multiply(item1, item2));
	}

	@Test
	public void testMultiply4() {
		String item1 = "5131848155574784703269632922904933776792735241197982102373370";
		String item2 = "56675688419586288442134264892419611145485574406534291250836";
		String expected = "29085102708198507895591862726175168883274231238731488884246071186514855096";
		
		assertEquals(expected, Solution.multiply(item1, item2));
	}
	
	

}
