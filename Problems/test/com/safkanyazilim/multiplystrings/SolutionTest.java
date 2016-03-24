package com.safkanyazilim.multiplystrings;

import static org.junit.Assert.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		String expected = "290851027081985078955918627261751688832742312387314888842460711865148550965912482730570750031304678344564428861596637320";
		//				   296113288804398438030323148579358561561718519455166228957691417789928
		assertEquals(expected, Solution.multiply(item1, item2));
	}
	
	@Test
	public void testMultiply5() {
		String item1 = "2373370";
		String item2 = "91250836";
		String expected = "216571996637320";
		//				   
		assertEquals(expected, Solution.multiply(item1, item2));
	}
	
	@Test
	public void testMultiply6() {
		String item1 = "1197982102373370";
		String item2 = "4406534291250836";
		String expected = "5278949214413024428861596637320";
		//				   52789499463782	 
		assertEquals(expected, Solution.multiply(item1, item2));
	}
	
	public static String calculateMultiplication(String item1, String item2) {
		BigInteger number1 = new BigInteger(item1);
		BigInteger number2 = new BigInteger(item2);
		BigInteger result = number1.multiply(number2);
		return result.toString();
	}
	
	@Test
	public void testParseStringToNumberList1() {
		String item = "1197982102373370";
		List<Long> expected = new ArrayList<Long>(Arrays.asList(11979821l, 02373370l));
		List<Long> actual = Solution.parseStringToNumberList(item, 16);
		
		assertNotNull(actual);
		assertEquals(2,actual.size());
		assertEquals(expected.get(0), actual.get(0));
		assertEquals(expected.get(1), actual.get(1));
	}

	@Test
	public void testParseStringToNumberList2() {
		String item = "4406534291250836";
		List<Long> expected = new ArrayList<Long>(Arrays.asList(44065342l, 91250836l));
		List<Long> actual = Solution.parseStringToNumberList(item, 16);
		
		assertNotNull(actual);
		assertEquals(2,actual.size());
		assertEquals(expected.get(0), actual.get(0));
		assertEquals(expected.get(1), actual.get(1));	}
}
