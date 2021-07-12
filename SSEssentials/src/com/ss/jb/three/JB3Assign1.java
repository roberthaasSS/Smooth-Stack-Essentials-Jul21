/**
 * 
 */
package com.ss.jb.three;

import java.io.File;


/**
 * @author Robert Haas
 *
 */
public class JB3Assign1 {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		// TODO Auto-generated method stub
		String file = "Resources"; // Name of directory
		try { // Checks to see if the directory exists or not
			System.out.println("The list of file/directory names under " + file + " is");
			list(file);
		}
		
		catch(Exception e) {
			System.out.println("Error this directory does not exist");
		}
	}
	
	public static void list(String dir) { // This goes through the directory 
		File file = new File(dir);
		String arr[] = file.list();
		int count = 0;
		
		for (int i = 0; i < dir.length(); i++) { // Makes sure we don't go more than one subdirectory deep
			if (String.valueOf(dir.charAt(i)).equals("/")) {
				count++;
			}
			
			if (count > 1) {
				return;
			}
		}
		
		for (int i = 0; i < arr.length; i++) { // Loops through the directories and prints them
			if (count > 0) { // If we are in a subdirectory it prints a space before printing the files in the subdirectory
				System.out.println("   " + arr[i]);
			}
			else {
				System.out.println(arr[i]);
			}
			list(dir + "/" + arr[i]); // calls list again for a subdirectory
		}
	}
}
