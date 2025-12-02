package jobsheet8;
import java.util.Scanner;
public class star14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of n =");
        int n = sc.nextInt();
        for (int i = 1; i <= n ; i++) {
            System.out.print("*");
        }
        sc.close();
    }
}