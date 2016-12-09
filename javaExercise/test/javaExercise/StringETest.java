package javaExercise;

import peng.StringE;
import junit.framework.TestCase;

public class StringETest extends TestCase {
	
	public void test () {
		StringE demo = new StringE();
		// test
		assertEquals(true, demo.check("Hello"));
		assertEquals(false, demo.check("Heelele"));
		assertEquals(false, demo.check("Hii"));
		assertEquals(false, demo.check("H"));
		assertEquals(false, demo.check(""));
		System.out.println("All test cases pass!");
	}

}
