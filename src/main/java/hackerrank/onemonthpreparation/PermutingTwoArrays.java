package hackerrank.onemonthpreparation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Day 8 28.03.2024
public class PermutingTwoArrays {
    public static void main(String[] args) {
        System.err.println(twoArrays(10, Arrays.asList(2, 1, 3), Arrays.asList(7, 8, 9)));
        System.err.println(twoArrays(5, Arrays.asList(1, 2, 2, 1), Arrays.asList(3, 3, 3, 4)));
    }
    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        A.sort(Comparator.naturalOrder());
        B.sort(Comparator.reverseOrder());

        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) + B.get(i) < k) {
                return "NO";
            }
        }

        return "YES";
    }
}
