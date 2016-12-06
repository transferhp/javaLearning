
public class NotString {
	/*
	 * Given a string, return a new string where "not " has been added to the front. 
	 * However, if the string already begins with "not", return the string unchanged. 
	 * Note: use .equals() to compare 2 strings
	 */
	public String check (String str){
		//Solution 1:
		if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
			return str;
		}
		return "not " + str;
	}

}


class TestNotString {
	public static void main (String args []){
		NotString sampleStr= new NotString();
		assert sampleStr.check("not ok!").equals("not ok!");
		assert sampleStr.check("yes!").equals("not yes!");
		assert sampleStr.check("yes").equals("yes"); // not pass
	}
}
