

import peng.Diff21;
import junit.framework.TestCase;

public class Diff21Test extends TestCase {
	
	public void testDiff21() {
		Diff21 demo = new Diff21();
		int expect = 20;
		int actual = demo.dff21(31);
		assertEquals(expect, actual);
		
	}
	
	public void testFailedDiff21() {
		Diff21 demo = new Diff21();
		int expect = 10;
		int actual = demo.dff21(31);
		assertTrue(expect != actual);
		
	}

}
