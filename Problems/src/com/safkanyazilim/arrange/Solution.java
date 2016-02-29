package com.safkanyazilim.arrange;

import java.util.ArrayList;

/**
 * Solution for https://www.interviewbit.com/courses/programming/topics/math/problems/arrange/
 * @author elif
 *
 */
public class Solution {
	public static void arrange(ArrayList<Integer> a) {
	    
	    if (a.size() < 2) {
	        return;
	    }
	    
	    int currentIndice = 0;
	    int nextIndice = -1;
	    int swap = a.get(a.get(currentIndice));
	   
	    int nextSwap;
	    int count = a.size();
	   
	    for (int i=0; i<a.size(); i++) {
	        if (a.get(i) == i) {
	            count--;
	        }
	    }
	    
	    while (count>0) {
	        nextSwap = a.get(currentIndice);
	        nextIndice = findNextIndiceWithIntermediateResult(currentIndice, a);
	        a.set(currentIndice, swap);
	        swap = nextSwap;
            currentIndice = nextIndice;
	        count--;

	    } 
	}
	

	public static int findNextIndiceWithIntermediateResult(int intermediate, ArrayList<Integer> a) {
	    int currentIndice = -1;
	    
	    for(int i=0; i<a.size(); i++) {
	            if (intermediate == a.get(i)) {
	                
	                currentIndice = i;
	            }
	    }
	    
	    return currentIndice;
	}
	
	public static int findNextIndiceWithResult(int value, ArrayList<Integer> a) {
	    int currentIndice = -1;
	    
	    for(int i=0; i<a.size(); i++) {
	            if (value == a.get(a.get(i))) {
	                
	                currentIndice = i;
	            }
	    }
	    
	    return currentIndice;
	}

}
