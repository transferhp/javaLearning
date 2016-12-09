package javaExercise;

import peng.LastDigt;
import junit.framework.TestCase;

public class LastDigtTest extends TestCase {
	
	public void test () {
		LastDigt demo = new LastDigt();
		assertEquals(true, demo.check(17, 7));
		assertEquals(false, demo.check(6, 7));
		assertEquals(true, demo.check(117, 7));
	}

}
