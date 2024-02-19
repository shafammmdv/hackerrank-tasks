package hackerrank;

public class PdfViewer {

    static int designerPdfViewer(int[] h, String word) {
        int maxHeight = 0;
        for (int i = 0; i < word.length(); i++) {
            int ascii = word.charAt(i);
            int height = h[ascii - 97];
            if (height > maxHeight) maxHeight = height;
        }
        return maxHeight * word.length();
    }


    public static void main(String[] args) {
        int[] h = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};
        System.out.println(designerPdfViewer(h, "zaba"));
    }
}
