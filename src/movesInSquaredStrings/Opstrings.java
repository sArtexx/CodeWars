/*
 * This kata is the first of a sequence of four about "Squared Strings".
 *
 * You are given a string of n lines, each substring being n characters long: For example:
 * s = "abcd\nefgh\nijkl\nmnop"
 *
 * We will study some transformations of this square of strings.
 *
 * Vertical mirror: vert_mirror (or vertMirror or vert-mirror)
 * vert_mirror(s) => "dcba\nhgfe\nlkji\nponm"
 *
 * Horizontal mirror: hor_mirror (or horMirror or hor-mirror)
 * hor_mirror(s) => "mnop\nijkl\nefgh\nabcd"
 *
 * or printed:
 * vertical mirror   |horizontal mirror
 * abcd --> dcba     |abcd --> mnop
 * efgh     hgfe     |efgh     ijkl
 * ijkl     lkji     |ijkl     efgh
 * mnop     ponm     |mnop     abcd
 *
 * #Task:
 * Write these two functions and high-order function oper(fct, s) where
 * fct is the function of one variable f to apply to the string s (fct will be one of vertMirror, horMirror)
 *
 * #Examples:
 * s = "abcd\nefgh\nijkl\nmnop"
 * oper(vert_mirror, s) => "dcba\nhgfe\nlkji\nponm"
 * oper(hor_mirror, s) => "mnop\nijkl\nefgh\nabcd"
 */

package movesInSquaredStrings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Opstrings {
    public static String vertMirror(String strng) {
        String[] arr = strng.split("\n");
        List<String> newarr =
                Arrays.stream(arr).map(x -> new StringBuilder(x).reverse().toString())
                        .collect(Collectors.toList());
        return String.join("\n", newarr);
    }

    public static String horMirror(String strng) {
        String[] arr = strng.split("\n");
        Collections.reverse(Arrays.asList(arr));
        return String.join("\n", arr);
    }

    public static String oper(UnaryOperator<String> operator, String s) {
        return operator.apply(s);
    }
}
