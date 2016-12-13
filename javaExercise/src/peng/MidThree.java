package peng;

public class MidThree {
	/*
	 * Given an array of ints of odd length, 
	 * return a new array length 3 containing the elements from the middle of the array. 
	 * The array length will be at least 3.
	 */
	public int [] extract(int[] nums){
		if (nums.length==3){
			return nums;
			}
		int mid = nums.length / 2;
		int [] midThree = {nums[mid-1], nums[mid], nums[mid+1]};
		return midThree;
	}
}
