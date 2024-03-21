package hackerrank.onemonthpreparation;

import java.util.HashSet;
import java.util.Set;

// Day 6 20.03.2024
public class Pangrams {
    private static final int ALPHABET_SIZE = 26;

    public static String pangrams(String s) {
        char[] letters = s.trim().toLowerCase().toCharArray();
        Set<Character> letterSet = new HashSet<>();

        for(char character : letters) {
            letterSet.add(character);
        }

        letterSet.remove(' ');

        return letterSet.size() >= ALPHABET_SIZE
                ? "pangram"
                : "not pangram";
    }

    public static void main(String[] args) {
        System.err.println(pangrams("We promptly judged antique ivory buckles for the prize"));
    }
}
