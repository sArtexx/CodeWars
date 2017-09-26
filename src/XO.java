/*
 * Check to see if a string has the same amount of 'x's and 'o's. 
 * The method must return a boolean and be case insensitive. The string can contains any char.
 */
public class XO {

	public static boolean getXO(String str) {
		str = str.toLowerCase();
		return str.replace("x", "").length() == str.replace("o", "").length();
	}

	public static void main(String[] args) {
		System.out.println(getXO("xoxoo"));
	}
}
