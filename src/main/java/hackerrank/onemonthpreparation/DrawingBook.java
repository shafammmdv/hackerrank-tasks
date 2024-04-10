package hackerrank.onemonthpreparation;

// Day 12 10.04.2024
public class DrawingBook {
    public static void main(String[] args) {
        System.err.println(pageCount(6, 2));
        System.err.println(pageCount(5, 4));
    }

    public static int pageCount(int n, int p) {
        int front = p / 2;
        int back = n / 2 - front;

        return Math.min(front, back);
    }
}
