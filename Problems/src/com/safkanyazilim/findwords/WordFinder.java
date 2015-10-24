package com.safkanyazilim.findwords;

public class WordFinder {
	public static int countWordsInText1(String text, String word) {
		
		char[] textArr = text.toCharArray();
		int lengthOfWord = word.length();
		int count = 0;
		
		for(int i=0; i < textArr.length - lengthOfWord + 1; i++) {
			if ((i == 0 || !isWordChar(textArr[i-1])) && isWordChar(textArr[i]) ) {
				if (word.equals(text.substring(i, i+ lengthOfWord)) && 
						(i+lengthOfWord > (textArr.length - 1) || !isWordChar(textArr[i+lengthOfWord])) ) {
					count +=1;
					i = i + lengthOfWord;
				}
			}
		}
		
		return count;
	}
	
	private static boolean isWordChar(char c) {
		return (Character.isLetterOrDigit(c) || (c == '_'));
	}
	
	public static int countWordsInText2(String text, String word) {
		String[] tokens = text.split("(\\W+)");
		int count = 0;
		
		for(String token : tokens) {
			if (word.equals(token)) {
				count++;
			}
		}
		
		return count;
	}
	
	public static int countWordsInText3(String text, String word) {
		Trie root = new Trie();
		root.init(text);
		
		return root.getCount(word);
	}
	
}
