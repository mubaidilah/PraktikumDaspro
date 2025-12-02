package jobsheet5;
import java.util.Scanner;
public class switchCetakKRS09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Print KRS SIAKAD ---");
        System.out.print("Input now semester :");
        int semester = sc.nextInt();
        
        if (semester == 1) {
            System.out.println("display KRS 1st semester"); 
        } else if (semester == 2) {
             System.out.println("display KRS 2nd semester"); 
        } else if (semester == 3) {
             System.out.println("display KRS 3rd semester"); 
        } else if (semester == 4) {
             System.out.println("display KRS 4rd semester"); 
        } else if (semester == 5) {
             System.out.println("display KRS 5rd semester"); 
        } else if (semester == 6) {
             System.out.println("display KRS 6rd semester"); 
        } else if (semester == 7) {
             System.out.println("display KRS 7rd semester"); 
        } else if (semester == 8) {
             System.out.println("display KRS 8rd semester"); 
        } else {
            
            System.out.println("Invalid semester input !!");
        }
    }
}