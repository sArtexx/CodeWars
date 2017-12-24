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
