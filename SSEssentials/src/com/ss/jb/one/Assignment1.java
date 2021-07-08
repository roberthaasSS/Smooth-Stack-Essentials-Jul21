/**
 * 
 */
package com.ss.jb.one;

/**
 * @author Robert Haas
 * Assignment 1 of JB 1
 */
public class Assignment1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1)"); 
		for (int i = 0; i < 5; i++) { 
			if (i == 4) { // Checks to see if it is the last loop, if it is then the last line that is printed is 9 "."
				for (int j = 0; j < 9; j++) {
					System.out.print(".");
				}
			}
			
			else { // If it is not the last loop then "*" is printed
				for (int j = 0; j < i+1; j++) {
					System.out.print("*");
				}
			}
			
			System.out.println(); // Prints a new line
		}
		
		System.out.println("2)");
		for (int i = 4; i >= 0; i--) { // This loop prints the reverse of the for loop above
			if (i == 4) {
				for (int j = 0; j < 9; j++) {
					System.out.print(".");
				}
			}
			
			else {
				for (int j = 0; j < i+1; j++) {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
		
		System.out.println("3)");
		for (int i = 0; i < 9; i++) { // This loop prints a pyramid shape
			if (i%2 != 0) { // Skips the loop if i is even
				continue;
			}
			
			for (int j = (11-i)/2; j > 1; j--) { // Adds the spaces to make the pyramid shape
				if (j == 2) { // Does 2 spaces if j is 2
					System.out.print("  ");
				}
				
				else { // Does 1 space if j is not 2
					System.out.print(" ");
				}
			}
			
			if (i == 8) { // Checks to see if it is the last loop
				for (int j = 0; j < 11; j++) { // If it's the last loop then it prints 11 "."
					System.out.print(".");
				}
			}
			
			else { // If it's not the last loop it prints "*"
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
		
		System.out.println("4)");
		for (int i = 9; i >= 0; i--) { // This loop prints the reverse of the loop above
			if (i%2 != 0) {
				continue;
			}
			
			for (int j = (11-i)/2; j > 1; j--) {
				if (j == 2) {
					System.out.print("  ");
				}
				
				else {
					System.out.print(" ");
				}
			}
			
			if (i == 8) {
				for (int j = 0; j < 11; j++) {
					System.out.print(".");
				}
			}
			
			else {
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
	}
}
