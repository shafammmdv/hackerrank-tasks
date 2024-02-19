package hackerrank;

public class CatAndMouse {

    static String catAndMouse(int x, int y, int z) {
        int aLoc = Math.abs(z - x);
        int bLoc = Math.abs(z - y);
        if (aLoc < bLoc) return "Cat A";
        else if (aLoc > bLoc) return "Cat B";
        else return "Mouse C";
    }

    public static void main(String[] args) {
        System.out.println(catAndMouse(1,3,2));
    }

}
