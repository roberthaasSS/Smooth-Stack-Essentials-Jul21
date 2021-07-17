/**
 * 
 */
package com.ss.jb5.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ss.jb.five.JB5Assign5;

/**
 * @author Robert Haas
 *
 */
public class JB5Assign5Test {
	
	@Test
	public void testGroupSumClump() {
		int[] arr1 = {2, 4, 8};
		int[] arr2 = {1, 2, 4, 8, 1};
		int[] arr3 = {2, 4, 4, 8};
		
		assertTrue(JB5Assign5.groupSumClump(0, arr1, 10));
		assertTrue(JB5Assign5.groupSumClump(0, arr2, 14));
		assertFalse(JB5Assign5.groupSumClump(0, arr3, 14));
	}
}
