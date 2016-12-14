package peng;


import peng.MonkeyTrouble;
import junit.framework.TestCase;


public class MonkeyTroubleTest extends TestCase {
	boolean aSmile;
	boolean bSmile;
	
	public void testMonkeyInTrouble() {
		boolean expect = true;
		aSmile = true;
		bSmile = true;
		MonkeyTrouble myMonkey =  new MonkeyTrouble();
		boolean actual = myMonkey.inTrouble(aSmile, bSmile);
		assertEquals(expect, actual);
	}
	
	
	public void testFailedMonkeyInTrouble(){
		boolean expect = true;
		aSmile = true;
		bSmile = false;
		MonkeyTrouble myMonkey =  new MonkeyTrouble();
		boolean actual = myMonkey.inTrouble(aSmile, bSmile);
		assertTrue(expect != actual);
	}

}
