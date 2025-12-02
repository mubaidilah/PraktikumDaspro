package jobsheet11.Assigment;
import java.util.Scanner;
public class SurveyAnalyzer {
    public static void main(String[] args) {
        // --- Setup ---
        final int ROWS = 10; // 10 Respondents
        final int COLS = 6;  // 6 Questions
        int[][] survey = new int[ROWS][COLS];
        double totalSum = 0.0;
        Scanner input = new Scanner(System.in);

        // --- Part 1: Storing Survey Results ---
        System.out.println("--- Enter Survey Data ---");
        System.out.println("Please enter scores from 1 to 5.");
        for (int i = 0; i < ROWS; i++) { // Loop for each Respondent
            for (int j = 0; j < COLS; j++) { // Loop for each Question
                System.out.print("Enter score for Respondent " + (i + 1) + ", Question " + (j + 1) + ": ");
                survey[i][j] = input.nextInt();
                totalSum += survey[i][j]; // Add to the grand total
            }
        }

        // --- Part 2: Displaying Average for Each Respondent (Row Average) ---
        System.out.println("\n--- Average per Respondent ---");
        for (int i = 0; i < ROWS; i++) {
            double rowSum = 0.0;
            for (int j = 0; j < COLS; j++) {
                rowSum += survey[i][j];
            }
            double rowAverage = rowSum / COLS;
            System.out.println("Average for Respondent " + (i + 1) + ": " + rowAverage);
        }

        // --- Part 3: Displaying Average for Each Question (Column Average) ---
        System.out.println("\n--- Average per Question ---");
        for (int j = 0; j < COLS; j++) {
            double colSum = 0.0;
            for (int i = 0; i < ROWS; i++) {
                colSum += survey[i][j];
            }
            double colAverage = colSum / ROWS;
            System.out.println("Average for Question " + (j + 1) + ": " + colAverage);
        }

        // --- Part 4: Displaying Overall Average Score ---
        System.out.println("\n--- Overall Average ---");
        double totalElements = ROWS * COLS;
        double overallAverage = totalSum / totalElements;
        System.out.println("Overall Average Score: " + overallAverage);

        input.close();
    }
}