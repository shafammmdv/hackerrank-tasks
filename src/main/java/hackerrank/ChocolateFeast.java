package hackerrank;

public class ChocolateFeast {

    static int chocolateFeast(int n, int c, int m) {
        int gain = n / c;
        int temp = gain;
        while (temp >= m){
            int free = temp / m;
            int rem = temp % m;
            gain += free;
            temp = free + rem;
        }
        return gain;
    }

    public static void main(String[] args) {
        System.out.println(chocolateFeast(15, 3, 2));
    }
}
