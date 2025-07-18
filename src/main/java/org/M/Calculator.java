package org.M;

public class Calculator {
    public static void addition(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    public static void subtraction(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

    public static void multiplication(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    public static void division(int a, int b) {
        try {
            System.out.println( a / b);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }
}
