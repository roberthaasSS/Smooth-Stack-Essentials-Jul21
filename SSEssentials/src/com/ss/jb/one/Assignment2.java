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
		System.out.print(rand_int);
		
		int guess = userInput();
		
		for (int i = 0; i <= 4; i++) {
			if (i == 4) {
				if (checkGuess(guess, low, high)) {
					System.out.println("Congrats! Your guess was within 10 of the actual number. The number was " + rand_int);
					break;
				}
				else {
					System.out.println("Sorry you are out of guesses. The number is " + rand_int);
					break;
				}
			}
			
			if (checkGuess(guess, low, high)) {
				System.out.println("Congrats! Your guess was within 10 of the actual number. The number was " + rand_int);
				break;
			}
			
			else {
				guess = userInput();
			}
		}
	}
	
	public static int userInput() {
		System.out.println("Please enter a number between 1 and 100");
		Scanner userIn = new Scanner(System.in);
		
		if (userIn.hasNextInt()) {
			int userGuess = userIn.nextInt();
			if (userGuess < 1 || userGuess > 100) {
				userGuess = userInput();
			}
			
			return userGuess;
		}
		
		System.out.println("Please enter a valid number");
		return userInput();
	}
	
	public static boolean checkGuess(int guess, int low, int high) {
		if (guess < low || guess > high) {
			System.out.println("Sorry please guess again");
		}
		
		else {
			return true;
		}

		return false;
	}
}
