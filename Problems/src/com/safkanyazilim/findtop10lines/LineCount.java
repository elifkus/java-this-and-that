package com.safkanyazilim.findtop10lines;


public class LineCount implements Comparable<LineCount>{
	private String line;
	private int count;
	
	public LineCount(String line, int count) {
		this.line = line;
		this.count = count;
	}
	
	public String getLine() {
		return line;
	}

	public int getCount() {
		return count;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || this.getClass() != obj.getClass()) {
			return false;
		}
		
		return line.equals(obj);
	}

	@Override
	public int compareTo(LineCount o) {
		return this.count - o.count;
	}
	
	@Override
	public int hashCode() {
		return this.line.hashCode();
	}

	@Override
	public String toString() {
		
		return this.line + " : " + this.count;
	}
}
