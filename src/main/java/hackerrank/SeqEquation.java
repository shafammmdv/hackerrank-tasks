package hackerrank;

import java.util.Arrays;

public class SeqEquation {

    static int[] permutationEquation(int[] p) {
        int[] resultArr = new int[p.length];
        for (int value : p) {
            resultArr[p[p[value - 1] - 1] - 1] = value;
        }

        return resultArr;

    }

    public static void main(String[] args) {
        int [] p = {2,3,1};
        System.out.println(Arrays.toString(permutationEquation(p)));
    }
}
