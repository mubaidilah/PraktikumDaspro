package jobsheet8;
import java.util.Scanner;
public class assigment4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] sports = {"Badminton", "Table Tennis", "Basketball", "Volleyball"};
        String[][] athletes = new String[sports.length][5];

        System.out.println("=== Input Data Atlet Porseni Polinema 2024 ===");
        System.out.println("-------------------------------------------------");
        
        for (int i = 0; i < sports.length; i++) {
            System.out.println("\nEnter the data For Cabor: " + sports[i]);
  
            for (int j = 0; j < athletes[i].length; j++) {
                System.out.print("  Enter Atlet neme - " + (j + 1) + ": ");
                athletes[i][j] = input.nextLine();
            }
            

            for (int k = 0; k < athletes[i].length - 1; k++) {
                
                for (int l = 0; l < athletes[i].length - k - 1; l++) {
                    
                   
                    if (athletes[i][l].compareTo(athletes[i][l+1]) > 0) {
                        
                        String temp = athletes[i][l]; 
                        athletes[i][l] = athletes[i][l+1]; 
                        athletes[i][l+1] = temp; 
                    }
                }
            }
            // --- Akhir dari Bubble Sort ---
        }
        
        System.out.println("\n\n=== List Atlet Porseni name (by Alfabetis) ===");
        System.out.println("----------------------------------------------------");

        int sportIndex = 0;
        
        for (String[] sportRow : athletes) {
            System.out.println("\n### " + sports[sportIndex] + " ###");
            
            for (String name : sportRow) {
                System.out.println("  - " + name);
            }
            sportIndex++;
        }
        
        input.close();
    }
}