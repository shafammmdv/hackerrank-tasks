package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        candles = new ArrayList<>(candles);
        candles.sort(Collections.reverseOrder());

        int count = 0;
        int tallest = candles.get(0);

        for (int candle : candles) {
            if (tallest == candle) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.err.println(birthdayCakeCandles(List.of(1, 4, 3, 5, 5, 4)));
    }

}
