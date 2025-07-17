package org.J;

import java.util.Scanner;

abstract class Shape {
    public abstract void calculateArea();
    public abstract void calculatePerimeter();
}

class Rectangle extends Shape {
    int length, width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of Rectangle: " + (length * width));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of Rectangle: " + (2 * (length + width)));
    }
}

class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Circumference of Circle: " + (2 * Math.PI * radius));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose shape (1 for Rectangle, 2 for Circle):");
        int choice = scanner.nextInt();

        Shape shape;

        if (choice == 1) {
            System.out.println("Enter length and width of rectangle:");
            int length = scanner.nextInt();
            int width = scanner.nextInt();
            shape = new Rectangle(length, width);
        } else {
            System.out.println("Enter radius of circle:");
            int radius = scanner.nextInt();
            shape = new Circle(radius);
        }

        shape.calculateArea();
        shape.calculatePerimeter();
    }
}
