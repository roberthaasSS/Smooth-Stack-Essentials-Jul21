/**
 * 
 */
package com.ss.jb.four;

import java.util.Scanner;

/**
 * @author Robert Haas
 *
 */
public class JB4Assign3 {
	
	/**
	 * @param args
	 * @throws InterruptedException 
	 * 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int num = userInput(); 
		
		ThreadProdCons thread = new ThreadProdCons();
		thread.start(num); // Calls the ThreadProdCons class and gives it the user input
		
	}
	
	public static int userInput() { // Gets the users input for how many numbers to produce
		int num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter how many numbers you want to produce");
		
		try { // Makes sure the input is a number
			num = scan.nextInt();
			if (num <= 0) { // Makes sure the number is greater than 0
				System.out.println("Please enter a number greater than 0");
				num = userInput();
			}
		} catch (Exception e) {
			System.out.println("Please enter a valid number");
			scan.next();
			num = userInput();
		}
		scan.close();
		return num;
	}
}