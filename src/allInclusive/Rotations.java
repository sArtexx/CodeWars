/*
 * - a string strng
 * - an array of strings arr
 * Output of function contain_all_rots(strng, arr) (or containAllRots or contain-all-rots):
 * a boolean true if all rotations of strng are included in arr (C returns 1)
 * false otherwise (C returns 0)
 */

package allInclusive;

import java.util.List;

public class Rotations {
    public static Boolean containAllRots(String strng, List<String> arr) {
        for (int i = 0; i < strng.length(); ++i) {
            strng = strng.substring(1) + strng.charAt(0);
            System.out.println(strng);
            if (!arr.contains(strng)) {
                return false;
            }
        }
        return true;
    }
}
