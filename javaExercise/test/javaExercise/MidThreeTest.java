import static org.junit.Assert.*;

import org.junit.Test;

import peng.MidThree;

public class MidThreeTest {

	@Test
	public void test() {
		MidThree demo = new MidThree();
		int [] expectA = {2,3,4}; 
		int [] testA = {1,2,3,4,5};
		assertArrayEquals(expectA, demo.extract(testA));
	}

}
