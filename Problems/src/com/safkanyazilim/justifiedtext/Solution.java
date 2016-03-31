package com.safkanyazilim.justifiedtext;

import java.util.ArrayList;

/**
 * Solution for <insert problem url>
 * @author elif
 *
 */
public class Solution {
	public static ArrayList<String> fullJustify(ArrayList<String> a, int b) {
		int lineStartWordIndex = 0;
		int lineEndWordIndex = 0;
		int currentWordIndex = 0;
		
		int currentLineLength=0;
		
		ArrayList<String> justifiedLines = new ArrayList<String>();
		
		while (currentWordIndex<a.size()) {
			
			while (currentWordIndex < a.size() && b >= a.get(currentWordIndex).length() + currentLineLength) {
				lineEndWordIndex = currentWordIndex;
				currentLineLength += a.get(currentWordIndex).length();
				currentLineLength += 1;
				currentWordIndex++;
			}
			currentLineLength--;
			
			String line = justifyWordsIntoLine(a, b, lineStartWordIndex, lineEndWordIndex, currentLineLength);
			justifiedLines.add(line);
			
			currentLineLength = 0;
			lineStartWordIndex = lineEndWordIndex+1;
			
		}
		
		
		return justifiedLines;
	}
	
	public static String justifyWordsIntoLine(ArrayList<String> a, int b, int startIndex, int endIndex, int currentLineLength) {
		StringBuffer buffer = new StringBuffer();
		
		if (startIndex==endIndex || endIndex == (a.size()-1)) {
			
			while(startIndex<endIndex) {
				buffer.append(a.get(startIndex));
				buffer.append(" ");
				startIndex++;
			}
			
			buffer.append(a.get(startIndex));
			b = b - currentLineLength;
			
			while (b > 0) {
				buffer.append(" ");
				b--;
			}
		} else {
			int spaces = b - currentLineLength;
			int minimumSpace = 1 + (spaces / (endIndex - startIndex));
			int extraSpaceForLine = spaces % (endIndex - startIndex);
			
			while(startIndex < endIndex ) {
				buffer.append(a.get(startIndex));
				
				int counter = minimumSpace;
				while(counter > 0) {
					buffer.append(" ");
					counter--;
				}
				
				if (extraSpaceForLine >0) {
					buffer.append(" ");
					extraSpaceForLine--;
				}
				startIndex++;
			}
			
			buffer.append(a.get(startIndex));
		}
	
		return buffer.toString();
	}

}
