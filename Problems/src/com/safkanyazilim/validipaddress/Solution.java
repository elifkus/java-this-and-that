package com.safkanyazilim.validipaddress;

import java.util.ArrayList;



/**
 * Solution for <insert problem url>
 * @author elif
 *
 */
public class Solution {
	public static ArrayList<String> restoreIpAddresses(String a) {
		return null;
	}
	
	public ArrayList<String>  putPoints(String a) {
		int minPartLength = a.length() / 4;
		int maxPartLength = a.length() > 5 ? 3 : (a.length() - 3);
		
		ArrayList<String> list = new ArrayList<>();
		
		int counter = 0;
		int partCounter = 0;
		int partLength = 0;
		
		for(int i=1; i<a.length(); i++) {
			partLength = +1;
			if (minPartLength>partLength) {
				//do nothing
			} else if (minPartLength<partLength)  {
				
			}
		}
		
		return null;
	}
}
