package jobsheet7;
import java.util.Scanner;
public class TheTriangle14 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numInput ;
    String s = "* ";
    System.out.print("input some number: ");
    numInput = input.nextInt();
    int i = numInput;
    while (i> 0) {
    System.out.println(s.repeat(i));
        i--;
    }
    }
}