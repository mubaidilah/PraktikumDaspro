package Assigment;

import java.util.Scanner;

public class Assigment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menu = { "Fried Rice", "Fried Noodles", "Toasted Bread", "Fried Potatoes", "Teh Tarik", "Cappuccino",
                "Chocolate Ice" };
        System.out.print("search the menu :");
        String search = sc.nextLine();
        int result = -1;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equals(search)) {
                result = i;
                break;
            }
        }
        if (result != -1) {
            System.out.println("the item is avaliable at index menu " + result);
        } else {
            System.out.println("the item is not on the menu ");
        }
        sc.close();
    }
}