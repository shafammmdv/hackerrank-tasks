package hackerrank;

public class ViralAd {

    static int viralAdvertising(int n) {
        int people = 5;
        int cum = 0;
        for (int i = 0; i < n; i++) {
            int liked = people / 2;
            cum += liked;
            people = liked *3;
        }
        return cum;
    }

    public static void main(String[] args) {
        System.out.println(viralAdvertising(3));
    }
}
