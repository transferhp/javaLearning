
public class MonkeyTrouble {
	/*
	 * We have two monkeys, a and b, 
	 * and the parameters aSmile and bSmile indicate if each is smiling. 
	 * We are in trouble if they are both smiling or if neither of them is smiling. 
	 * Return true if we are in trouble.
	 * 
	 */
	
	public boolean inTrouble(boolean aSmile, boolean bSmile){
		if (aSmile && bSmile){
			return true;
		}
		if (!aSmile && !bSmile){
			return true;
		}
		return false;
	}

}



class TestMonkeyTrouble{
	/*
	 * Test cases for class MonkeyTrouble
	 * 
	 * The above can be shortened to:
	 * return ((aSmile && bSmile) || (!aSmile && !bSmile));
	 * Or this very short version (think about how this is the same as the above)
	 * return (aSmile == bSmile);
	 * 
	 */
	public static void main(String args []){
		MonkeyTrouble monkey = new MonkeyTrouble();
		assert monkey.inTrouble(true, false) == false;
		assert monkey.inTrouble(true, true) == true;
		assert monkey.inTrouble(false, false) == false;
	}
}
