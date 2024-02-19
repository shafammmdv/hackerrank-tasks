package hackerrank;

import java.util.Arrays;

public class ClimbingLeaderBoard {

    static int process(Integer [] scores, int alice){
        int i = Arrays.binarySearch(scores, alice, (i1, i2) -> i2 - i1);
        if (i < 0) return Math.abs(i);
        return i + 1;
    }

    static int[] climbingLeaderBoard(int[] scores, int[] alice) {
        Integer[] integers = Arrays.stream(scores).distinct().boxed().toArray(Integer[]::new);
        return Arrays.stream(alice).map(a -> process(integers, a)).toArray();
    }

    public static void main(String[] args) {
        int[] scores = {100,100,50,40,40,20,10};
        int[] alice = {5,25,50,120};
        System.out.println(Arrays.toString(climbingLeaderBoard(scores, alice)));
    }
}
