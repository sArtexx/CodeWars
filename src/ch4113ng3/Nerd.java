/*
 * Make your strings more nerdy: Replace all 'a'/'A' with 4, 'e'/'E' with 3 and 'l' with 1
 * e.g. "Fundamentals" --> "Fund4m3nt41s"
 */
package ch4113ng3;

public class Nerd {
    public static String nerdify(String txt) {
        return txt.replaceAll("[aA]", "4").replaceAll("[eE]", "3").replace("l", "1");
    }
}
