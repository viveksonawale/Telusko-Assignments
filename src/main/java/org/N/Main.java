package org.N;

import java.util.*;

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
        return "Name: " + name + ", Contact: " + contactNumber + ", Email: " + email;
    }
}

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, List<ContactInformation>> contactHashMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Welcome!===>");
        while (true) {
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Update Contact");
            System.out.println("4. Remove Contact");
            System.out.println("5. EXIT");
            System.out.print("Enter Your Choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Add Contact
                    System.out.print("Enter Contact ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Contact Number: ");
                    int contactNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();

                    ContactInformation contact = new ContactInformation(name, contactNumber, email);
                    List<ContactInformation> contactList = contactHashMap.getOrDefault(id, new ArrayList<>());
                    contactList.add(contact);
                    contactHashMap.put(id, contactList);
                    System.out.println("Contact added!");
                    break;

                case 2: // Display Contacts
                    if (contactHashMap.isEmpty()) {
                        System.out.println("No contacts to display.");
                    } else {
                        for (Map.Entry<Integer, List<ContactInformation>> entry : contactHashMap.entrySet()) {
                            System.out.println("ID: " + entry.getKey());
                            for (ContactInformation ci : entry.getValue()) {
                                System.out.println(ci);
                            }
                        }
                    }
                    break;

                case 3: // Update Contact
                    System.out.print("Enter Contact ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();

                    if (!contactHashMap.containsKey(updateId)) {
                        System.out.println("No contact found with this ID.");
                        break;
                    }

                    System.out.print("Enter index (0-based) to update: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();

                    if (index >= contactHashMap.get(updateId).size()) {
                        System.out.println("Invalid index.");
                        break;
                    }

                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter New Number: ");
                    int newNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter New Email: ");
                    String newEmail = scanner.nextLine();

                    ContactInformation updatedContact = new ContactInformation(newName, newNumber, newEmail);
                    contactHashMap.get(updateId).set(index, updatedContact);
                    System.out.println("Contact updated.");
                    break;

                case 4: // Remove Contact
                    System.out.print("Enter Contact ID to remove: ");
                    int removeId = scanner.nextInt();

                    if (!contactHashMap.containsKey(removeId)) {
                        System.out.println("ID not found.");
                    } else {
                        contactHashMap.remove(removeId);
                        System.out.println("Contact(s) removed.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

            scanner.close();
        }

    }
}
