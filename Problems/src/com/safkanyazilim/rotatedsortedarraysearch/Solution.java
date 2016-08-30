package com.safkanyazilim.rotatedsortedarraysearch;

import java.util.List;
import java.util.Scanner;


/**
 * Solution for <insert problem url>
 * @author elif
 *
 */
public class Solution {
	public static int search(final List<Integer> A, int B) {
	    int start, end;
	    int n = A.size();
	    
	    int pivot = getMinElementIndex(A);
	    
	    start = pivot;
	    end = n - 1;
	    
	    int res = binarySearch(A, start, end, B);
	    
	    if (res == -1) {
	        start = 0;
	        end = pivot - 1;
	        res = binarySearch(A, start, end, B);
	    }
	        
	    return res;
	}
	
	public static int binarySearch(final List<Integer> A, int start, int end, int B) {
	    
	    int count = end - start + 1;
	    int num, mid;
	    
	    while (count > 0) {
	        mid = start + (end - start) / 2;
	        num = A.get(mid);
	        
	        if (B == num) {
	            return mid;
	        }
	        
	        if (B < num) {
	            end = mid - 1;
	        } else {
	            start = mid + 1;
	        }
	        
	        count /= 2;
	    }
        
        return -1;
	}
	
	public static int getMinElementIndex(final List<Integer> A) {
	    int first, last, start, end;
	    int count, num, n;
	    int mid;
	    int next, prev;
	    
	    n = A.size();
	    count = n;
	    first = A.get(0);
	    last = A.get(n - 1);
	    start = 0;
	    end = n - 1;
	    
	    while (count > 0) {
	        
	        mid = start + (end - start) / 2;
	        
	        num = A.get(mid);
	        next = A.get((mid + 1) % n);
	        prev = A.get((mid - 1 + n) % n);
	        
	        if (num < prev && num < next) {
	            return mid;
	        }
	        
	        if (num > first && num > last)
	            start = mid + 1;
	        else 
	            end = mid - 1;
	        
	        count /= 2;
	    }
	    
	    return -1;
	    
	}
	
	public int searchAlternativeImpl(final List<Integer> a, int b) {
	    int start = findStartIndex(a);

	    int end = a.size()-1;
	    int result = binarySearch(a, start, end, b);
	    
	    if (result<0 && start>0) {
	        end = start-1;
	        start = 0;
	        result = binarySearchAlternativeImpl(a, start,end,b);
	    }
	    
	    return result;
	    
	}
	
	public int binarySearchAlternativeImpl(final List<Integer> a, int start, int end, int b) {
	    int mid;
	    while(start < a.size() && end > -1 && a.get(start) <= a.get(end)) {
	        mid = (start + (end-start)/2);    
	        
	        if(a.get(mid) == b) {
	            return mid;
	        } else if (a.get(mid)>b) {
	            end =(mid-1);
	        }  else {
	            start = (mid+1);
	        }
	    }
	    return -1;
	}

	public int findStartIndex(final List<Integer> a) {
	    for(int i=0; i<a.size()-1;i++) {
	        if (a.get(i+1)<a.get(i) ) {
	            return i+1;
	        }
	    }
	    return 0;
	}	

}
