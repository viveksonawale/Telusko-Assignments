package org.A;

import java.util.Scanner;

public class Main {
    private static int addition(int a, int b) {
        return a + b;
    }

    private static int subtraction(int a, int b) {
        return a - b;
    }

    private static int multiplication(int a, int b) {
        return a * b;
    }

    private static double division(int a, int b) {
        return (double) a / b;
    }

    private static double mod(int a, int b) {
        return (double) a % b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Calculator!!!!");
        while (true) {
            System.out.print("Enter First Number: ");
            int a = scanner.nextInt();
            System.out.print("Enter Second Number: ");
            int b = scanner.nextInt();
            System.out.print("Enter Operator [+,-,*,/,%,E]: ");
            char operator = scanner.next().charAt(0);
            switch (operator) {
                case '+':
                    System.out.println(addition(a, b));
                    break;
                case '-':
                    System.out.println(subtraction(a, b));
                    break;
                case '*':
                    System.out.println(multiplication(a, b));
                    break;
                case '/':
                    System.out.println(division(a, b));
                    break;
                case '%':
                    System.out.println(mod(a, b));
                    break;
                case 'E':
                    System.out.println("Exiting!");
                    System.exit(0);
                    break;
                case 'e':
                    System.out.println("Exiting!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error!!!!");
            }
        }
    }
}