package hackerrank;

import java.util.Arrays;
import java.util.List;

public class CompareTriples {
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aPoint = 0;
        int bPoint = 0;
        for (int i = 0; i < a.size(); i++) {
            int diff = a.get(i) - b.get(i);
            if (diff > 0) aPoint++;
            else if (diff < 0) bPoint ++;
        }
        return Arrays.asList(aPoint, bPoint);
    }

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(5, 6, 7);
        List<Integer> b = Arrays.asList(3, 6, 10);
        System.out.println(compareTriplets(a, b));
    }
}
