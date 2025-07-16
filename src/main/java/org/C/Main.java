package org.C;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principle Amount: ");
        double principle = scanner.nextDouble();
        System.out.print("Enter the Rate of Interest: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter the Time duration: ");
        double time = scanner.nextDouble();

        double simpleInterest = (principle * rate * time) / 100;
        System.out.println("Simple Interest is: " + simpleInterest);
    }
}
