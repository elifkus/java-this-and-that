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
	   
	    int extraSlotIndice = a.get(currentIndice);
	    int extraSlotValue = swap;
	    
	    int nextSwap;
	    int count = a.size();
	   
	    for (int i=0; i<a.size(); i++) {
	        if (a.get(i) == i) {
	            count--;
	        }
	    }
	    
	    for (int i=0; i<a.size(); i++) {
	        
	        if ((a.get(i) != i) && (i == a.get(a.get(i)))) {
	        	a.set(a.get(i), a.get(i));
	        	a.set(i, i);
	        	count = count - 2;
	        }
	    }
	    
	    while (count>0) {
	        nextSwap = a.get(currentIndice);
	        
	        //check if value is in extraslot
	        if (currentIndice == extraSlotValue) {
	        	nextIndice = extraSlotIndice;
	        } else {
	        	nextIndice = findNextIndiceWithIntermediateResult(currentIndice, a);
	        }
	        
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
	                break;
	            }
	    }
	    
	    return currentIndice;
	}
	

}
