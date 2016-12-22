package peng;

import static org.junit.Assert.*;
import org.junit.Test;

public class WithoutStringTest {

	@Test
	public void test() {
		WithoutString demo = new WithoutString();
		assertEquals("He there", demo.removeString("Hello there", "llo"));
		assertEquals("x", demo.removeString("xxx", "xx"));
		assertEquals("", demo.removeString("", "x"));
		System.out.println(demo.removeString("THIS is a FISH", "iS"));
		assertEquals("TH  a FH", demo.removeString("THIS is a FISH", "iS"));
		assertEquals("TH  a FH", demo.removeString("THis is a FisH", "IS"));
		assertEquals("abxab", demo.removeString("abxxxab", "xx"));
		assertEquals("abab", demo.removeString("abxxxab", "x"));
		assertEquals("", demo.removeString("1111", "11"));
	}
 
}
