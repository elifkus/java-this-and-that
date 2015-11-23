package com.safkanyazilim.skyline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class BiggestRectangleFinder {

	private List<Height> sortSkyHeights(SkyLine skyLine) {
		List<Height> heights = new ArrayList<>(skyLine.getHeights());
		Collections.sort(heights);
		return heights;
	}
	
	private int findAreaOfRectangle(int startIndex, Integer endIndex, int height) {
		int width = endIndex - startIndex + 1;
		return width * height;
	}
	
	public void findBiggestRectangle(SkyLine skyLine) {
		List<Height> sortedHeights = sortSkyHeights(skyLine);
		
		Integer[] indices = (Integer[])skyLine.getHeightIndices().toArray();
		
		Height toBeRemoved = sortedHeights.get(0);
		int maxArea = findAreaOfRectangle(indices[0], indices[indices.length - 1], toBeRemoved.getLength());
		
		sortedHeights.remove(toBeRemoved);
		int removedIndex = toBeRemoved.getStartIndex();
		toBeRemoved = sortedHeights.get(0);
		
		findAreaOfRectangle(indices[0], indices[removedIndex-1], toBeRemoved.getLength());
		findAreaOfRectangle(indices[removedIndex+1], indices[indices.length-1], toBeRemoved.getLength());		
	}
}
