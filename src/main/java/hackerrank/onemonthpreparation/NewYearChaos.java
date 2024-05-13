package hackerrank.onemonthpreparation;

import java.util.Arrays;
import java.util.List;

// Day 22 06.05.2024
public class NewYearChaos {
    public static void main(String[] args) {
        minimumBribes(Arrays.asList(2, 1, 5, 3, 4));
        minimumBribes(Arrays.asList(2, 5, 1, 3, 4));
        minimumBribes(Arrays.asList(4, 1, 2, 3));
        minimumBribes(Arrays.asList(1, 2, 5, 3, 7, 8, 6, 4));
    }

    public static void minimumBribes(List<Integer> q) {
        int totalBribes = 0;

        for (int i = 0; i < q.size(); i++) {
            int shift = q.get(i) - (i + 1);

            if (shift > 2) {
                System.out.println("Too chaotic");
                break;
            } else {
                for (int j = Math.max(0, shift - 1); j < i; j++) {
                    if (q.get(j) > q.get(i)) {
                        totalBribes++;
                    }
                }
            }
        }

        if (totalBribes > 0) System.out.println(totalBribes);
    }
}
