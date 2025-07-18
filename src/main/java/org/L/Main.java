package org.L;

import java.util.Scanner;

interface Shape {
    abstract void area();

    void perimeter();
}

class Square implements Shape {
    int s;

    public Square(int s) {
        this.s = s;
    }

    @Override
    public void area() {
        System.out.println("Area of the Square is: " + (s * s));
    }

    @Override
    public void perimeter() {
        System.out.println("Area of the Perimeter is: " + (4 * s));
    }
}

class Triangle implements Shape {
    int len;
    int width;
    int c;

    public Triangle(int len, int width, int c) {
        this.len = len;
        this.width = width;
        this.c = c;
    }

    @Override
    public void area() {
        System.out.println("Area of the Triangle is: " + (0.5 * len * width));
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of the Triangle is: " + (len + width + c));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Choice \n1. Square\n2. Triangle");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter side of the square: ");
                int side = scanner.nextInt();
                Square square = new Square(side);
                square.area();
                square.perimeter();
                break;

            case 2:
                System.out.print("Enter length: ");
                int length = scanner.nextInt();
                System.out.print("Enter width: ");
                int width = scanner.nextInt();
                System.out.print("Enter third side: ");
                int c = scanner.nextInt();
                Triangle triangle = new Triangle(length, width, c);
                triangle.area();
                triangle.perimeter();
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
