import java.util.Arrays;

public class MaxDiffLength {

    public static int mxdiflg(String[] a1, String[] a2) {
        if (a1.length == 0 || a2.length == 0) {
            return -1;
        }
        return Math.max(
                Arrays.stream(a1).mapToInt(s -> s.length()).max().getAsInt()
                        - Arrays.stream(a2).mapToInt(s -> s.length()).min().getAsInt(),
                Arrays.stream(a2).mapToInt(s -> s.length()).max().getAsInt()
                        - Arrays.stream(a1).mapToInt(s -> s.length()).min().getAsInt());
    }

    public static void main(String[] args) {
        String[] s1 = new String[] { "hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis",
                "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz" };
        String[] s2 = new String[] { "cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww" };
        System.out.println(mxdiflg(s1, s2));
    }
}
