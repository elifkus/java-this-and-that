package com.safkanyazilim.letterislands;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.zip.CRC32;

import com.safkanyazilim.datastructures.trie.SuffixTrie;

/**
 * Solution for https://www.hackerrank.com/challenges/letter-islands
 * @author elif
 *
 */
public class Solution {
	public static void main(String[] args) {
			
		try (Scanner scanner = new Scanner(System.in)) { 
			
			String str1 = scanner.next();
			int noOfIslands = scanner.nextInt();
		
			int result = findNoOfSubstringsThatMakeNIslandsFaster(str1, noOfIslands);
			System.out.println(result);
		
		}		
		
	}	
	
	public static int findNoOfSubstringsThatMakeNIslands(String str, int n) {
		
		int satisfyingSubstringCount  = 0;
		
		HashSet<String> set = new HashSet<String>();
		
		for (int lengthToCheck = str.length() / n; lengthToCheck > 0; lengthToCheck--) {
			
			for (int index = 0; index < str.length() - lengthToCheck + 1; index++) {

				String substring = str.substring(index, index + lengthToCheck);
				
				
				if (!set.contains(substring)) {
					
					if (checkIfSubstringMakesNIslands(str, substring, n)) {
						satisfyingSubstringCount++;
					}
					
					set.add(substring);
				}
				
			}
			
		}
		
		return satisfyingSubstringCount;
	}
	
public static int findNoOfSubstringsThatMakeNIslandsFaster(String str, int n) {
		
		
		int satisfyingSubstring  = 0;
		
		HashSet<Long> set = new HashSet<Long>();
		char[] charArray = str.toCharArray();
		
		for (int lengthToCheck = str.length() / n; lengthToCheck > 0; lengthToCheck--) {
			
			for (int index = 0; index < str.length() - lengthToCheck + 1; index++) {
				Long hash = calculateHash(charArray, index, lengthToCheck);
				
				if (!set.contains(hash) && checkIfSubstringMakesNIslandsFaster(charArray, index, lengthToCheck, n)) {
					
					System.out.print("Round: " + String.valueOf(index));
					satisfyingSubstring++;
					System.out.println(" Count of island: " + String.valueOf(satisfyingSubstring));
					set.add(hash);
				}
				
			}
			
		}
		
		return satisfyingSubstring;
	}

	public static long findNoOfSubstringsThatMakeNIslandsWithTrie(String string, int n) {
		SuffixTrie trie = new SuffixTrie();
		trie.construct(string);
		
		return trie.findSubstringCountThatMakeNNumberOfIslands(n);
		
	}

	public static long calculateHash(char[] arr, int startIndex, int length) {
		
		ByteBuffer bb = StandardCharsets.US_ASCII.encode(CharBuffer.wrap(arr, startIndex, length));
		byte[] b = new byte[bb.remaining()];
		bb.get(b);
		
		CRC32 crc = new CRC32();
	    crc.update(b);
	    return crc.getValue();
	}

	public static boolean checkIfSubstringMakesNIslands(String str, String sub, int n) {
		int countOfIsland = 0;
		boolean inIslandFlag = false;
		int lastInIslandIndex = 0;
		
		for(int i=0; i<str.length()-sub.length() + 1; i++) {
			if (sub.equals(str.substring(i,i+sub.length()))) {

				if (!inIslandFlag) {
					System.out.print("Round: " + String.valueOf(i));
					countOfIsland++;
					System.out.println(" Count of island: " + String.valueOf(countOfIsland));

					if (countOfIsland > n) {
						break;
					}
				}
				
				lastInIslandIndex = i+sub.length()-1;
				inIslandFlag = true;
			} else if (i > lastInIslandIndex){
				inIslandFlag = false;
			}
		}
		
		
		return countOfIsland == n;
	}
	
	public static boolean checkIfSubstringMakesNIslandsFaster(char[] arr, int startIndex, int length, int n) {
		int subIndex = startIndex;
		int index = 0;
		boolean[] marker = new boolean[arr.length];
		int count = 0;
		
		while (count <= n && index <= arr.length-1) {
			if (arr[index] ==  arr[subIndex] ) {
				
				subIndex++;
			} else if (subIndex > startIndex) {
				index = index - (subIndex - startIndex - 1);
				subIndex = startIndex;
				
				if (arr[index] ==  arr[subIndex]) {
					subIndex++;
				}
			
			}
			
			if (subIndex == startIndex + length) {
				subIndex = startIndex;
				int markerStartIndex = index - length + 1;
				
				for (int i=markerStartIndex; i<=index; i++) {
					marker[i] = true;
				} 
				
				if (markerStartIndex-1<0 || !marker[markerStartIndex-1]) {
					count++;
				}
				
				index = markerStartIndex;
				
			} 
			
			index++;
		}
		
		
		
		return count == n;
	}

}
