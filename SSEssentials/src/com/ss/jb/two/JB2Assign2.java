/**
 * 
 */
package com.ss.jb.two;

/**
 * @author Robert Haas
 *
 */
public class JB2Assign2 {

	/**
	 * @param args
	 */
	public static int[][] arr = {{1, 2}, {5, 4}, {23, 87}, {14, 9}, {34, 12}, {99, 2}};
//	public static int[][] arr = {{1, 2}, {99, 4}, {23, 87}, {14, 9}, {34, 12}, {99, 2}};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = arr[0][0];
		int x = 0;
		int y = 0;
		boolean multiple = false;
		
		for (int i = 0; i < arr.length; i++) { // Loops through the 2d array
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) { // Checks to see if the current number is greater than the max
					max = arr[i][j];
					x = i;
					y = j;
					multiple = false;
				}
				
				else if (arr[i][j] == max) { // Checks to see if the current number is equal to the max
					multiple = true;
				}
			}
		}
		
		if (multiple) { // If there is multiple locations with the max number, multipleLocations is called
			System.out.println("The max number: " + max + " showed up more than once");
			multipleLocations(max);
		}
		else {
			System.out.println("The max number is " + max + " at location x: " + x + " y: " + y);
		}
	}
	
	public static void multipleLocations(int max) { // This loops through the 2d array and prints the multiple coordinates of the max number
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == max) {
					System.out.println("x: " + i + " y: " + j);
				}
			}
		}
	}

}
