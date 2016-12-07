package javaExercise;

import junit.framework.TestCase;
import peng.NotString;

public class NotStringTest extends TestCase {
	
	public void testNotString() {
		String expect1 = "not yes!";
		NotString demo = new NotString();
		String actual = demo.check("yes!");
		assertEquals(expect1, actual);
		
		String expect2 = "not ok";
		String actual2 = demo.check("not ok");
		assertEquals(expect2, actual2);
	}
	
	public void testFailedNotString() {
		String expect = "yes!";
		NotString demo = new NotString();
		String actual = demo.check("yes!");
		assertFalse(expect.equals(actual));
	}

}
