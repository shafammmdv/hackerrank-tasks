package hackerrank.onemonthpreparation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Day 2 16.03.2024
public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);

        long sum = 0;
        for (int element : arr) {
            sum += element;
        }

        System.out.print((sum - arr.get(arr.size() - 1)) + " " + (sum - arr.get(0)));
    }

    public static void main(String[] args) {
        miniMaxSum(Arrays.asList(256741038, 623958417, 467905213, 714532089, 938071625));
    }
}
