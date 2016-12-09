package peng;

public class StringE {
	/*
	 * Return true if the given string contains between 1 and 3 'e' chars.
	 */
	public boolean check(String str) {
		int count = 0;
		
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i) == 'e') {  // check point: str.charAt(index)
				count += 1;
			}
			
			// Alternatively,
			// str.substring(i, i+1) == 'e'
		}
		
		if (count >= 1 && count <= 3) {
			return true;
		}
		return false;
		
		// Alternatively,
		// return (count >=1 && count <=3)
	}

}
