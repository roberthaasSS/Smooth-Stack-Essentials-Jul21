/**
 * 
 */
package com.ss.jb.two;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * @author Robert Haas
 *
 */

public class Rectangle implements Shape{
	Scanner scan = new Scanner(System.in);
	@Override
	public void calculateArea(double x, double y) { // Calculates the area of the rectangle
		// TODO Auto-generated method stub
		double area = (x*y);
		display(area);
	}

	@Override
	public void display(double area) { // Prints the area of the rectangle
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("###.##");
		System.out.println("The area of the rectangle is " + df.format(area));
		scan.close();
	}
	
	public Double getInput() { // Checks to see if the input is a number 
		double num = 0;
		try {
			num = scan.nextDouble();
		}
		catch (Exception e) {
			System.out.println("Please enter a valid number");
			scan.nextLine();
			num = getInput();
		}
		
		if (num < 0) { // Makes sure the input is a positive number
			System.out.println("Please enter a positive number");
			scan.nextLine();
			num = getInput();
		}
		return num;
	}

	public static void main (String[] args)
    {
        Rectangle r = new Rectangle();
        
        System.out.println("Please enter the length of the Rectangle");
		double length = r.getInput();
		System.out.println("Please enter the width of the Rectangle");
		double width = r.getInput();
		
		r.calculateArea(length, width);
    }
}
