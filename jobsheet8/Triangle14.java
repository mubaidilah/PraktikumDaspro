package jobsheet8;
import java.util.Scanner;
public class Triangle14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of N :");
        int N = sc.nextInt();
        int i = 0;
        while (i<= N) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            i++;
        }
    }
}