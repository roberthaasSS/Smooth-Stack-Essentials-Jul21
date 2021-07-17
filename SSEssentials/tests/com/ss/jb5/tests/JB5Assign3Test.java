/**
 * 
 */
package com.ss.jb5.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;

import org.junit.Test;

import com.ss.jb.five.JB5Assign3;

/**
 * @author Robert Haas
 *
 */
public class JB5Assign3Test {
	
	@Test
	public void testDoubling() {
		assertEquals(Arrays.asList(2, 4, 6), JB5Assign3.doubling(Arrays.asList(1, 2, 3)));
		assertEquals(Arrays.asList(12, 16, 12, 16, -2), JB5Assign3.doubling(Arrays.asList(6, 8, 6, 8, -1)));
		assertEquals(Arrays.asList(), JB5Assign3.doubling(Arrays.asList()));
		
		assertNotEquals(Arrays.asList(3, 5, 7), JB5Assign3.doubling(Arrays.asList(1, 2, 3)));
		assertNotEquals(Arrays.asList(13, 17, 11, 15, -3), JB5Assign3.doubling(Arrays.asList(6, 8, 6, 8, -1)));
		assertNotEquals(Arrays.asList(2), JB5Assign3.doubling(Arrays.asList()));
	}
}
