package peng;

public class CountXX {
	/*
	 * Count the number of "xx" in the given string. 
	 * We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
	 */
	public int count (String str) {
		int num = 0;
		for (int i=0; i<str.length() - 1; i++) {
			if (str.substring(i, i+2).equals("xx")) {
				num += 1;
			}
		}
		return num;
	}
	
	//check point:
	//1.pull out a length 2 substring without going out of bounds. 
	//2.remember to use equals() to compare strings, not ==.

}
