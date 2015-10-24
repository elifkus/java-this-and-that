package com.safkanyazilim.findwords;

public class WordFinder {
	public static int countWordsInText(String text, String word) {
		
		char[] textArr = text.toCharArray();
		int lengthOfWord = word.length();
		int count = 0;
		
		for(int i=0; i < textArr.length - lengthOfWord; i++) {
			if ((i == 0 || !isWordChar(textArr[i-1])) && isWordChar(textArr[i]) ) {
				if (word.equals(text.substring(i, i+ lengthOfWord)) && 
						(i+lengthOfWord > textArr.length || !isWordChar(textArr[i+lengthOfWord])) ) {
					count +=1;
				}
			}
		}
		
		return count;
	}
	
	private static boolean isWordChar(char c) {
		return (Character.isLetterOrDigit(c) || (c == '_'));
	}
}
