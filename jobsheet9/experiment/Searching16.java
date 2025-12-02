package experiment;
import java.util.Scanner;
public class Searching16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of array elements :");
        int n = sc.nextInt();
        int[] arrayInt = new int[n];
        
        int result = -1;
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Enter Array Element "+i+" : " );
            arrayInt[i]=sc.nextInt(); 
        }
        System.out.print("enter key want to search : ");
        int key = sc.nextInt();
        for (int i = 0; i < arrayInt.length; i++) {
            if (key == arrayInt[i]) {
                result = i;
                break;
            } 
        }
        if (result !=-1) {
            System.out.println("the key in the array is located at index position :"+ result);
        } else {
            System.out.println("key not found ");
        }
    }
}