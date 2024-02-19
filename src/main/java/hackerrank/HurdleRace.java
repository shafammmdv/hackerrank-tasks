package hackerrank;

import java.util.Arrays;

public class HurdleRace {

    static int hurdleRace(int k, int[] height) {
        int max = Arrays.stream(height).max().orElseThrow(RuntimeException::new);
        return Math.max(max - k, 0);
    }

    public static void main(String[] args) {
    }
}
