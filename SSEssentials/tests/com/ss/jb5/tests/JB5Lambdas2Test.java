/**
 * 
 */
package com.ss.jb5.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;

import org.junit.Test;

import com.ss.jb.five.JB5Lambdas2;

/**
 * @author Robert Haas
 *
 */
public class JB5Lambdas2Test {
	
	@Test
	public void testEString() {
		assertEquals("o3,e44", JB5Lambdas2.eString().e(Arrays.asList(3, 44)));
		assertEquals("o3,o7,e8,e4,o19", JB5Lambdas2.eString().e(Arrays.asList(3, 7, 8, 4, 19)));
		assertEquals("e2,e4,e6,e8,e30", JB5Lambdas2.eString().e(Arrays.asList(2, 4, 6, 8, 30)));
		
		assertNotEquals("e3,o44", JB5Lambdas2.eString().e(Arrays.asList(3, 44)));
		assertNotEquals("e3,e7,e8,e4,e19", JB5Lambdas2.eString().e(Arrays.asList(3, 7, 8, 4, 19)));
		assertNotEquals("o2,o4,o6,o8,o30", JB5Lambdas2.eString().e(Arrays.asList(2, 4, 6, 8, 30)));
	}
}
