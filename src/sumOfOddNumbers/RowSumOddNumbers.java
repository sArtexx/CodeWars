/*
 * Given the triangle of consecutive odd numbers:
 *
 *              1
 *           3     5
 *        7     9    11
 *     13    15    17    19
 *  21    23    25    27    29
 *  ...
 *  Calculate the row sums of this triangle from the row index (starting at index 1) e.g.:
 *  rowSumOddNumbers(1); // 1
 *  rowSumOddNumbers(2); // 3 + 5 = 8
 */
package sumOfOddNumbers;

public class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
        int nextOdd = (int) (n + Math.pow(n - 1, 2));
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nextOdd;
            nextOdd += 2;
        }
        return sum;
    }

    // public static int rowSumOddNumbers(int n) {
    // return n * n * n;
    // }
}
