package hackerrank.onemonthpreparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Day 23 13.05.2024
public class BomberManGame {
    public static List<String> bomberMan(int n, List<String> grid) {
        if (n == 1) {
            return grid;
        }

        if (n % 2 == 0) {
            return Collections.nCopies(grid.size(), "O".repeat(grid.get(0).length()));
        }

        if (n % 4 == 1) {
            return bombMap(bombMap(grid));
        }

        return bombMap(grid);

    }

    private static List<String> bombMap(List<String> grid) {

        List<String> ans = new ArrayList<>();
        for (int i = 0; i < grid.size(); i++) {
            String row = grid.get(i);
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < row.length(); j++) {

                if (row.charAt(j) == 'O') {
                    sb.append('.');
                    continue;
                }

                if (checkBomb(grid, i, j)) {
                    sb.append('.');
                } else {
                    sb.append('O');
                }
            }
            ans.add(sb.toString());
        }

        return ans;
    }

    private static boolean checkBomb(List<String> grid, int i, int j) {
        if (i - 1 >= 0 && grid.get(i - 1).charAt(j) == 'O') return true;
        if (i + 1 < grid.size() && grid.get(i + 1).charAt(j) == 'O') return true;
        if (j - 1 >= 0 && grid.get(i).charAt(j - 1) == 'O') return true;
        if (j + 1 < grid.get(0).length() && grid.get(i).charAt(j + 1) == 'O') return true;

        return false;
    }
}
