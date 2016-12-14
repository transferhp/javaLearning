package peng;

import static org.junit.Assert.*;

import org.junit.Test;

public class Unlucky1Test {

	@Test
	public void test() {
		Unlucky1 demo  = new Unlucky1();
		assertEquals(true, demo.check(new int [] {1, 3, 4, 5}));
		assertEquals(false, demo.check(new int [] {1}));
		assertEquals(false, demo.check(new int [] {}));
		assertEquals(true, demo.check(new int [] {1, 1, 3, 1, 1}));
		assertEquals(false, demo.check(new int [] {1, 1, 1, 3, 1}));
	}

}
