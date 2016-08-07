package com.safkanyazilim.questionchooser;

public class ProblemLocation {
	public int chapter;
	public int number;
	
	public ProblemLocation(int chapter, int number) {
		 this.chapter = chapter;
		 this.number = number;
	}
	
	@Override
	public String toString() {
		return String.format("%d.%d", chapter, number);
	}

}
