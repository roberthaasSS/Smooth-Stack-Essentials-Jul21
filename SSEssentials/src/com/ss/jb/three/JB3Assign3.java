/**
 * 
 */
package com.ss.jb.three;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.Scanner;

/**
 * @author Robert Haas
 *
 */
public class JB3Assign3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JB3Assign3 ios = new JB3Assign3();
		ios.readFile();
	}
	
	public void readFile() {		
		int count = 0;
		String find = input(); // Get the character to search for
		try (BufferedReader in = new BufferedReader(new FileReader("Resources/JB3Assign3File/search.txt"))){  // Opens the file to read from
	        String inLine;
	        while ((inLine = in.readLine()) != null) { // While there's a next line in the file
	        	for (int i = 0; i < inLine.length(); i++) {
	        		if (find.equals(String.valueOf(inLine.charAt(i)))) { // Finds the character the user is looking for and increases count
		            	count++;
		            }
	        	}
	        }
		}catch (FileNotFoundException e) {
			System.out.println("No input file found");
		} catch (NoSuchFileException e) {
			System.out.println("No output file found");
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			System.out.print(find + " was found " + count + " times");
		}
	}
	
	public String input() { // Gets the user input 
		try (Scanner scan = new Scanner(System.in)){
			System.out.println("Please enter a character you would like to search for in the search.txt file");
			String userIn = scan.next();
			return userIn;
		}
		catch (Exception e){
			System.out.print("Please enter something valid");
		}
		return null;
	}

}
