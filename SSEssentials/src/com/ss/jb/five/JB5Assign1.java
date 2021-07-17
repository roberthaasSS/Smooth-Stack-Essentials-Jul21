/**
 * 
 */
package com.ss.jb.five;

import java.util.Scanner;

/**
 * @author Robert Haas
 *
 */
public class JB5Assign1 {

	/**
	 * @param args
	 */
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerformOperation operation;
		
		System.out.println("Please enter how many tests you want to run");
		int amount = userInput(); // Gets how many tests the user wants to run
		
		for (int j = 0; j < amount; j++) {
			int test = 0;
			
			while (test < 1 || test > 3) { // Gets the test number to run
				System.out.println("Please enter the test number 1-3");
				test = userInput();
			}
			
			System.out.println("Please enter the number you want to test");
			int num = userInput(); // Gets the number to test
			
			switch(test) { // Runs the test based on the users input on which test to run
			case 1:
				operation = isOdd();
				System.out.println(operation.perform(num));
				break;
			case 2:
				operation = isPrime();
				System.out.println(operation.perform(num));
				break;
			case 3:
				operation = isPalindrome();
				System.out.println(operation.perform(num));
				break;
			}
		}
		scan.close();
	}
	
	public static PerformOperation isOdd() { // Checks to see if the number is even or odd
		return num -> num % 2 != 0 ? "ODD":"EVEN";
	}
	
	public static PerformOperation isPrime() { // Checks to see if the number is Prime or Composite
		return num -> {
			if (num < 2) {
				return "COMPOSITE";
			}
			for(int i = 2; i <= Math.sqrt(num); i++) {
				if (num%i == 0) {
					return "COMPOSITE";
				}
			}
			return "PRIME";
		};
	}
//	
	public static PerformOperation isPalindrome() { // Checks to see if the number is a palindrome
		return num -> Integer.parseInt(new StringBuilder(String.valueOf(num)).reverse().toString()) == num ? "PALINDROME" : "NOT PALINDROME";
	}
	
	public static int userInput() { // Gets the users input
		int userIn = 0;
		try {
			userIn = scan.nextInt();
			if (userIn < 0) {
				System.out.println("Please enter a valid number");
				userIn = userInput();
			}
		} catch (Exception e) {
			System.out.println("Please enter a valid number");
			scan.next();
			userIn = userInput();
		}
		return userIn;
	}
}
