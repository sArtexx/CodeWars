/*
 * Write a function that accepts a starting and ending IPv4 address, 
 * and returns the number of IP addresses from start to end, excluding the end IP address. 
 * 
 * All input to the ipsBetween function will be valid IPv4 addresses in the form of strings. 
 * The ending address will be at least one address higher than the starting address. 
 */
package countIpAddresses;

public class CountIPAddresses {

    public static long ipsBetween(String start, String end) {
        long counter = 0;
        String[] startStr = start.split("[.]");
        String[] endStr = end.split("[.]");
        int multiple = 1;
        for (int i = startStr.length - 1; i >= 0; --i) {
            System.out.println(Integer.valueOf(endStr[i]));
            System.out.println(Integer.valueOf(startStr[i]));
            counter += (Integer.valueOf(endStr[i]) - Integer.valueOf(startStr[i]))
                    * multiple;
            multiple *= 256;
        }
        return counter;
    }
}