/**
 * 
 */
package com.ss.jb5.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;

import org.junit.Test;

import com.ss.jb.five.JB5Assign4;

/**
 * @author Robert Haas
 *
 */
public class JB5Assign4Test {

	@Test
	public void testNoX() {
		assertEquals(Arrays.asList("a", "bb", "c"), JB5Assign4.noX(Arrays.asList("ax", "bb", "cx")));
		assertEquals(Arrays.asList("a", "bb", "c"), JB5Assign4.noX(Arrays.asList("xxax", "xbxbx", "xxcx")));
		assertEquals(Arrays.asList(""), JB5Assign4.noX(Arrays.asList("x")));
		
		assertNotEquals(Arrays.asList("ax", "bb", "cx"), JB5Assign4.noX(Arrays.asList("ax", "bb", "cx")));
		assertNotEquals(Arrays.asList("xxax", "xbxbx", "xxcx"), JB5Assign4.noX(Arrays.asList("xxax", "xbxbx", "xxcx")));
		assertNotEquals(Arrays.asList("x"), JB5Assign4.noX(Arrays.asList("x")));
	}
}
