/**
 * 
 */
package com.ss.jb5.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;

import org.junit.Test;

import com.ss.jb.five.JB5Lambdas3;
/**
 * @author Robert Haas
 *
 */
public class JB5Lambdas3Test {

	@Test
	public void testAStrList() {
		assertEquals(Arrays.asList("app", "add"), JB5Lambdas3.aStrList().a(Arrays.asList("Hello", "app", "Add", "get", "dad", "add", "apple")));
		
		assertNotEquals(Arrays.asList("app", "add", "apple"), JB5Lambdas3.aStrList().a(Arrays.asList("Hello", "app", "Add", "get", "dad", "add", "apple")));
		assertNotEquals(Arrays.asList("APP"), JB5Lambdas3.aStrList().a(Arrays.asList("get", "dad", "APP", "apple")));
	}
}
