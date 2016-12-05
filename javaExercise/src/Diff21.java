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


class TestDiff21{
	
	public static void main(String args []) {
		Diff21 test = new Diff21();
		assert test.dff21(31) == 20;
		assert test.dff21(10) == 11;
	}
}
