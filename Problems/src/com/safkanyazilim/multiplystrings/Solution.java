package com.safkanyazilim.multiplystrings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Solution for <insert problem url>
 * @author elif
 *
 */
public class Solution {
	public static String multiply(String a, String b) {
	    int noOfDigitsOfA = a.length();
	    int noOfDigitsOfB = b.length();
	    String result = "";
	   
	    if (noOfDigitsOfB < 9 && noOfDigitsOfA < 9) {
	        long numberA = Long.parseLong(a);
	        long numberB = Long.parseLong(b);
	        result = String.valueOf(numberA * numberB);
	    } else {
	        List<Long> resultList = new ArrayList<Long>();
	        List<Long> aList = parseStringToNumberList(a, noOfDigitsOfA);
	        List<Long> bList = parseStringToNumberList(b, noOfDigitsOfB);
	        int index;
	        long multiplied;
	        int resultListSize = 0;
	        
	        for(int i=0; i<aList.size(); i++) {
	            for(int j=0; j<bList.size(); j++) {
	                index = i+j;
	                multiplied = aList.get(i) * bList.get(j);
	                
	                if (resultListSize <= index) {
	                    
	                    int count = resultListSize;
	                    while(count<=index) {
	                        resultList.add(0l);
	                        count++;
	                        resultListSize++;
	                    }
	                    
	                }
	                
                    Long number = resultList.get(index);
                    resultList.set(index, number+multiplied);
                
	            }
	        }
	        result = convertResultListToString(resultList);
	    }
	    
	    return result;
	}
	
	public static String convertResultListToString(List<Long> resultList) {
	    long overflow = 0;
	    
	    for(int i=0; i<resultList.size(); i++) {
	        if (resultList.get(i) > 99999999) {
	            overflow =  resultList.get(i) / 100000000l;
	            resultList.set(i, resultList.get(i) % 100000000l);
	            if (i+1>=resultList.size())  {
	            	int count = resultList.size();
                    while(count<=i+1) {
                        resultList.add(0l);
                        count++;
                    }
 	               
	            }
	            resultList.set(i+1, resultList.get(i+1) + overflow);
	        } 
	    }
	    
	    StringBuffer resultBuff= new StringBuffer(resultList.size()*8);
	    boolean isAlwaysZero = true;
	    boolean last = true;
	    for(int i=resultList.size()-1; i>=0; i--) {
            if (isAlwaysZero && resultList.get(i) != 0) {
                isAlwaysZero = false;
            }
            if (!last) {
            	if (resultList.get(i) < 10000000) {
            		padNumberWithZeros(resultList, resultBuff, i);
            	}
            	
            } else {
            	last = false;
            }
            
	        resultBuff.append(resultList.get(i));     
	    }
	    
	    if (isAlwaysZero) {
	        resultBuff.setLength(0);
	        resultBuff.append("0");
	    }
	    
	    return resultBuff.toString();
	}

	private static void padNumberWithZeros(List<Long> resultList,
			StringBuffer resultBuff, int i) {
		int count = resultList.get(i).toString().length();
		
		while (count < 8) {
			 resultBuff.append("0");
			 count++;
		}
	}
	
	public static List<Long> parseStringToNumberList(String stringNumber, int length) {
	    long number;
	    List<Long> numberList = new ArrayList<Long>();
	    int i = length;
	    for (; i>=8; i=i-8) {
	        number = Long.parseLong(stringNumber.substring(i-8,i));
	        
	        numberList.add(number);
	    }
	    
	    if (i>0) {
	        number = Long.parseLong(stringNumber.substring(0, i));
	        
	        numberList.add(number);
	    }
	    
	    
	    return numberList;
	}

	public static String multiply2(String A, String B) {
	    ArrayList<Character> res = new ArrayList<>();
	    int i;
	    int n, m;
	    
	    n = A.length();
	    for (i = 0; i < n && A.charAt(i) == '0'; i++);
	    if (i == n)
	        return "0";
	        
	    A = A.substring(i, n);
	    
	    n = B.length();
	    for (i = 0; i < n && B.charAt(i) == '0'; i++);
	    if (i == n)
	        return "0";
	        
	    B = B.substring(i, n);
	    
	    int carry = 0;
	    char cA, cB;
	    char c;
	    
	    m = A.length();
	    n = B.length();
	    int index = 0;
	    
	    for (i = m - 1; i >= 0; i--) {
	        
	        cA = A.charAt(i);
	        int a = cA - '0';
	        int b;
	        int num;
	        int curIndex = index;
	        
	        for (int j = n - 1; j >= 0; j--) {
	            cB = B.charAt(j);
	            b = cB - '0';
	            num = a * b + carry;
	            carry = num / 10;
	            num %= 10;
	            c = (char) (num + '0');
	            
	            if (curIndex >= res.size())
	                res.add(c);
	            else {
	                num += res.get(curIndex) - '0';
	                carry += (num / 10);
	                num %= 10;
	                c = (char) (num + '0');
	                res.set(curIndex, c);
	            }
	            
	            curIndex++;
	        }
	        
	        c = (char) (carry + '0');
	        carry = 0;
	        res.add(c);
	        
	        index++;
	    }
	    
	    Collections.reverse(res);
	    
	    StringBuilder str = new StringBuilder();
	    
	    i = 0;
	    n = res.size();
	    
	    while (i < n && res.get(i) == '0')
	        i++;
	    
	    for (; i < n; i++)
	        str.append(res.get(i));
	    
	    return str.toString();
	    
	}
}
