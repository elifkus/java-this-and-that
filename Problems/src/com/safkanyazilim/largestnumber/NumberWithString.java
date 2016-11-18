package com.safkanyazilim.largestnumber;

public class NumberWithString implements Comparable<NumberWithString>, CharSequence{

	private static int[] powers = {1, 10, 100, 1_000, 10_000, 100_000, 
			                       1_000_000, 10_000_0000, 100_000_000,
			                       1_000_000_000};
	
	private int number;
	private String string;
	
	public NumberWithString(int number) {
		this.number = number;
		this.string = Integer.toString(number);
	}

	public int getNumber() {
		return number;
	}

	public String getString() {
		return string;
	}

	@Override
	public int compareTo(NumberWithString other) {
		return powers[this.string.length()]*other.getNumber() + this.getNumber()
	           - powers[other.string.length()]*this.getNumber() - other.getNumber();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof NumberWithString) {
			return ((NumberWithString)obj).number == this.number;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return this.string;
	}

	@Override
	public int length() {
		return this.string.length();
	}

	@Override
	public char charAt(int index) {
		return this.string.charAt(index);
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		return this.string.subSequence(start, end);
	}
	
}
