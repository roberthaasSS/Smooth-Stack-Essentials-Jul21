/**
 * 
 */
package com.ss.jb5.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;

import org.junit.Test;
import com.ss.jb.five.JB5Assign2;
/**
 * @author Robert Haas
 *
 */
public class JB5Assign2Test {

	@Test
	public void testRightDigit() {
		assertEquals(Arrays.asList(1, 2, 3), JB5Assign2.rightDigit(Arrays.asList(1, 22, 93)));
		assertEquals(Arrays.asList(6, 8, 6, 8, 1), JB5Assign2.rightDigit(Arrays.asList(16, 8, 886, 8, 1)));
		assertEquals(Arrays.asList(0, 0), JB5Assign2.rightDigit(Arrays.asList(10, 0)));
		
		assertNotEquals(Arrays.asList(2, 3, 4), JB5Assign2.rightDigit(Arrays.asList(1, 22, 93)));
		assertNotEquals(Arrays.asList(1, 8, 8, 8, 1), JB5Assign2.rightDigit(Arrays.asList(16, 8, 886, 8, 1)));
		assertNotEquals(Arrays.asList(1, 5), JB5Assign2.rightDigit(Arrays.asList(10, 0)));
	}
}
