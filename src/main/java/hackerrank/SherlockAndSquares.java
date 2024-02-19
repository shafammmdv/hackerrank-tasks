package hackerrank;

public class SherlockAndSquares {

    static int squares(int a, int b) {
        return (int)Math.floor(Math.sqrt(b)) - (int)Math.ceil(Math.sqrt(a)) + 1;

    }

    public static void main(String[] args) {
        System.out.println(squares(17, 24));
    }
}
