package hackerrank.onemonthpreparation;

import java.util.List;

// Day 1 15.03.2024
public class PlusMinus {
    public static void main(String[] args) {
        plusMinus(List.of(-4, 3, -9, 0, 4, 1));
    }

    public static void plusMinus(List<Integer> arr) {
        String formatter = "%.6f";
        var size = arr.size();
        int minusCount = 0;
        int plusCount = 0;
        int neutralCount = 0;

        for (Integer element : arr) {
            if (element < 0) minusCount += 1;
            else if (element > 0) plusCount += 1;
            else neutralCount += 1;
        }

        System.out.println(String.format(formatter, (float) plusCount / size));
        System.out.println(String.format(formatter, (float) minusCount / size));
        System.out.println(String.format(formatter, (float) neutralCount / size));

    }
}
