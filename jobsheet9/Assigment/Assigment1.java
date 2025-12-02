package jobsheet9.Assigment;
import java.util.Scanner;
public class Assigment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of student :");
        int n = sc.nextInt();
        int[] grade = new int[n];
        int total = 0 ;
        for (int i = 0; i < grade.length; i++) {
            System.out.print("Enter the grade of student "+i+" :");
            grade[i]=sc.nextInt();
            total += grade[i];
        }
        double average = total/grade.length;
        System.out.println("the average is of all student is :"+average);
        int highest = grade[0];
        int lowest= grade[0] ;
        for (int i = 0; i < grade.length; i++) {
            if (highest < grade[i]) {
                highest = grade[i];
            }
            if (lowest > grade[i]) {
                lowest = grade[i];
            }
            
        }
        System.out.println("the highest number is :"+highest);
        System.out.println("the lowest grade is :"+lowest);
        for (int i = 0; i < grade.length; i++) {
        System.out.println("the grade of student "+i+" : "+grade[i]);
        }
    }
}