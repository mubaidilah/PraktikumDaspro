package jobsheet7;
import java.util.Scanner;

public class DisplayTwo14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numInput;
        System.out.print("input some number: ");
        numInput = input.nextInt();
        for (int i = 2; i <= numInput; i+=2) {
            System.out.print(i + " ");
        }
        System.out.print("%");
    }
} 
