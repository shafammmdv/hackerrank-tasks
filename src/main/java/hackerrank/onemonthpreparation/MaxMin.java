package hackerrank.onemonthpreparation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Day 14 15.04.2024
public class MaxMin {
    public static void main(String[] args) {
        System.err.println(maxMin(4, Arrays.asList(1, 2, 3, 4, 10, 20, 30, 40, 100, 200)));
        System.err.println(maxMin(2, Arrays.asList(1, 4, 7, 2)));
    }

    public static int maxMin(int k, List<Integer> arr) {
        Collections.sort(arr);
        int minUnfairness = Integer.MAX_VALUE;
        for (int i = 0; i <= arr.size() - k; i++) {
            minUnfairness = Math.min(minUnfairness, arr.get(i + k - 1) - arr.get(i));
        }
        return minUnfairness;
    }
}
