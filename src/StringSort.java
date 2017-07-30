/*
 * Write a function called sortGiftCode that accepts a string containing up to 26 unique 
 * alphabetical characters, and returns a string containing the same characters in alphabetical 
 * order.
 */
import java.util.Arrays;

public class StringSort {

	public static String sortGiftCode(String code) {
		char[] ch = code.toCharArray();
		Arrays.sort(ch);
		return new String(ch);
	}
	 
	public static void main (String[] args) {
		System.out.println(sortGiftCode("pqksuvy"));
	}
}