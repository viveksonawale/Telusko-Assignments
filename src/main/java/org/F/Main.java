package org.F;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    public int bookId;
    public String title;
    public String authorName;

    public Book(int bookId, String title, String authorName) {
        this.bookId = bookId;
        this.title = title;
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        int count = 0;
        count++;
        System.out.println(count);
        return
                "bookId=" + bookId +
                        ", title='" + title + '\'' +
                        ", name='" + authorName + '\''+count
                ;
    }
}

public class Main {
    static List<Book> books = null;
    static Book book = null;


    private static void addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Book Id: ");
        int bookId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Title: ");
        String title = scanner.nextLine();
        System.out.println("Enter Author Name: ");
        String authorName = scanner.nextLine();
        book = new Book(bookId, title, authorName);

    }

    public static void main(String[] args) {
        books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Your Choice:");
            System.out.println("1.Add Book\n2.Checkout Book\n3.Return Book\n4.Display Book\n5.Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addBook();
                    books.add(book);
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    System.out.println(books);
                    break;
                case 5:
                    System.out.println("Exiting..");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Something Went Wrong!!");
            }
        }
    }
}
