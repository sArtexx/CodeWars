/*
 * Write a program that will calculate the number of trailing zeros in a factorial of a given number.
 *
 * N! = 1 * 2 * 3 * ... * N
 */

package numberOfTrailingZerosOfNFactorial;

public class Solution {
    public static int zeros(int n) {
        int count = 0;
        for (int i = 5; i <= n; i *= 5) {
            count += n / i;
        }
        return count;
    }
}