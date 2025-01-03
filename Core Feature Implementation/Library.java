// Library.java

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    // Constructor to initialize the book collection
    public Library() {
        books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book: " + book);
    }

    // Search for a book by title
    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Borrow a book
    public boolean borrowBook(String title) {
        Book book = searchBook(title);
        if (book != null && book.isAvailable()) {
            book.setAvailable(false);  // Mark as borrowed
            System.out.println("You borrowed: " + book);
            return true;
        }
        System.out.println("Book not available for borrowing.");
        return false;
    }

    // Return a borrowed book
    public boolean returnBook(String title) {
        Book book = searchBook(title);
        if (book != null && !book.isAvailable()) {
            book.setAvailable(true);  // Mark as available
            System.out.println("You returned: " + book);
            return true;
        }
        System.out.println("Book not borrowed or not found.");
        return false;
    }

    // List all books in the library
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Library Books:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}
