/**
 * 
 */
package com.ss.jb5.tests;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.ss.jb.five.JB5Lambdas1;
/**
 * @author Robert Haas
 *
 */
public class jb5Lambdas1Test {
	String[] test = {"Stream", "SS", "Java", "Hello"};
	
	@Test
	public void testLength() {
		String[] expected = {"SS", "Java", "Hello", "Stream"};
		assertArrayEquals(expected, JB5Lambdas1.length(test));
		assertArrayEquals(expected, JB5Lambdas1.length(test));
	}
	
	@Test
	public void testReverseLength() {
		String[] expected = {"Stream", "Hello", "Java", "SS"};
		assertArrayEquals(expected, JB5Lambdas1.reverseLength(test));
	}
	
	@Test
	public void testAlphabetically() {
		String[] expected = {"Hello", "Java", "SS", "Stream"};
		assertArrayEquals(expected, JB5Lambdas1.alphabetically(test));
	}
	
	@Test
	public void testContainE() {
		String[] expected = {"Hello", "Stream", "Java", "SS"};
		assertArrayEquals(expected, JB5Lambdas1.containE(test));
	}
	
	@Test
	public void testContainEStatic() {
		String[] expected = {"Hello", "Stream", "Java", "SS"};
		assertArrayEquals(expected, JB5Lambdas1.containEStatic(test));
	}
}
