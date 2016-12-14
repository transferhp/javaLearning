package peng;


import static org.junit.Assert.*;

import org.junit.Test;

import peng.StringMatch;

public class StringMatchTest {

	@Test
	public void test() {
		StringMatch demo = new StringMatch();
		assertEquals(0, demo.match("abc", "axz"));
		assertEquals(2, demo.match("abc", "abc"));
		assertEquals(2, demo.match("abc", "abcdab"));
		assertEquals(0, demo.match("", "abc"));
		assertEquals(0, demo.match("h", "hello"));
	}

}
