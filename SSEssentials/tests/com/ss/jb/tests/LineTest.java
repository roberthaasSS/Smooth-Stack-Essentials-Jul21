/**
 * 
 */
package com.ss.jb.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.ss.jb.four.Line;
/**
 * @author Robert Haas
 *
 */
public class LineTest {
	
	Line line = new Line(2, 1, 6, 7); 
	Line line2 = new Line(4, 2, 12, 14);
	Line line3 = new Line(5, 4, 48, 90);
	Line lineFail = new Line(0, 1, 0, 7);
	
	Double delta = 0.0001;
	
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();
	
	@Test
	public void testGetSlope() {
		assertEquals(1.5, line.getSlope(), delta); // Tests to see if the output of line's slope is equal to 1.5
		assertNotEquals(2, line.getSlope(), delta);  // Tests to see if the output of line's slope is not equal to 2
		
		exceptionRule.expect(ArithmeticException.class); // Tests to see if we get an ArithmeticException thrown if x1-x0 = 0
		lineFail.getSlope();		
	}

	@Test
	public void testGetDistance() {
		assertEquals(7.2111, line.getDistance(), delta); // Tests to make sure the output of line's distance is 7.2111
		assertNotEquals(7.1, line.getDistance(), delta); // Tests to make sure the output of line's distance is not 7.1
	}

	@Test
	public void testParallelTo() {
		assertTrue(line.parallelTo(line2)); // Tests to make sure true is the output when seeing if line and line2 are parallel
		assertFalse(line.parallelTo(line3)); // Tests to make sure false is the output when seeing if line and line3 are parallel
		
		exceptionRule.expect(ArithmeticException.class); // Tests to see if we get an ArithmeticException thrown if x1-x0 = 0
		line.parallelTo(lineFail);
	}
}
