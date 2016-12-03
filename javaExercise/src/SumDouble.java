
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


class TestSumDouble{
	
	public static void main(String args []){
		SumDouble operator = new SumDouble();
		assert operator.sum(3, 4) == 7;
		assert operator.sum(5, 5) == 20;
		assert operator.sum(4, 2) == 5;
	}
}
