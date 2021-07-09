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
public class Triangle implements Shape{

	Scanner scan = new Scanner(System.in);
	@Override
	public void calculateArea(double x, double y) { // Calculates the area of the triangle
		// TODO Auto-generated method stub
		double area = (x*y)/2;
		display(area);
	}

	@Override
	public void display(double area) { // Prints the area of the triangle
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("###.##");
		System.out.println("The area of the triangle is " + df.format(area));
		scan.close();
	}
	
	public Double getInput() { // Makes sure the input is valid
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
        Triangle t = new Triangle();
        
        System.out.println("Please enter the base of the Triangle");
		double base = t.getInput();
		System.out.println("Please enter the height of the Triangle");
		double height = t.getInput();
		
		t.calculateArea(base, height);
    }
}
