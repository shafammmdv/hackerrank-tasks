package hackerrank.onemonthpreparation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Day 15 16.04.2024
public class GridChallenge {
    public static void main(String[] args) {
        System.err.println(gridChallenge(Arrays.asList("ebacd", "fghij", "olmkn", "trpqs", "xywuv")));
        System.err.println(gridChallenge(Arrays.asList("abc", "ade", "efg")));
    }

    public static String gridChallenge(List<String> grid) {
        for (int i = 0; i < grid.size(); i++) {
            char[] charArray = grid.get(i).toCharArray();
            Arrays.sort(charArray);
            grid.set(i, new String(charArray));
        }

        for (int i = 0; i < grid.get(0).length(); i++) {
            for (int j = 0; j < grid.size() - 1; j++) {
                char c1 = grid.get(j).charAt(i);
                char c2 = grid.get(j + 1).charAt(i);
                if (c1 > c2) {
                    return "NO";
                }
            }
        }

        return "YES";
    }
}
