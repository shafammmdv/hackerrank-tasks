package hackerrank.onemonthpreparation;

// Day 13 14.04.2024
public class TowerBreakers {
    public static void main(String[] args) {
        System.err.println(towerBreakers(2, 6));
        System.err.println(towerBreakers(1, 4));
    }
    public static int towerBreakers(int n, int m) {
        if(m == 1 || n % 2 == 0) return 2;
        return 1;
    }
}
