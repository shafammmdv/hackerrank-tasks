package hackerrank;

import java.util.List;

public class CompareTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aScore = 0;
        int bScore = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) aScore += 1;
            else if (a.get(i) < b.get(i)) bScore += 1;
        }
        return List.of(aScore, bScore);
    }

    public static void main(String[] args) {
        System.err.println(compareTriplets(List.of(17, 28, 30), List.of(99, 16, 8)));
    }
}
