package jobsheet5;
import java.util.Scanner;
public class UjianSkripsi09 {
    public static void main(String[] args) {
//declaration
        Scanner sc = new Scanner(System.in);
        String message;
        //input
        System.out.println("has a student been cleared of compensation ? yes or no");
        String compensationStatus = sc.nextLine().trim();
        System.out.println("Enter the number of guidance logs with supervisor 1: ");
        int supervisor1 =sc.nextInt();
        System.out.println("Enter the number of guidance logs with supervisor 2: ");
        int supervisor2 =sc.nextInt();
        //proses
        if (compensationStatus.equalsIgnoreCase("yes")) {
            if (supervisor1 >= 8 && supervisor2 >=4) {
                message="are reqeriments are met. the student may register for the thesis exam";
            } else if (supervisor1 <8 && supervisor2 <4) {
                message="failed guidance logs with Supervisor 1 are fewer than 8 and Supervisor 2 fewer than 4";
            } else if (supervisor1 <8 && supervisor2 >=4) {
                message ="failed guidance logs with Supervisor 1 are fewer than 8";
            } else  {
                message ="failed guidance logs with Supervisor 2 are fewer than 4";
            }  
        } else {
            message="Failed : the student has not been cleared of comparition";
        }
        //output
        System.out.println(message);
    }
}