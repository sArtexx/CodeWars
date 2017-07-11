/*
 * Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) 
 * and After Earth (2013). Jaden is also known for some of his philosophy that he delivers 
 * via Twitter. When writing on Twitter, he is known for almost always capitalizing every word.
 * 
 * Your task is to convert strings to how they would be written by Jaden Smith. 
 * The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he 
 * originally typed them.
 */

public class JadenCase {
	
	public static String toJadenCase(String phrase) {
		if (phrase != null && !phrase.isEmpty()){
			String result = "";
			for (String str : phrase.split(" ")) {
				result += (str.replace(str.charAt(0), Character.toUpperCase(str.charAt(0))) + " ");
			}
			return result.substring(0, result.length()-1);
		}
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println(toJadenCase("most trees are blue"));
	}
}
