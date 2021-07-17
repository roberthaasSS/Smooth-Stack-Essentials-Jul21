/**
 * 
 */
package com.ss.jb.five;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

import java.time.temporal.TemporalAdjusters;

import java.util.Scanner;

/**
 * @author Robert Haas
 *
 */
public class JB5DateTimePAPI6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Month month = getMonth(); 
		
        System.out.println("Every Monday in " + month);
        LocalDate monday = Year.now().atMonth(month).atDay(1).with(TemporalAdjusters.next(DayOfWeek.MONDAY)); // Gets the first monday of the month
        
        while (monday.getMonth() == month) { // Loops through the whole month and prints out the monday dates until it's not the same month
        	System.out.println(monday);
        	monday = monday.with(TemporalAdjusters.next(DayOfWeek.MONDAY)); // Gets the next monday date in the month
        }
	}
	
	 public static Month getMonth() { // Gets the month from the user
	    	Scanner scan = new Scanner(System.in);
	    	Month m = null;
	    	
	    	System.out.println("Please enter the whole month name");
	    	String month = scan.nextLine();
	    	
	    	try { // Makes sure the input is a valid month
	    		m = Month.valueOf(month.toUpperCase());
	    	} catch (Exception e) {
	    		System.out.println("Please enter a valid month");
	    		m = getMonth();
	    	}
	    	
	    	scan.close();
	    	return m;
	    }

}
