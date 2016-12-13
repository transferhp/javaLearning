

import peng.Array667;
import junit.framework.TestCase;

public class Array667Test extends TestCase {
	
	public void test(){
		Array667 demo = new Array667();
		int [] nums = {6, 6, 2, 6};  //declare a array and assign values
		assertEquals(1, demo.count667(nums));
		int [] nums1 = {6, 6, 2};
		assertEquals(1, demo.count667(nums1));
		int [] nums2 = {};   // blank array
		assertEquals(0, demo.count667(nums2));
		int [] nums3 = {6, 6, 2, 6, 7};
		assertEquals(2, demo.count667(nums3));
	}

}
