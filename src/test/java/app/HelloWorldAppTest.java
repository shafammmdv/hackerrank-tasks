package app;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

class HelloWorldAppTest {
    public static void main() {
        PrintStream output=System.out;
        output.print("Input first number: ");
        InputStream in = System.in;
        Scanner scan = new Scanner(in);
        int x = scan.nextInt();
        output.print("Input second number: ");
        int y=scan.nextInt();
        int sum=x+y;
        output.print("Sum of two numbers: "+ sum);
    }
}
