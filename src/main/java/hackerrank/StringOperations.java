package hackerrank;

public class StringOperations {
    public static void main(String[] args) {
        System.err.println(reverse("hello world"));
        System.err.println(convertNumberToString("jay2"));
        System.err.println(convertNumberToString("jay"));
        System.err.println(convertNumberToString("null"));
    }

    public static String reverse(String word) {
        StringBuilder sb = new StringBuilder();

        for (int i = word.toCharArray().length - 1; i >= 0; i--) {
            sb.append(word.charAt(i));
        }

        return sb.toString();
    }

    public static String convertNumberToString(String text) {
        var lastChar = text.charAt(text.length() - 1);
        if (text.isBlank() || !Character.isDigit(lastChar)) return text;

        var textPart = text.substring(0, text.length() - 1);

        return textPart.repeat(Character.getNumericValue(lastChar));
    }
}
