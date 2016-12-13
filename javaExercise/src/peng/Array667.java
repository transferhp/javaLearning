package peng;

public class Array667 {
	/*
	 * Given an array of ints, return the number of times that two 6's are next to each other in the array. 
	 * Also count instances where the second "6" is actually a 7.
	 */
	
	public int count667(int [] nums){
		int count = 0;
		for (int i=0; i< nums.length-1; i++){  //check point: array length: arr.length; Be aware array index of last element.
			if (nums[i] == 6){
				if (nums[i+1] == 6 || nums[i+1]==7){
					count += 1;
				}
			}
		}
		return count;
	}

}
