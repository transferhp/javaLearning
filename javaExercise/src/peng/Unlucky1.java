package peng;

public class Unlucky1 {
	/*
	 * We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. 
	 * Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
	 * 
	 * @param: 
	 */
	
	public boolean check(int [] nums){
		int len = nums.length;
		
		if (len > 2) {
			//check first 2 positions
			for (int i = 0; i<2; i++) {
				if (is13(nums[i], nums[i+1])) {
					return true;
				}
			}
			//check last 2 positions
			for (int i = len - 2; i< len - 1; i++) {
				if (is13(nums[i], nums[i+1])) {
					return true;
				}
			}
		}
		
		// Don't forget cases that array length is less than 2
		else {
			for (int i = 0; i< len - 1; i++) {
				if (is13(nums[i], nums[i+1])) {
					return true;
				}
			}
		}
		return false; // not found
	}
	
	public boolean is13(int a, int b) {
		return (a == 1 && b == 3);
	}

}
