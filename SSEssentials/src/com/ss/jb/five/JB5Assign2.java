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
public class JB5Assign2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1, 22, 93, 195); // The list of integers to test
		List<Integer> rightList = rightDigit(list); // Calls the rightDigit function
		
		rightList.forEach(i -> {
			System.out.println(i); // Prints the right most digits
		});
	}

	public static List<Integer> rightDigit(List<Integer> list){
		return list.stream().map(i -> i%10).collect(Collectors.toList()); // Goes through the list and replaces the current int with the 
																		  // rightmost int
	}
}
