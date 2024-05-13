package hackerrank.onemonthpreparation;

// Day 21 05.05.2024
public class PalindromeIndex {
    public static void main(String[] args) {
        System.err.println(palindromeIndex("aaab"));
        System.err.println(palindromeIndex("baa"));
        System.err.println(palindromeIndex("aaa"));
    }

    public static int palindromeIndex(String text) {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                if (isPalindrome(text, left + 1, right)) {
                    return left;
                }

                if (isPalindrome(text, left, right - 1)) {
                    return right;
                }
                return -1;
            }
            left++;
            right--;

        }
        return -1;
    }

    private static boolean isPalindrome(String text, int left, int right) {
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
