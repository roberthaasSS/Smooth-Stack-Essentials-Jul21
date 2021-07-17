/**
 * 
 */
package com.ss.jb.five;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Robert Haas
 *
 */
public class JB5Lambdas3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aListInterface aList = aStrList();
		
		System.out.println(aList.a(Arrays.asList("Hello", "app", "Add", "get", "dad", "add", "apple"))); // The list to test
	}
	
	public static aListInterface aStrList() {
		return list -> list.stream().filter(i -> i.charAt(0) == 'a' && i.length() == 3).collect(Collectors.toList()); // Goes through the list 
		 																		//and filters by strings that start with "a" and have length 3
	}

}
