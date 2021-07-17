/**
 * 
 */
package com.ss.jb5.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import com.ss.jb.five.JB5Assign1;

/**
 * @author Robert Haas
 *
 */
public class JB5Assign1Test {
	
	@Test
	public void testIsOdd() {
		assertEquals("EVEN", JB5Assign1.isOdd().perform(2));
		assertEquals("ODD", JB5Assign1.isOdd().perform(3));
		
		assertNotEquals("ODD", JB5Assign1.isOdd().perform(2));
		assertNotEquals("EVEN", JB5Assign1.isOdd().perform(3));
	}

	@Test
	public void testIsPrime() {
		assertEquals("PRIME", JB5Assign1.isPrime().perform(2));
		assertEquals("COMPOSITE", JB5Assign1.isPrime().perform(1));
		
		assertNotEquals("COMPOSITE", JB5Assign1.isPrime().perform(2));
		assertNotEquals("PRIME", JB5Assign1.isPrime().perform(1));
	}

	@Test
	public void testIsPalindrome() {
		assertEquals("PALINDROME", JB5Assign1.isPalindrome().perform(8));
		assertEquals("NOT PALINDROME", JB5Assign1.isPalindrome().perform(13));
		assertEquals("PALINDROME", JB5Assign1.isPalindrome().perform(898));
		
		assertNotEquals("NOT PALINDROME", JB5Assign1.isPalindrome().perform(8));
		assertNotEquals("PALINDROME", JB5Assign1.isPalindrome().perform(13));
		assertNotEquals("NOT PALINDROME", JB5Assign1.isPalindrome().perform(898));
	}
}
