package com.java.basics;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Menu Driven Program

        boolean trigger = true;
        vendingMachine: while (trigger) {
            System.out.println(
                    "Enter 0 ::  EXIT\nEnter 1 :: Water \nEnter 2 :: Limca\nEnter 3 :: Coke\nEnter 4 :: ThumbsUp\n");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enjoy your Water!!");
                    break;
                case 2:
                    System.out.println("Enjoy your Limca!!");
                    break;
                case 3:
                    System.out.println("Enjoy your Coke!!");
                    break;
                case 4:
                    System.out.println("Enjoy your ThumbsUp!!");
                    break;
                case 0:
                    // trigger = false;
                    break vendingMachine;
                // System.exit(7);
                default:
                    System.out.println("Invalid Option!");
                    break;
            }
        }

        System.out.println("Thank You for service  :)");

    }

}
