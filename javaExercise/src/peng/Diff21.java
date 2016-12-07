package peng;


public class Diff21 {
	/*
	 * Given an int n, return the absolute difference between n and 21, 
	 * except return double the absolute difference if n is over 21.
	 */
	public int dff21(int n){
		if (n <= 21){
			return Math.abs(n - 21);
		}
		return 2 * (n - 21);
	}

}

