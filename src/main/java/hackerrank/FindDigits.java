package hackerrank;

public class FindDigits {

    static int findDigits(int n) {
        int count = 0;
        int temp = n;
        while (temp > 0) {
            int rem = temp % 10;
            temp /= 10;
            if (rem != 0 && n % rem == 0) count++;
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(findDigits(106108048));
    }
}
