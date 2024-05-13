package hackerrank.onemonthpreparation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

// Day 21 05.05.2024
public class BetweenTwoSets {
    public static void main(String[] args) {
        System.err.println(getTotalX(Arrays.asList(1, 2), Arrays.asList(6, 10)));
        System.err.println(getTotalX(Arrays.asList(2, 6), Arrays.asList(24, 36)));
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        return (int) IntStream.rangeClosed(a.get(a.size() - 1), b.get(0))
                .filter(integer -> a.stream().allMatch(el -> integer % el == 0))
                .boxed()
                .filter(integer -> b.stream().allMatch(el -> el % integer == 0))
                .count();
    }
}
