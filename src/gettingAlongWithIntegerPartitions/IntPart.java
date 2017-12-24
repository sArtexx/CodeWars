/*
 * From wikipedia https://en.wikipedia.org/wiki/Partition_(number_theory)
 * In number theory and combinatorics, a partition of a positive integer n,
 * also called an integer partition, is a way of writing n as a sum of positive integers.
 * Two sums that differ only in the order of their summands are considered the same partition.
 *
 * For example, 4 can be partitioned in five distinct ways:
 * 4, 3 + 1, 2 + 2, 2 + 1 + 1, 1 + 1 + 1 + 1.
 *
 * We can write:
 * enum(4) -> [[4],[3,1],[2,2],[2,1,1],[1,1,1,1]] and
 * enum(5) -> [[5],[4,1],[3,2],[3,1,1],[2,2,1],[2,1,1,1],[1,1,1,1,1]].
 *
 * The number of parts in a partition grows very fast. For n = 50 number of parts is 204226,
 * for 80 it is 15,796,476 It would be too long to tests answers with arrays of such size.
 *
 * So our task is the following:
 * 1 - n being given (n integer, 1 <= n <= 50) calculate enum(n) ie the partition of n.
 * We will obtain something like that:
 * enum(n) -> [[n],[n-1,1],[n-2,2],...,[1,1,...,1]] (order of array and sub-arrays doesn't matter).
 * This part is not tested.
 *
 * 2 - For each sub-array of enum(n) calculate its product. If n = 5 we'll obtain after removing
 * duplicates and sorting:
 * prod(5) -> [1,2,3,4,5,6]
 * prod(8) -> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15, 16, 18]
 * If n = 40 prod(n) has a length of 2699 hence the tests will not verify such arrays.
 *
 * 3 - return the range, the average and the median of prod(n) in the following form (example for n = 5):
 * "Range: 5 Average: 3.50 Median: 3.50"
 * Range is an integer, Average and Median are float numbers rounded to two decimal places (".2f" in some languages).
 *
 * #Notes:
 * Range : difference between the highest and lowest values.
 * Mean or Average : To calculate mean, add together all of the numbers in a set and then divide
 * the sum by the total count of numbers.
 * Median : The median is the number separating the higher half of a data sample from the lower half.
 */

package gettingAlongWithIntegerPartitions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntPart {
    private static void getPartitions(long n, long n2, long l, List<Long> prodList) {
        if (n == 0) {
            prodList.add(l);
        } else {
            if (n2 > 1) {
                getPartitions(n, n2 - 1, l, prodList);
            }
            if (n2 <= n) {
                getPartitions(n - n2, n2, n2 * l, prodList);
            }
        }
    }

    private static List<Long> removeDuplicatesAndSort(List<Long> prodList) {
        Collections.sort(prodList);
        List<Long> temp = new ArrayList<>();
        for (Long prod : prodList) {
            if (!temp.contains(prod)) {
                temp.add(prod);
            }
        }
        return temp;
    }

    private static long getRange(List<Long> prodList) {
        return Collections.max(prodList) - Collections.min(prodList);
    }

    private static double getAverage(List<Long> prodList) {
        double sum = 0;
        for (Long long1 : prodList) {
            System.out.println(long1);
            sum += long1;
        }
        return sum / prodList.size();
    }

    private static double getMedian(List<Long> prodList) {
        int middle = prodList.size() / 2;

        if (prodList.size() % 2 == 1) {
            return prodList.get(middle);
        } else {
            return (prodList.get(middle - 1) + prodList.get(middle)) / 2.0;
        }
    }

    public static String part(long n) {
        List<Long> prodList = new ArrayList<>();
        getPartitions(n, n, 1, prodList);
        List<Long> newList = removeDuplicatesAndSort(prodList);
        return "Range: " + getRange(newList) + " Average: "
                + String.format("%.2f", getAverage(newList)).replace(",", ".")
                + " Median: "
                + String.format("%.2f", getMedian(newList)).replace(",", ".");
    }
}
