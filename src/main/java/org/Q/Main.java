package org.Q;

import java.util.Scanner;

class CustomList<T> {
    T t;

    public CustomList(T t) {
        this.t = t;
    }

    public T getData() {
        return t;
    }
}

public class Main {
    public static void main(String[] args) {
        CustomList<Integer> customList = new CustomList<>(1999);
        Scanner scanner = new Scanner(System.in);
        // added the data
        System.out.println("Enter the Number: ");
        int data = scanner.nextInt();
        // get and display method implemented here
        System.out.println(customList.getData());
    }
}
