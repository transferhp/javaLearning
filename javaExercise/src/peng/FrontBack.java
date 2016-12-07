package peng;

public class FrontBack {
	/*
	 * Given a string, 
	 * return a new string where the first and last chars have been exchanged.
	 * 
	 * .substring(StartIndex(inclusive), EndIndex(exclusive))
	 */
	public String changeFrontBackChar (String str) {
		if (str.length() <= 1) {
			return str;
		}
		
		String mid = str.substring(1, str.length() - 1); // a list of characters
		char front = str.charAt(0);  // single character
		char back = str.charAt(str.length() - 1);
		return back + mid + front;
	}
}

