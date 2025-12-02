package jobsheet9.experiment;

import java.util.Scanner;

public class ArrayAverageScore16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Student :");
        int n = sc.nextInt();
        int[] score = new int[n];
        int pass = 0;
        int fail = 0;
        double totalpass = 0;
        double totalfail = 0;
        double averageofpass, averageoffail;
        for (int i = 0; i < score.length; i++) {
            System.out.print("enter student score " + i + ": ");
            score[i] = sc.nextInt();
        }
        for (int i = 0; i < score.length; i++) {
            if (score[i] > 70) {
                totalpass += score[i];
                pass++;
            } else {
                totalfail += score[i];
                fail++;
            }

        }
        averageofpass = totalpass / pass;
        averageoffail = totalfail / fail;
        System.out.println("the average score of student who passed  : " + averageofpass);
        System.out.println("the average score of student who failed  : " + averageoffail);
        sc.close();
    }
}