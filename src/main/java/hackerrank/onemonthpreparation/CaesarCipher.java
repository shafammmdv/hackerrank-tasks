package hackerrank.onemonthpreparation;

// Day 14 15.04.2024
public class CaesarCipher {
    public static void main(String[] args) {
        System.err.println(caesarCipher("middle-Outz", 2));
        System.err.println(caesarCipher("abcdefghijklmnopqrstuvwxyz", 3));
        System.err.println(caesarCipher("Hello_World!", 4));
        System.err.println(caesarCipher("www.abc.xy", 87));
        System.err.println(caesarCipher("!m-rB`-oN!.W`cLAcVbN/CqSoolII!SImji.!w/`Xu`uZa1TWPRq`uRBtok`xPT`lL-zPTc.BSRIhu..-!.!tcl!-U", 62));
    }

    public static String caesarCipher(String s, int k) {
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                char baseA = Character.isLowerCase(ch) ? 'a' : 'A';
                result.append((char) (baseA + (ch - baseA + k) % 26));
            } else result.append(ch);
        }

        return result.toString();
    }
}
