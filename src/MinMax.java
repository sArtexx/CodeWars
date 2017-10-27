import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Write a function that returns both the minimum and maximum number of the given list/array.
 */

public class MinMax {
    public static int[] minMax(int[] arr) {
        List<Integer> list = new ArrayList<>();
        list.add(Arrays.stream(arr).min().getAsInt());
        list.add(Arrays.stream(arr).max().getAsInt());

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}