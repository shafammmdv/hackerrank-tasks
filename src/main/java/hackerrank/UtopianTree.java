package hackerrank;

public class UtopianTree {

    static int utopianTree(int n) {
        int height = 0;
        for (int i = 0; i <= n; i++) {
            height = i % 2 == 0 ? height + 1 : height * 2;
        }
        return height;
    }

    public static void main(String[] args) {
        System.out.println(utopianTree(6));
    }
}
