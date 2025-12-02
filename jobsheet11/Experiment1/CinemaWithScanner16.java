package Experiment1;
import java.util.Scanner;
public class CinemaWithScanner16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] audience = new String[4][2]; 
        int row, column;
        String name, next;
        boolean isRunning = true;
        while (isRunning) {
            // --- MAIN MENU ---
            System.out.println("\n--- CINEMA MENU ---");
            System.out.println("1. Input audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");
            System.out.print("Choose your option (1-3): ");
            int choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {
                case 1: {                 
                    while (true) {
                        System.out.print("Enter a name: ");
                        name = sc.nextLine();

                        System.out.print("Enter row number: ");
                        row = sc.nextInt();

                        System.out.print("Enter column number: ");
                        column = sc.nextInt();
                        sc.nextLine(); 
                        if (row > 0 && row <= audience.length && column > 0 && column <= audience[0].length) {
                            
                            if (audience[row - 1][column - 1] != null) {
                                System.out.println("Sorry, that seat is already taken by " + audience[row - 1][column - 1]);
                            } else {
                                audience[row - 1][column - 1] = name;
                                System.out.println("Data saved successfully.");
                            }
                        } else {
                            System.out.println("Error: Row or column number is out of bounds.");
                        }
                        System.out.print("Are there any other audiences to be added? (y/n): ");
                        next = sc.nextLine();
                        if (next.equalsIgnoreCase("n")) {
                            break; 
                        }
                    }
                    break;
                } 
                case 2: {
                    System.out.println("\n------------------------------");
                    System.out.println("  Final Cinema Seating Chart:");
                    System.out.println("------------------------------");
                    for (int i = 0; i < audience.length; i++) {
                        System.out.print("Row " + (i + 1) + ": ");
                        for (int j = 0; j < audience[i].length; j++) {
                            if (audience[i][j] == null) {
                                System.out.print("[ Empty Seat ]\t");
                            } else {
                                System.out.print("[ " + audience[i][j] + " ]\t\t");
                            }
                        }
                        System.out.println(); 
                    }
                    break;
                } 
                case 3: {
                    System.out.println("Exiting program. Goodbye!");
                    isRunning = false; 
                    break; 
                } 
                default: {
                    System.out.println("Invalid option. Please enter 1, 2, or 3.");
                    break; 
                } 
            } 
        } 

        sc.close(); 
    }
}