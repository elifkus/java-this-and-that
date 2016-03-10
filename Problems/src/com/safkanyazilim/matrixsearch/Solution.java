package com.safkanyazilim.matrixsearch;

import java.util.ArrayList;


public class Solution {
	public static int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
	    int n = a.size();
	    
	    if (n < 1) {
	        return 0;
	    }
	    
	    int m = a.get(0).size();
	    
	    int totalNumbers = m * n;
	
	    int start = 0;
	    int end = totalNumbers;
	    int current = (end + start)/2;
	    int midRow = current / m;
	    int midColumn = current % m;
	    
	    while ( start < end -1) {
	        if (b == a.get(midRow).get(midColumn)) {
	            return 1;
	        } else if (b > a.get(midRow).get(midColumn)) {
	            start = current;
	        } else {
	            end = current;
	        }
	        
	        current = (end + start)/2;
	        midRow = current / m;
	        midColumn = current % m;
	    }
	    
	    return 0;
	}
	
	
}

