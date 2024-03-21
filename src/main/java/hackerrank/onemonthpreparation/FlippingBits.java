package hackerrank.onemonthpreparation;

// Day 5 19.03.2024
public class FlippingBits {
    public static void main(String[] args) {
        System.err.println(flippingBits(1)); //4294967294
    }

    public static long flippingBits(long n) {
        StringBuilder binary = new StringBuilder(Long.toBinaryString(n));
        StringBuilder wholeBinary  = new StringBuilder("0".repeat(32 - binary.length())).append(binary);

        // 3
        for (int i = 0; i < wholeBinary.length(); i++) {
            wholeBinary.replace(i, i + 1, wholeBinary.charAt(i) == '0' ? "1" : "0");
        }

        return Long.parseLong(wholeBinary.toString(), 2);
    }
}
