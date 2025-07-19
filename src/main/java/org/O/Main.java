package org.O;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void displayList(List<?> list) {
        for (Object a : list) {
            System.out.println(a);
        }
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
//        Adding Integers
        List<Integer> listInteger = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Integer Added!");
        displayList(listInteger);

//        Adding Double
        List<Double> listDouble = Arrays.asList(1.2, 2.234, 3.43, 4.213, 5.33);
        System.out.println("Double Added!");
        displayList(listDouble);

//        Adding String
        List<String> listString = Arrays.asList("Hello", "This is API");
        System.out.println("String Added!");
        displayList(listString);

    }
}
