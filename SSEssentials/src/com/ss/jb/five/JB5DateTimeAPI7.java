/**
 * 
 */
package com.ss.jb.five;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.temporal.ChronoField;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Robert Haas
 *
 */
public class JB5DateTimeAPI7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> date = getDate();
		Month m = null;
		LocalDate day = null;
		int year = 0;
		int d = Integer.parseInt(date.get(1));
		
		try { // Makes sure the month day and year are valid 
			m = Month.valueOf(date.get(0).toUpperCase());
			year = Integer.parseInt(date.get(2));
			day = Year.of(year).atMonth(m).atDay(d);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (day.get(ChronoField.DAY_OF_WEEK) == 5 && d == 13) { // Checks to see if the inputted date is friday the 13th
			System.out.print("This day was Friday the 13th!");
		}
		else {
			System.out.print("This day was NOT Friday the 13th!");
		}
		
	}
	
	public static List<String> getDate() { // Gets the date from the user
		Scanner scan = new Scanner(System.in);
		List<String> arr;

		System.out.println("Please enter a date in the format Month/DD/YYYY, please type the whole month name");
		String date = scan.nextLine();
		
		arr = Arrays.asList(date.split("/")); // Splits the string and puts the string values into a list
		
		scan.close();
		return arr;
	}
}
