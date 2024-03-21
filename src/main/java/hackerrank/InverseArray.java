package hackerrank;

import java.util.Arrays;

public class InverseArray {
    public static void main(String[] args) {
        System.err.println(Arrays.toString(inverse(new int[]{1, 1, 0, 1})));
    }

    public static int[] inverse(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] == 1 ? 0 : 1;
        }
        return array;
    }
}
