/*
 * Write a function convertBits to determine the number of bits required 
 * to convert positive integer A to positive integer B.
 */

package deltaBits;

public class DeltaBits {
    public static int convertBits(int a, int b) {
        return Integer.bitCount(a ^ b);
    }
}
