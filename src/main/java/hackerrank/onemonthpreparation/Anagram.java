package hackerrank.onemonthpreparation;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

// Day 22 06.05.2024
public class Anagram {
    public static void main(String[] args) {
        System.err.println(anagram("abccde"));
        System.err.println(anagram("aaabbb"));
        System.err.println(anagram("ab"));
        System.err.println(anagram("abc"));
        System.err.println(anagram("mnop"));
        System.err.println(anagram("xyyx"));
        System.err.println(anagram("xaxbbbxx"));
        System.err.println(anagram("fdhlvosfpafhalll"));
    }
    public static int anagram(String s) {
        AtomicInteger count = new AtomicInteger();
        if (s.length() % 2 != 0) return -1;

        List<Character> leftPart = s.substring(0, s.length() / 2).chars().mapToObj(c -> (char) c).toList();
        List<Character> rightPart = s.substring(s.length() / 2).chars().mapToObj(c -> (char) c).collect(Collectors.toList());

        leftPart.forEach(l -> {
            if (!rightPart.contains(l)) {
                count.getAndIncrement();
            } else {
                rightPart.remove(l);
            }
        });

        return count.get();
    }
}
