package hackerrank.onemonthpreparation;

// Day 17 23.04.2024
public class SumXor {
    public static long sumXor(long n) {
        long counter = 0L;
        for (long i = 0L; i <= n - i; i++) {
            if ((n + i) == (n ^ i)) {
                counter++;
                System.err.println(n + " " + i + " " + (n ^ i));
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.err.println(sumXor(20));
        System.err.println(sumXor(99));
    }
}
