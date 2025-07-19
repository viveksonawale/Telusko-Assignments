package org.R;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> menu = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1.Add a new Dish");
            System.out.println("2.Update dish Price");
            System.out.println("3.Display the Menu");
            System.out.println("4.Remove a Dish");
            System.out.println("5.Exit");
            System.out.print("Enter Your Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter the Dish Name: ");
                    String dishName = scanner.nextLine();
                    System.out.print("Enter the Price: ");
                    int dishPrice = scanner.nextInt();
                    menu.put(dishName, dishPrice);
                    System.out.println("Dish Added");
                    break;
                case 2:
                    System.out.print("Enter the Dish Name to Update: ");
                    String updateDish = scanner.nextLine();
                    if (menu.containsKey(updateDish)) {
                        System.out.print("Enter new price: ");
                        int newPrice = scanner.nextInt();
                        menu.put(updateDish, newPrice);
                        System.out.println(updateDish + " price updated.");
                    } else {
                        System.out.println("Dish Not found!");
                    }
                    break;
                case 3:
                    System.out.println("---- MENU ----");
                    for (String key : menu.keySet()) {
                        System.out.println(key + ": $" + menu.get(key));
                    }
                    break;
                case 4:
                    System.out.print("Enter the dish name to remove: ");
                    String dishDelete = scanner.nextLine();
                    boolean deleteStatus = false;
                    if (menu.containsKey(dishDelete)) {
                        menu.remove(dishDelete);
                        deleteStatus = true;
                        System.out.println("Dish Deleted Successfully!");
                    } else if (deleteStatus == false) {
                        System.out.println("dish not found!");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid choice!");
            }
        }
    }
}
