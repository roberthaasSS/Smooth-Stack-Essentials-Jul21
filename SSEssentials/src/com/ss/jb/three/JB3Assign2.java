/**
 * 
 */
package com.ss.jb.three;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.NoSuchFileException;

/**
 * @author Robert Haas
 *
 */
public class JB3Assign2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JB3Assign2 ios = new JB3Assign2();
		ios.readAndWrite();
	}
	
	public void readAndWrite() {		
		try (BufferedReader in = new BufferedReader(new FileReader("Resources/in/in.txt"));
				BufferedWriter out = new BufferedWriter(new FileWriter("Resources/out/out.txt", true));){ // Gets the read and write files
			
	        String inLine;
	        out.newLine();
	        
	        while ((inLine = in.readLine()) != null) { // Writes to the output file while the next line in the input file is not empty.
	            out.write(inLine);
	            out.newLine();
	        }
		}catch (FileNotFoundException e) {
			System.out.println("No input file found");
		} catch (NoSuchFileException e) {
			System.out.println("No output file found");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
