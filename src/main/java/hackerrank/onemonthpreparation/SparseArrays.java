package hackerrank.onemonthpreparation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Day 4 18.03.2024
public class SparseArrays {
    public static void main(String[] args) {
        System.err.println(matchingStrings(
                List.of("aba", "baba", "aba", "xzxb"),
                List.of("aba", "xzxb", "ab")));
        // 2, 1, 0

        System.err.println(matchingStrings(
                List.of("def", "de", "fgh"),
                List.of("de", "lmn", "fgh")));
        // 1 0 1
    }

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        var stringsMap = new HashMap<String, Integer>();

        strings.forEach(string -> {
            if (stringsMap.containsKey(string)) {
                stringsMap.put(string, stringsMap.get(string) + 1);
            } else {
                stringsMap.put(string, 1);
            }
        });

        return queries.stream()
                .map(query -> stringsMap.getOrDefault(query, 0))
                .toList();
    }
}
