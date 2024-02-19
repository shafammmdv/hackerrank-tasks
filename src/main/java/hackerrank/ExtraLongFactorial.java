package hackerrank;

import java.math.BigInteger;

public class ExtraLongFactorial {

    static void extraLongFactorialsV1(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);
    }

    static void extraLongFactorialsV2(int n) {
        System.out.println(fact(BigInteger.valueOf(n)));
    }

    private static BigInteger fact(BigInteger n){
        if (n.intValue() <= 1) return BigInteger.ONE;
        return n.multiply(n.subtract(BigInteger.ONE));
    }

    public static void main(String[] args) {
        extraLongFactorialsV2(25);
    }
}
