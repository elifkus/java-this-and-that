package com.safkanyazilim.findwords;

public class Trie {
	private Trie[] children;
	private int count;
	private String text;
	
	public Trie() {
		this.children = new Trie[27];
	}
	
	public void init(String text) {
		this.text = text;
		char[] textArr = this.text.toCharArray();
		Trie current = this;
		boolean inWord = false;
		
		for (int i=0; i<textArr.length; i++) {
			
			while((i<textArr.length) && isWordChar(textArr[i])) {
				inWord = true;
				int index = findTrieIndex(textArr[i]);
				
				if (current.children[index] == null) {
					current.children[index] = new Trie(); 
				}
				
				current = current.children[index];
				i++;
			}
			
			if (inWord) {
				current.count++;
				this.count++;
				inWord = false;
				current = this;
			}
		}
		
		if (inWord) {
			current.count++;
			this.count++;
			inWord = false;
		}
	}
	
	public int getCount(String s) {
		Trie node = this;
		for (int i = 0; i < s.length(); i++) {
			
			int index = findTrieIndex(s.charAt(i));
			Trie child = node.children[index];
			if (child == null) {
				// There is no such word
				return 0;
			}
			node = child;
		}
		return node.count;
	}
	
	private static int findTrieIndex(char c) {
		
		if(c == '_') {
			return 26;
		} 
		else {
			return c - 'a';
		}
	}
	
	private static boolean isWordChar(char c) {
		return (Character.isLetterOrDigit(c) || (c == '_'));
	}
	
}
