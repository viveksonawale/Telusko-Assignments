package org.N;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class ContactInformation {
    String name;
    int contactNumber;
    String email;

    public ContactInformation(String name, int contactNumber, String email) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact Information: " +
                "name='" + name + '\'' +
                ", contactNumber=" + contactNumber +
                ", email='" + email + '\'';
    }
}

public class Main {
    static ContactInformation contactInformation = null;

    public static void main(String[] args) {

        HashMap<Integer, List<ContactInformation>> contactHashMap = new HashMap<Integer, List<ContactInformation>>();
        List<ContactInformation> contactInformationList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Contact Id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the Name");
        String name = scanner.nextLine();
        System.out.println("Enter the Contact Number:");
        int contactNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the email: ");
        String email = scanner.nextLine();

        contactInformation = new ContactInformation(name, contactNumber, email);
        contactInformationList.add(contactInformation);
        contactHashMap.put(id,contactInformationList);
    }
}
