/*
 * Complete the solution so that it returns true if the first
 * argument(string) passed in ends with the 2nd argument (also a string).
 *
 * Examples:
 * solution('abc', 'bc') // returns true
 * solution('abc', 'd') // returns false
 */
package stringEndsWith;

public class StringEndsWith {
    public static boolean solution(String str, String ending) {
        return str.length() >= ending.length()
                ? ending.equals(str.substring(str.length() - ending.length())) : false;
    }

    // public static boolean solution(String str, String ending) {
    // return str.endsWith(ending);
    // }
}
