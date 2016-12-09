package peng;

public class LastDigt {
	/*
	 * Given two non-negative int values, 
	 * return true if they have the same last digit, such as with 27 and 57.
	 */
	
	public boolean check (int a, int b) {
		return (a % 10 == b % 10);   //check point: the % "mod" operator computes remainders, so 17 % 10 is 7.
	}
	
	// reminder: last two digits, number % 100

}
