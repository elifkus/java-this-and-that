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
		    int end = totalNumbers-1;
		    int current;
		    int midRow;
		    int midColumn;

		    while ( start <= end ) {
		        current = (end + start)/2;
		        midRow = current / m;
		        midColumn = current % m;
		        
		        if (b == a.get(midRow).get(midColumn)) {
		            return 1;
		        } else if (b > a.get(midRow).get(midColumn)) {
		            start = current + 1;
		        } else {
		            end = current - 1;
		        }
		        
		       

		    }
		    
		    return 0;
	}
	
	
}

