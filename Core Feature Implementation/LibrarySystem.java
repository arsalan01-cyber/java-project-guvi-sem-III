// LibrarySystem.java (Driver/Main Class)

public class LibrarySystem {
    public static void main(String[] args) {
        // Create a Library instance
        Library library = new Library();

        // Add books to the library
        library.addBook(new Book("The Catcher in the Rye", "J.D. Salinger"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book("1984", "George Orwell"));

        // List all books in the library
        library.listBooks();

        // Search for a book by title
        String bookToSearch = "1984";
        Book foundBook = library.searchBook(bookToSearch);
        if (foundBook != null) {
            System.out.println("Found book: " + foundBook);
        } else {
            System.out.println("Book '" + bookToSearch + "' not found.");
        }

        // Borrow a book
        String bookToBorrow = "1984";
        boolean borrowSuccess = library.borrowBook(bookToBorrow);
        if (borrowSuccess) {
            // Try borrowing the same book again
            library.borrowBook(bookToBorrow);  // Should fail as it's already borrowed
        }

        // Return a book
        String bookToReturn = "1984";
        boolean returnSuccess = library.returnBook(bookToReturn);
        if (returnSuccess) {
            // List books after returning one
            library.listBooks();
        }
    }
}
