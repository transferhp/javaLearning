package peng;

public class WithoutString {
	/*
	 * Given two strings, base and remove, 
	 * return a version of the base string where all instances of the remove string have been removed (not case sensitive). 
	 * 
	 * You may assume that the remove string is length 1 or more. 
	 * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
	 */
	public String removeString(String base, String remove) {
		  int rLen = remove.length();
		  String result = "";
		   
		  for(int i = 0; i < base.length(); i++){
		    if(i+rLen <= base.length() &&
		    base.substring(i, i+rLen).equalsIgnoreCase(remove)){
		      i += rLen-1;
		    }
		    else
		      result += base.charAt(i);
		  }
		  return result;
	}

}
