package hackerrank.onemonthpreparation;

import java.util.Arrays;
import java.util.List;

// Day 19 02.05.2024
public class SherlockAndArray {
    public static void main(String[] args) {
        System.err.println(balancedSums(Arrays.asList(5, 6, 8, 11)));
        System.err.println(balancedSums(Arrays.asList(1, 2, 3)));
        System.err.println(balancedSums(Arrays.asList(1, 2, 3, 3)));
        System.err.println(balancedSums(Arrays.asList(2, 0, 0, 0)));
        System.err.println(balancedSums(Arrays.asList(1)));
    }

    public static String balancedSums(List<Integer> arr) {
        int totalSum = 0;
        for (Integer element : arr) {
            totalSum += element;
        }

        int leftSum = 0;
        for (Integer element : arr) {
            int rightSum = totalSum - leftSum - element;

            if (leftSum == rightSum) return "YES";
            leftSum += element;
        }

        return "NO";
    }
}
