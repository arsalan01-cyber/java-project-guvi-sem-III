package com.library.ui;

import com.library.service.BookService;
import com.library.model.Book;
import com.library.utils.LoggingUtils;

import java.util.List;
import java.util.Scanner;

public class LibraryUI {
    private BookService bookService = new BookService();
    private Scanner scanner = new Scanner(System.in);

    // Display the menu and interact with the user
    public void start() {
        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Find Book by Title");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    viewAllBooks();
                    break;
                case 3:
                    findBookByTitle();
                    break;
                case 4:
                    System.out.println("Exiting the system.");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Add a book
    private void addBook() {
        System.out.print("Enter Book ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Book Author: ");
        String author = scanner.nextLine();
        
        try {
            bookService.addBook(id, title, author);
            LoggingUtils.logInfo("Added new book: " + title);
            System.out.println("Book added successfully.");
        } catch (Exception e) {
            LoggingUtils.logError("Error adding book", e);
            System.out.println("Error occurred while adding the book.");
        }
    }

    // View all books
    private void viewAllBooks() {
        List<Book> books = bookService.getAllBooks();
        if (books.isEmpty()) {
            System.out.println("No books available in the system.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    // Find book by title
    private void findBookByTitle() {
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();
        Book book = bookService.findBook(title);
        if (book == null) {
            System.out.println("Book not found.");
        } else {
            System.out.println("Book found: " + book);
        }
    }
}
