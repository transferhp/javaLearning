package peng;

import static org.junit.Assert.*;

import org.junit.Test;

public class MixStartTest {

	@Test
	public void test() {
		MixStart demo = new MixStart();
		assertEquals(true, demo.mixStart("9ix yes!"));
		assertEquals(true, demo.mixStart("mix yes!"));
		assertEquals(false, demo.mixStart(""));
		assertEquals(false, demo.mixStart("9"));
	}

}
