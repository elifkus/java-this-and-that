package com.safkanyazilim.multiplystrings;

import java.util.ArrayList;
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
	                index = Math.max(i,j);
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
	    System.out.print("Result list size is : "+ resultList.size() + ".");
	    long overflow = 0;
	    for(int i=0; i<resultList.size(); i++) {
	        if (resultList.get(i) > 99999999) {
	            overflow =  resultList.get(i) / 100000000l;
	            resultList.set(i, resultList.get(i) % 100000000l);
	            if (i+1<resultList.size()) {
	               resultList.set(i+1, resultList.get(i+1) + overflow);
	            } else {
	                resultList.add(overflow);
	            }
	        } 
	    }
	    System.out.print("Result list size is : "+ resultList.size() + ".");

	    StringBuffer resultBuff= new StringBuffer(resultList.size()*8);
	    boolean isAlwaysZero = true;

	    for(int i=resultList.size()-1; i>=0; i--) {
            if (isAlwaysZero && resultList.get(i) != 0) {
                isAlwaysZero = false;
            }
	        resultBuff.append(resultList.get(i));     
	    }
	    
	    if (isAlwaysZero) {
	        resultBuff.setLength(0);
	        resultBuff.append("0");
	    }
	    
	    return resultBuff.toString();
	}
	
	public static List<Long> parseStringToNumberList(String stringNumber, int length) {
	    long number;
	    List<Long> numberList = new ArrayList<Long>();
	    int i = 8;
	    for (; i<length; i=i+8) {
	        number = Long.parseLong(stringNumber.substring(i-8,i));
	        
	        numberList.add(number);
	    }
	    
	    if (((length) % 8)!=0) {
	        number = Long.parseLong(stringNumber.substring(i-8, length));
	        
	        numberList.add(number);
	    }
	    
	    
	    return numberList;
	}

}
