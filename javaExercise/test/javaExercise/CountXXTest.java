package peng;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountXXTest {

	@Test
	public void test() {
		CountXX demo = new CountXX();
		assertEquals(2, demo.count("xxx"));
		assertEquals(0, demo.count(""));
		assertEquals(0, demo.count("hello"));
		assertEquals(2, demo.count("Hexxo thxxe"));
	}

}
