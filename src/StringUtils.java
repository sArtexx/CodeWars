//Define function such that each lowercase letter becomes uppercase and each uppercase letter becomes lowercase.

public class StringUtils {

	public static String toAlternativeString(String string) {
		String result = "";
		for (char c : string.toCharArray()) {
			if (Character.isUpperCase(c)) {
				result += Character.toLowerCase(c);
			} else {
				result += Character.toUpperCase(c);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(toAlternativeString("HeLLo WoRLD"));
	}
}
