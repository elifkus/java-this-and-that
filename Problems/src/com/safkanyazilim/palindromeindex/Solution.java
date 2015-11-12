package com.safkanyazilim.palindromeindex;

import java.util.Scanner;

/**
 * Solution for <insert problem url>
 * @author elif
 *
 */
public class Solution {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try(Scanner scan = new Scanner(System.in)) {
        
	        int no = scan.nextInt();
	        
	        for(int j=0; j<no; j++) {
	        	String str = scan.next();
	            
	        	int letters = -1;
	            
	            for(int i=0; i<str.length()/2; i++) {
	                if (str.charAt(i) != str.charAt(str.length()-1-i)) {
	                    if (isPalindrome(str.substring(i,str.length()-1-i))) {
	                        letters=str.length()-1-i;
	                    } else {
	                        letters = i;
	                    }
	                    break;
	                }
	            }
	            
	            System.out.println(letters);
	        }
        }
    }
	
	public static int palindromeIndex(String str) {
		int letters = -1;
        
        for(int i=0; i<str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)) {
                if (isPalindrome(str.substring(i,str.length()-1-i))) {
                    letters=str.length()-1-i;
                } else {
                    letters = i;
                }
                break;
            }
        }
        
        return letters;
	}
    
    private static boolean isPalindrome(String str) {
        for(int i=0; i<str.length()/2; i++) {
                if (str.charAt(i) != str.charAt(str.length()-1-i)) {
                    return false;   
                }
            }
        
        return true;
    }

}
