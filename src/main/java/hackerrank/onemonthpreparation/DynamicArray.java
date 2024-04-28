package hackerrank.onemonthpreparation;

import java.util.ArrayList;
import java.util.List;

// Day 18 28.04.2024
public class DynamicArray {
    public static void main(String[] args) {
        List<List<Integer>> queries = List.of(
                List.of(1, 0, 5),
                List.of(1, 1, 7),
                List.of(1, 0, 3),
                List.of(2, 1, 0),
                List.of(2, 1, 1));

        System.err.println(dynamicArray(2, queries));
    }

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
        }

        int lastAnswer = 0;
        List<Integer> response = new ArrayList<>();
        for (List<Integer> query : queries) {
            int x = query.get(1);
            int y = query.get(2);
            int idx = (x ^ lastAnswer) % n;
            if (query.get(0) == 1) {
                arr.get(idx).add(y);
            } else {
                lastAnswer = arr.get(idx).get(y % arr.get(idx).size());
                response.add(lastAnswer);
            }
        }
        return response;
    }
}
