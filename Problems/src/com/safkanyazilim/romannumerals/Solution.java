package com.safkanyazilim.romannumerals;

public class Solution {
	public static String integerToRomanNumerals(int number) {
		if (number < 1 || number > 3999) {
			return null;
		}
		
		int[] numbers = {1000, 500, 100, 50, 10, 5, 1};
		String[] numerals = {"M", "D", "C", "L", "X", "V", "I"};
		
		StringBuilder romanNumber = new StringBuilder();
		
		int index = 0;
		while (number > 0) {
			int count = number / numbers[index];

			if (count > 0) {
				if (count == 9) {
					romanNumber.append(numerals[index]);
					romanNumber.append(numerals[index-2]);
				} else if (count >= 5) {
					romanNumber.append(numerals[index+1]);
					
					for (int i=0; i<count-5; i++) {
						romanNumber.append(numerals[index]);
					}
				} else if (count == 4) {
					romanNumber.append(numerals[index]);
					romanNumber.append(numerals[index+1]);
				} else {
					for (int i=0; i<count; i++) {
						romanNumber.append(numerals[index]);
					}
				}
				
				
				number = number % (numbers[index] * count);
			} 
			
			index=index+2;
			
		}
		
		
		return romanNumber.toString();
	}

}
