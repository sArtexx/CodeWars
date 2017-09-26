/*
 * Write a program that finds the summation of every number between 1 and num.
 * The number will always be a positive integer greater than 0.
 */

public class GrassHopper {

    private static int summation(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        System.out.println(summation(8));
    }
}
