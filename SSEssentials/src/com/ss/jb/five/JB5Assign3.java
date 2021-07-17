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
public class JB5Assign3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1, 2, 3); // The list of integers to test
		List<Integer> doubleList = doubling(list); // Calls the doubleList function
		
		doubleList.forEach(i -> {
			System.out.println(i); // Prints the digits doubled
		});
	}
	
	public static List<Integer> doubling(List<Integer> list) {
		return list.stream().map(i -> i*2).collect(Collectors.toList()); // Goes through the list and replaces the current int with its doubled value
	}
}
