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
	    
	    
	    int count = a.size();
	   
	    for (int i=0; i<a.size(); i++) {
	        if (a.get(i) == i) {
	            a.set(i, (-1 * a.get(i)));
	        	count--;
	        }
	    }
	    
	    for (int i=0; i<a.size(); i++) {
	        
	        if (((-1 * a.get(i)) != i) && (i == a.get(a.get(i)))) {
	        	a.set(a.get(i), (-1 *a.get(i)));
	        	a.set(i, (-1 * i));
	        	count = count - 2;
	        }
	    }
	    
	    int currentIndice;
	    
	    while ((currentIndice = findUnarrangedIndex(a)) > -1) {
	    	rearrangeStartingFromIndice(a, count, currentIndice);
	    }
	     
	    for (int i=0; i<a.size(); i++) {
		        
	    	a.set(i, (-1* a.get(i)));
		}
	}

	private static int findUnarrangedIndex(ArrayList<Integer> a) {
		int indice = -1;
		
		for (int i=0; i<a.size(); i++) {
	        
	    	if (a.get(i) > 0) {
	    		indice = i;
	    		break;
	    	}
		}
		
		return indice;
	}
	
	private static void rearrangeStartingFromIndice(ArrayList<Integer> a,
			int count, int currentIndice ) {
		
	    int nextIndice;
	    int swap = a.get(a.get(currentIndice));
	   
	    int firstIndice = a.get(currentIndice);
	    int firstSwap = swap;
	    
	    int nextSwap;
	    
	    
	    while (count>0) {
	    	System.out.println("Current indice is "+ currentIndice);
	        nextSwap = a.get(currentIndice);
	        
	        //check if value is in extraslot
	        if (currentIndice == firstSwap) {
	        	nextIndice = firstIndice;
	        } else {
	        	nextIndice = findNextIndiceWithIntermediateResult(currentIndice, a);
	        }
	        
	        a.set(currentIndice,(-1)*swap);
	        if (nextIndice < 0) {
	        	break;
	        }
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
