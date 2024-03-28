package hackerrank.onemonthpreparation;

import java.util.List;

// Day 8 28.03.2024
public class DiagonalDifference {
    public static void main(String[] args) {
        System.err.println(diagonalDifference(List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(9, 8, 9))));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < arr.size(); i++) {
            leftSum += arr.get(i).get(i);
            rightSum += arr.get(i).get(arr.size() - i - 1);
        }
        return Math.abs(leftSum - rightSum);
    }
}
