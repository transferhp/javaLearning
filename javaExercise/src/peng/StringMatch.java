package peng;

public class StringMatch {
	/*
	 * Given 2 strings, a and b, return the number of the positions 
	 * where they contain the same length 2 substring. 
	 * So "xxcaazz" and "xxbaaz" yields 3, 
	 * since the "xx", "aa", and "az" substrings appear in the same place in both strings.
	 */
	public int match(String a, String b){
		int count = 0;
		// Judge which string is shorter
		int len = Math.min(a.length(), b.length());
		for (int i = 0; i< len - 1; i++){
			String aSub = a.substring(i, i+2);
			String bSub = b.substring(i, i+2);
			if (aSub.equals(bSub)){
				count ++;
			}
		}
		return count;
	}

}
