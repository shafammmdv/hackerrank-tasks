package hackerrank.onemonthpreparation;

// Day 20 03.05.2024
public class CounterGame {
    public static void main(String[] args) {
        System.err.println(counterGame(132));
        System.err.println(counterGame(6));
        System.err.println(counterGame(1));
    }

    public static String counterGame(long number) {
        int counter = 0;

        while (number > 1) {
            if (number - Long.highestOneBit(number) == 0) number /= 2;
            else number -= Long.highestOneBit(number);

            counter++;
        }

        return counter % 2 == 0 ? "Richard" : "Louise";
    }
}
