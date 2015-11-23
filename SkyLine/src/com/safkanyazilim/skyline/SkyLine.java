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

	public List<Integer> getHeightIndices() {
		ArrayList<Integer> list = new ArrayList<>();
		
		this.heights.forEach((item) -> {  list.add(item.getStartIndex()); });
		
		return list;
		
	}
}


