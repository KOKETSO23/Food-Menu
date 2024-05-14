import javax.swing.*;
import java.util.Scanner;

public class Main {
    private static Scanner enter;

    public static void main(String[] args) {
        // Switch Statement


       Scanner enter = new Scanner(System.in);
       System.out.println("Enter food menu: ");
         int Food = enter.nextInt();

         System.out.println(" 0. Food Menu: ");
        System.out.println("1. Food");
        System.out.println("2. Drinks: ");


        int menu = enter.nextInt();

        if (menu >= 1 && menu <= 2){
            switch (menu) {
                case 1:
                    System.out.println("Food Menu");
                    System.out.println("1. Beef");
                    System.out.println("Chicken");
                    System.out.println("Pork");

                case 2:
                    System.out.println("Drinks");
                    System.out.println("Soft Drinks");
                    System.out.println("Beer");
                    
            }

            } else
                System.out.println("Invalid option");

        }
    }
