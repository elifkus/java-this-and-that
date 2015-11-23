package com.safkanyazilim.skyline;


public class Height implements Comparable<Height> {
	private int startIndex;
	private Integer length;
	
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
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}

	@Override
	public int compareTo(Height o) {
		return this.length.compareTo(o.getLength());
	}
	
	
}
