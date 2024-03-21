package hackerrank.onemonthpreparation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Day 4 18.03.2024
public class LonelyInteger {
    public static void main(String[] args) {
        System.err.println(lonelyinteger(List.of(0, 0, 1, 2, 1)));
    }

    public static int lonelyinteger(List<Integer> a) {
        Map<Integer, Integer> integerMap = new HashMap<>();

        a.forEach(element -> {
            if (integerMap.containsKey(element)) {
                integerMap.put(element, integerMap.get(element) + 1);
            } else {
                integerMap.put(element, 1);
            }
        });

        return integerMap.keySet().stream()
                .filter(key -> integerMap.get(key) == 1)
                .findFirst()
                .get();
    }
}
