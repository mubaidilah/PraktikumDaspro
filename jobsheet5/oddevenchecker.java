package jobsheet5;
import java.util.Scanner;
public class oddevenchecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input the value: ");
        int value = sc.nextInt();
        if (value % 2 == 0) {
            System.out.println("the value is even");
        } else {
            System.out.println("the value is odd");
        }
    }
}