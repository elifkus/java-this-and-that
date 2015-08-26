package com.safkanyazilim.skyline;

import java.util.ArrayList;
import java.util.List;

public class SkyLine {
	private List<Height> heights;
	
	public SkyLine(int... heights) {
		this.heights = new ArrayList<Height>(heights.length);
		
		for (int i=0; i<heights.length; i++) {
			Height height = new Height(i, heights[i]);
			this.heights.add(height);
		}
	}
	
	public List<Height> getHeights() {
		return heights;
	}

	private class Height {
		private int startIndex;
		private int length;
		
		public Height(int startIndex, int length) {
			this.startIndex=startIndex;
			this.length=length;
		}
		
		
		public int getStartIndex() {
			return startIndex;
		}
		public void setStartIndex(int startIndex) {
			this.startIndex = startIndex;
		}
		public int getLength() {
			return length;
		}
		public void setLength(int length) {
			this.length = length;
		}
	}
}


