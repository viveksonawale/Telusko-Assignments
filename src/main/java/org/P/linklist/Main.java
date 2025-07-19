package org.P.linklist;

import java.util.LinkedList;
import java.util.Scanner;

class Student {
    int studentId;
    String name;

    Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID: " + studentId + ", Name: " + name;
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList<Student> studentList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Display Students");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: // Add
                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    studentList.add(new Student(id, name));
                    System.out.println("Student Added Successfully!");
                    break;

                case 2: // Update
                    System.out.print("Enter ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    boolean updated = false;

                    for (Student st : studentList) {
                        if (st.studentId == updateId) {
                            System.out.print("Enter new Student ID: ");
                            st.studentId = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter new Name: ");
                            st.name = scanner.nextLine();
                            System.out.println("Student Updated Successfully!");
                            updated = true;
                            break;
                        }
                    }

                    if (!updated) {
                        System.out.println("Student ID not found!");
                    }
                    break;

                case 3: // Delete
                    System.out.print("Enter ID to delete: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();
                    boolean removed = false;

                    for (int i = 0; i < studentList.size(); i++) {
                        if (studentList.get(i).studentId == deleteId) {
                            studentList.remove(i);
                            System.out.println("Student Deleted Successfully!");
                            removed = true;
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("Student ID not found!");
                    }
                    break;

                case 4: // Display
                    if (studentList.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        for (Student st : studentList) {
                            System.out.println(st);
                        }
                    }
                    break;

                case 5: // Exit
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Input!");
            }
        }
    }
}
