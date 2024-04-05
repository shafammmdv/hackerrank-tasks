package hackerrank;

public class CompressString {
    public static void main(String[] args) {
        String[] testCases = new String[]{"aaaabbbddd", "abcdef", "aaabcccdfffff"};
        String[] output = new String[]{"a4b3d3", "abcdef", "a3bc3df5"};
        for (int i = 0; i < testCases.length; i++) {
            System.out.println(compress(testCases[i]).equals(output[i]));
        }
    }

    static String compress(String input) {
        int index = 0;
        StringBuilder result = new StringBuilder();

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i - 1) != input.charAt(i)) {
                result.append(input.charAt(i - 1));

                if (i - index > 1) {
                    result.append(i - index);
                }
                index = i;
            }
        }

        // append last character
        result.append(input.charAt(input.length() - 1));
        if (input.length() - 1 - index > 1) {
            result.append(input.length() - index);
        }

        return result.toString();
    }
}
