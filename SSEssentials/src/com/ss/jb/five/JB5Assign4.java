/**
 * 
 */
package com.ss.jb.five;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Robert Haas
 *
 */
public class JB5Assign4 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("xxax", "xbxbx", "xxcx"); // The list of strings to test
		List<String> xList = noX(list); // Calls the noX function
		
		xList.forEach(i -> {
			System.out.println(i); // Prints the strings with no x
		});
	}
	
	public static List<String> noX(List<String> list) {
		return list.stream().map(i -> i.replace("x", "")).collect(Collectors.toList()); // Goes through the list and removes "x" from the strings
	}
}
