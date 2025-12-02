package jobsheet7;
import java.util.Scanner;

public class DoWhileLeaveEntitlement14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int leaveEntitlement = 0, numLeave;
        String confirmation = "";
        System.out.print("Input the number of Leave Entitlement : ");
        leaveEntitlement = input.nextInt();
        do {
            System.out.print("do you want to take a leave (y/n): ");
            confirmation = input.next();
            if (confirmation.equalsIgnoreCase("y")) {
                System.out.print("how many day: ");
                numLeave = input.nextInt();
                while (numLeave > leaveEntitlement) {
                    System.out.println("you dont have enough leave entitlement. Remaining: " + leaveEntitlement);
                    System.out.print("Please re-enter number of days: ");
                    numLeave = input.nextInt();
                }
                leaveEntitlement -= numLeave;
                System.out.println("Remaining leave entitlement: " + leaveEntitlement);
            } else if (confirmation.equalsIgnoreCase("n")) {
                System.out.println("Exiting program...");
                break; 
            }
        } while (leaveEntitlement > 0);
        input.close();
    }
}