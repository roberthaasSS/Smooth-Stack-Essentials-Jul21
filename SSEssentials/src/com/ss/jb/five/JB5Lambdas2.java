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
public class JB5Lambdas2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listInterface listInt = eString();
		List<Integer> list = Arrays.asList(3,44); // This is the list to test
		
		System.out.println(listInt.e(list));
	}
	
	public static listInterface eString() { // Goes through the list and checks to see if the current int is even or odd, then adds the string
		return list -> list.stream().map(i -> i%2 == 0 ? "e" + i : "o" + i).collect(Collectors.joining(","));
	}

}
