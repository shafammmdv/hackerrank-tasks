package hackerrank.onemonthpreparation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Day 9 01.04.2024
public class SubarrayDivision1 {
    public static void main(String[] args) {
        System.err.println(birthday(Arrays.asList(2, 2, 1, 3, 2), 4, 2));
        System.err.println(birthday(Arrays.asList(1, 4), 4, 1));
    }

    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        for (int i = 0; i < s.size() - m + 1; i++) {
            int sum = 0;

            for (int j = i; j < m + i; j++) {
                sum += s.get(j);
            }

            if (sum == d) count++;
        }

        return count;
    }
}
