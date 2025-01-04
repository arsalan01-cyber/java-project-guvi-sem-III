package com.library.service;

import com.library.dao.BookDAO;
import com.library.model.Book;
import java.util.List;

public class BookService {
    private BookDAO bookDAO = new BookDAO();

    // Add a book
    public void addBook(int id, String title, String author) {
        Book book = new Book(id, title, author);
        bookDAO.addBook(book);
    }

    // Get all books
    public List<Book> getAllBooks() {
        return bookDAO.getAllBooks();
    }

    // Find a book by title
    public Book findBook(String title) {
        return bookDAO.findBookByTitle(title);
    }
}
