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
	    int mid;
	    int start, end;
	    int count;
	    int num;
	    int n = A.size();
	    
	    count = n;
	    
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
	        
	        if (B == num)
	            return mid;
	        
	        if (B < num)
	            end = mid - 1;
	            
	        else
	            start = mid + 1;
	            
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
	    //System.out.print("start:" + start);
	    int end = a.size()-1;
	    //System.out.print(" start:" + start);
        //System.out.print(" end:" + end);
	    int result = binarySearch(a, start, end, b);
	    
	    if (result<0 && start>0) {
	        //System.out.print(" In second binary search ");
	        end = start-1;
	        start = 0;
	        //System.out.print(" start:" + start);
            //System.out.print(" end:" + end);
	        result = binarySearchAlternativeImpl(a, start,end,b);
	    }
	    
	    return result;
	    /*while(a.get(start) <= a.get(end)) {
	        if (end >= start) {
	            mid = (start + (end-start)/2) % a.size();    
	        } else {
	            mid = (start + (((a.size()-1) + end-start)/2)) % a.size() ;
	        }
	        
	        //System.out.print(" start:" + start);
            //System.out.print(" end:" + end);
	        //System.out.print(" mid:" + mid);

	        if(a.get(mid) == b) {
	           //System.out.print(" equal ");

	            return mid;
	        } else if (a.get(mid)>b) {
	            end = (mid == 0) ? a.size()-1 : (mid-1);
	            //System.out.print(" greater ");
	        }  else {
	            start = (mid+1) % a.size();
	            //System.out.print(" smaller ");
	        }
	    }*/
	    
	    
	}
	
	public int binarySearchAlternativeImpl(final List<Integer> a, int start, int end, int b) {
	    int mid;
	    while(start < a.size() && end > -1 && a.get(start) <= a.get(end)) {
	        mid = (start + (end-start)/2);    
	        
	        
	        //System.out.print(" start:" + start);
            //System.out.print(" end:" + end);
	        //System.out.print(" mid:" + mid);

	        if(a.get(mid) == b) {
	           //System.out.print(" equal ");

	            return mid;
	        } else if (a.get(mid)>b) {
	            end =(mid-1);
	            //System.out.print(" greater ");
	        }  else {
	            start = (mid+1);
	            //System.out.print(" smaller ");
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
