

import peng.FrontBack;
import junit.framework.TestCase;

public class FrontBackTest extends TestCase {
	
	public void testFrontBack() {
		String expect1 = "eodc";
		String expect2 = "";
		String expect3 = "a";
		
		FrontBack demo = new FrontBack();
		String actual1 = demo.changeFrontBackChar("code");
		assertTrue(expect1.equals(actual1));
		
		String actual2 = demo.changeFrontBackChar("");
		assertTrue(expect2.equals(actual2));
		
		String actual3 = demo.changeFrontBackChar("a");
		assertTrue(expect3.equals(actual3));
	}

}
