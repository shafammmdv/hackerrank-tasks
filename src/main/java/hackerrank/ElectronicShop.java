package hackerrank;

public class ElectronicShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int max = -1;
        for (int keyboard : keyboards) {
            for (int drive : drives) {
                int sum = keyboard + drive;
                if (sum <= b && sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] keyboards = {3, 1};
        int[] drives = {5, 2, 8};
        System.out.println(getMoneySpent(keyboards, drives, 10));
    }
}
