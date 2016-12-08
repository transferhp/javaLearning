package peng;

public class MixStart {
	/*
	 * Return true if the given string begins with "mix", 
	 * except the 'm' can be anything, so "pix", "9ix" .. all count.
	 */
	public boolean mixStart(String str){
		// Be aware that str length might less than 3
		if (str.length() < 3) {
			return false;
		}
		// Pull out str to check out "ix" part
		if (str.substring(1,3).equals("ix")) {
			return true;
		}
		return false;
		
		//The last part can be shortened to just:
		// return(str.substring(1,3).equals("ix"));
	}

}
