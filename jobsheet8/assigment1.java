package jobsheet8;

import java.util.Scanner;

public class assigment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("input the value of n (minimum 3) : ");
            n = sc.nextInt();
            if (n < 3) {
                System.out.println("the value sould greater equals 3, please input again");
            }
        } while (n < 3);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
        sc.close();
    }
}