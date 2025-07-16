package org.E;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true) {

            System.out.print("Enter Your Number: ");
            count++;
            int userAnswer = scanner.nextInt();
            if (randomNumber == userAnswer) {
                System.out.println("Correct Answer ✅");
                System.out.println("Number of Tries: " + count);
                System.out.println("Exiting...");
                System.exit(0);
            } else if (userAnswer > randomNumber) {
                System.out.println("Hint : Number is Smaller!");
            } else if (userAnswer < randomNumber) {
                System.out.println("Hint : Number is Greater!");
            } else {
                System.out.println("something Went Wrong!");
                System.exit(0);
            }

        }
    }
}
