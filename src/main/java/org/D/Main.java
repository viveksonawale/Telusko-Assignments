package org.D;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String: ");
        String inputString = scanner.nextLine();
        StringBuffer stringBuffer = new StringBuffer(inputString);
        String reverseInputString = stringBuffer.reverse().toString();
//        System.out.println(inputString);
//        System.out.println(reverseInputString);
        if (inputString.equals(reverseInputString)) {
            System.out.println("String is a Palindrome");
        } else {
            System.out.println("String is Not Palindrome");
        }
    }
}
