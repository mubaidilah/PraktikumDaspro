package jobsheet9.Assigment;
public package jobsheet9.Assigment;
import java.util.Scanner;
public class Assigment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 1. Ask for the number of orders
        System.out.print("Enter the number of orders: ");
        int numberOfOrders = input.nextInt(); 
        // 2. Create the arrays (You create 2 arrays here)
        String[] orderNames = new String[numberOfOrders];
        double[] orderPrices = new double[numberOfOrders];
        // 3. Create the total cost variable
        double totalCost = 0.0;
        System.out.println("\n--- Enter Order Data ---");
        // 4. Loop to fill the data
        for (int i = 0; i < numberOfOrders; i++) {
            // ... (Add your code to ask for name & price)
            System.out.print("enter the name of food / drink :");
            // ... (Store them in orderNames[i] and orderPrices[i])
            orderNames[i] = input.next();
            // ... (Add the price to totalCost)
            System.out.print("how many the price Rp.");
            orderPrices[i] = input.nextDouble();
            totalCost +=orderPrices[i];
        }
        
        System.out.println("\n--- Order Receipt ---");
        // 5. Loop to display the data
        for (int i = 0; i < numberOfOrders; i++) {
            // ... (Print orderNames[i] and orderPrices[i])
            System.out.println("you order "+(i+1)+" "+orderNames[i]+" and the price is : "+orderPrices[i]);
        }
        // 6. Display the total cost
        System.out.println("--------------------");
        System.out.println("Total: Rp " + totalCost);
        
        input.close(); // Good practice to close the scanner
    }
} {
    
}
