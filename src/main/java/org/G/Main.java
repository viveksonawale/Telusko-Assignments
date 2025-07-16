package org.G;

class Product {
    public String name;
    public int price;
    public int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Milk", 70, 1);
        Product product1 = new Product("Milk");
    }
}
