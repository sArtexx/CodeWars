
/*
 * Sum all the numbers of the array (in F# and Haskell you get a list) except the highest and the lowest element (the value, not the index!).
 * (The highest/lowest element is respectively only one element at each edge, even if there are more than one with the same value!)
 */

import static java.util.stream.IntStream.of;

public class SumExceptHighestAndLowest {
	public static int sum(int[] numbers) {
		return (numbers == null || numbers.length <= 2) ? 0
				: of(numbers).sum() - of(numbers).max().getAsInt() - of(numbers).min().getAsInt();
	}

	public static void main(String[] args) {
		System.out.println(sum(new int[] { 6, 2, 1, 8, 10 }));
	}
}
