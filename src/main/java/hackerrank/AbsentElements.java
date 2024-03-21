package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class AbsentElements {
    public static void main(String[] args) {
        System.err.println(Arrays.toString(
                find(new int[]{1, 3, 4, 7, 9, 10}, 10)));

    }


    public static int[] find(int[] numbers, int size) {
        var integers = new ArrayList<Integer>();
        IntStream.rangeClosed(1, size)
                .forEach(n -> {
                    for (int i = 0; i < numbers.length; i++) {
                        if (n != numbers[i]) {
                            integers.add(n);
                        }
                    }
                });
        return new int[integers.size()];

    }
}
