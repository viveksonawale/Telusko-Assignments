package org.P.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int studentId;
    String name;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", name='" + name + '\'' + '}';
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1.Add Student");
            System.out.println("2.Update Student");
            System.out.println("3.Remove Student");
            System.out.println("4.Display Student");
            System.out.println("5.Exit");
            System.out.print("Enter Your Choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int studentId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter the Student Name: ");
                    String name = scanner.nextLine();
                    Student s = new Student(studentId, name);
                    studentArrayList.add(s);
                    System.out.println("Student Added Successfully!");
                    break;
                case 2:
                    System.out.print("Enter ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();

                    boolean found = false;

                    for (Student st : studentArrayList) {
                        if (st.studentId == updateId) {
                            System.out.print("Enter new Student ID: ");
                            int newStudentId = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter new Student Name: ");
                            String newName = scanner.nextLine();

                            st.studentId = newStudentId;
                            st.name = newName;

                            System.out.println("Student updated successfully!");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student ID not found.");
                    }

                    break;
                case 3:
                    boolean removed = false;
                    System.out.println("Enter ID For Deletion: ");
                    int deleteId = scanner.nextInt();
                    for (int i = 0; i < studentArrayList.size(); i++) {
                        if (studentArrayList.get(i).studentId == deleteId) {
                            studentArrayList.remove(i);
                            System.out.println("Student deleted successfully!");
                            removed = true;
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("Student ID not found.");
                    }
                    break;
                case 4:
                    if (!studentArrayList.isEmpty()) {
                        for (Student st : studentArrayList) {
                            System.out.println(st);
                        }
                    } else {
                        System.out.println("No Student data found!");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input!");
            }
        }
    }
}
