package jobsheet5;
import java.util.Scanner;

public class ifCetakKRSNoPresensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Is your UKT paid in full? (true/false)? ");
        boolean uktLunas = sc.nextBoolean();

        System.out.println(
            uktLunas
            ? "UKT payment verified, please print KRS and request DPA signature"
            : "UKT payment unverified, sorry you can't got KRS"
        );

        sc.close();
    }
}