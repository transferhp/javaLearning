
public class SleepIn {
	/*
	 * The parameter weekday is true if it is a weekday, 
	 * and the parameter vacation is true if we are on vacation. 
	 * We sleep in if it is not a weekday or we're on vacation. 
	 * Return true if we sleep in.
	 */
	
	public boolean checkSleepIn(boolean weekday, boolean vacation){
		if (!weekday && vacation){
			return true;
		}
		else{
			return false;
		}
	}

};



class testSleepIn{
	/*
	 * Test cases for class SleepIn.
	 * 
	 * 
	 * Solution notes: 
	 * better to write "vacation" than "vacation == true"
	 * though they mean exactly the same thing.
	 * Likewise "!weekday" is better than "weekday == false".
	 * This all can be shortened to: return (!weekday || vacation);
	 */
	public static void main(String args[]){
		SleepIn sleep = new SleepIn();
		assert sleep.checkSleepIn(true, false) == false;
		assert sleep.checkSleepIn(true, true) == false;
		assert sleep.checkSleepIn(false, true) == true;
	}

	
}
