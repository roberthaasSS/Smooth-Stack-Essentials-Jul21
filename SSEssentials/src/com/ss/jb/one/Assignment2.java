/**
 * 
 */
package com.ss.jb.one;

import java.util.Random;
import java.util.Scanner;


/**
 * @author Robert Haas
 * Assignment 2 of JB 1
 */
public class Assignment2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int rand_int = rand.nextInt(100) + 1;
		int low = rand_int - 10;
		int high = rand_int + 10;
//		System.out.print(rand_int);
		
		int guess = userInput();
		
		for (int i = 0; i <= 4; i++) { // Loops through to see if the guess was correct or not
			if (i == 4) { // Checks if it is the 5th guess
				if (checkGuess(guess, low, high)) { // If the guess is correct display congrats message
					System.out.println("Congrats! Your guess was within 10 of the actual number. The number was " + rand_int);
					break;
				}
				else { // If guess was wrong display sorry message and answer
					System.out.println("Sorry you are out of guesses. The number is " + rand_int);
					break;
				}
			}
			
			if (checkGuess(guess, low, high)) { // Check to see if the guess was correct
				System.out.println("Congrats! Your guess was within 10 of the actual number. The number was " + rand_int);
				break;
			}
			
			else { // If the guess is not correct ask for another guess
				guess = userInput();
			}
		}
	}
	
	public static int userInput() { // This method gets the users input
		System.out.println("Please enter a number between 1 and 100");
		Scanner userIn = new Scanner(System.in);
		
		if (userIn.hasNextInt()) { // Checks to see if the input is an int
			int userGuess = userIn.nextInt();
			if (userGuess < 1 || userGuess > 100) { // Checks to see if the input is between 1 and 100
				userGuess = userInput();
			}
			
			return userGuess;
		}
		
		System.out.println("Please enter a valid number");
		return userInput();
	}
	
	public static boolean checkGuess(int guess, int low, int high) { // This method checks if the guess is between the correct range
		if (guess < low || guess > high) {
			System.out.println("Sorry please guess again");
		}
		
		else { // Returns true if the guess is correct
			return true;
		}

		return false;
	}
}
