package hackerrank.onemonthpreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Day 10 05.04.2024
public class Week1MockTest {
    public static void main(String[] args) {
        // PROBLEM 1
        System.err.println(findMedian(Arrays.asList(3, 4, 2, 1, 5)));

        // PROBLEM 2
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(Arrays.asList(112, 42, 83, 119));
        matrix.add(Arrays.asList(56, 125, 56, 49));
        matrix.add(Arrays.asList(15, 78, 101, 43));
        matrix.add(Arrays.asList(62, 98, 114, 108));

        System.out.println(flippingMatrix(matrix));
    }

    // PROBLEM 1
    public static int findMedian(List<Integer> arr) {
        Collections.sort(arr);
        return arr.get(arr.size() / 2);
    }

    // PROBLEM 2
    public static int flippingMatrix(List<List<Integer>> matrix) {
        int size = matrix.size();
        int sum = 0;

        for (int i = 0; i < size / 2; i++) {
            List<Integer> currentRow = matrix.get(i);
            List<Integer> oppositeRow = matrix.get(size - i - 1);

            for (int j = 0; j < currentRow.size() / 2; j++) {
                Integer topLeft = currentRow.get(j);
                Integer topRight = currentRow.get(size - j - 1);

                Integer bottomLeft = oppositeRow.get(j);
                Integer bottomRight = oppositeRow.get(size - j - 1);

                sum += Collections.max(Arrays.asList(topLeft, topRight, bottomLeft, bottomRight));
            }
        }
        return sum;
    }
}
