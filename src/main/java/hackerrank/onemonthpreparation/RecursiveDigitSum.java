package hackerrank.onemonthpreparation;

// Day 20 03.05.2024
public class RecursiveDigitSum {
    public static void main(String[] args) {
        System.err.println(superDigit("9875", 4));
    }

    public static int superDigit(String n, int k) {
        if (n.length() == 1) return Integer.parseInt(n);

        return superDigit(String.valueOf((sumOfDigits(n) * k)), 1);
    }

    public static long sumOfDigits(String digit) {
        return digit.chars().mapToLong(Character::getNumericValue).sum();
    }

}
