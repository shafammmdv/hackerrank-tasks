package hackerrank.onemonthpreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// Day 11 07.04.2024
public class SalesByMatch {
    public static void main(String[] args) {
        System.err.println(sockMerchant(9, Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20)));
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        Map<Integer, Long> countMap = ar.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return (int) countMap.values()
                .stream()
                .mapToLong(count -> count / 2)
                .reduce(0, Long::sum);
    }
}
