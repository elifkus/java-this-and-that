package com.safkanyazilim.sortedsearchnosize;

public class Listy {
	private int[] numbers;
	
	public Listy(int... args) {
		this.numbers = args;
	}
	
	public int elementAt(int i) {
		if (i< 0 || i > numbers.length-1) {
			return -1;
		} else {
			return this.numbers[i];
		}
	}

}
