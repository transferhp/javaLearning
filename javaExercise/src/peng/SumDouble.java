package peng;

public class SumDouble {
	/*
	 * Given two int values, return their sum. 
	 * Unless the two values are the same, then return double their sum.
	 * 
	 */
	
	public int sum (int a, int b){
		int sum = a + b;
		if (a == b){
			return sum *= 2;
		}
		return sum;
	}

}

