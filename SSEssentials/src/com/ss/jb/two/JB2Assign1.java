/**
 * 
 */
package com.ss.jb.two;

/**
 * @author Robert Haas
 *
 */
public class JB2Assign1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (String a : args) { // Loops through input taken from arguments
			try { // Trys to convert the string input into an int
				int num = Integer.valueOf(a);
			}catch(Exception e){ // If the input cannot be converted into an int, an exception is thrown
				System.out.println("Error: You did not enter a valid number");
				continue;
			}

			int num = Integer.valueOf(a); // Converts valid inputs into ints
			if (num < 0) { // Checks to see if the number is negative
				System.out.println("Error: You did not enter a valid number");
				continue; // If the number is negative it is ignored
			}
			sum += num; // Adds valid numbers to sum
			System.out.println(num);
		}
		System.out.println("The sum of all these numbers is " + sum);
	}

}
