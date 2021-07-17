package com.ss.jb.five;

import java.time.Month;
import java.time.YearMonth;
import java.util.Scanner;

public class JB5DateTimeAPI5 {
    public static void main(String[] args) {
        int year = getYear(); 

        System.out.println("In " + year);
        for (Month m : Month.values()) { // Loops through all the months and returns the length of each month depending on the year
            System.out.println(m + " had " + YearMonth.of(year, m).lengthOfMonth() + " days");
        }
    }
    
    public static int getYear() { // Gets the year from the user
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Please enter a year");
    	int year = 0;
    	
    	try { // Makes sure the input is an int
    		year = scan.nextInt();
    		if (year < 0) { // Makes sure the year is positive
    			System.out.println("Please enter a valid year");
    			year = getYear();
    		}
    	} catch (Exception e) {
    		System.out.println("Please enter a valid year");
    		scan.next();
			year = getYear();
    	}
    	
    	scan.close();
    	return year;
    }
}