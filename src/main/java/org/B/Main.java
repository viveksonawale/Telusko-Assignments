package org.B;

class Car {
    public String model;
    public int year;

    public void display() {
        System.out.println("Car Model: " + model);
        System.out.println("Year: " + year);
    }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        display();
    }
}

public class Main {
    public static void main(String[] args) {
        Car carRangRover = new Car("Range Rover",2024);
        Car carLambo = new Car("Lamborghini Sian",2022);
    }
}
