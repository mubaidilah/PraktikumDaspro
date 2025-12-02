package Experiment1;
import java.util.Scanner;
public class SIAKAD16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] score = new int[4][3];
        for (int i = 0; i < score.length; i++) {
            System.out.println("Enter score of Student #"+(i+1));
            double sumForEachStudent= 0; 
            for (int j = 0; j < score[i].length; j++) {
                System.out.print("Course #"+(j+1)+" Score: ");
                score[i][j] = sc.nextInt();
                sumForEachStudent+=score[i][j] ;
            }
            System.out.println("Course "+(i+1)+": "+sumForEachStudent/3);
        }
    }
}