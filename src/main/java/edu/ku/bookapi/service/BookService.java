package edu.ku.bookapi.service;

import edu.ku.bookapi.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private final List<Book> books = new ArrayList<>();

    public List<Book> getAllBooks() {
        return books;
    }

    public Book addBook(Book book) {
        books.add(book);
        return book;
    }

    public Book getBookById(Long id) {

        for (Book book : books) {

            if (book.getId().equals(id)) {
                return book;
            }
        }

        return null;
    }

    public Book updateBook(Long id, Book updatedBook) {

        for (Book book : books) {

            if (book.getId().equals(id)) {

                book.setTitle(updatedBook.getTitle());
                book.setAuthor(updatedBook.getAuthor());
                book.setIsbn(updatedBook.getIsbn());
                book.setPublishedYear(updatedBook.getPublishedYear());
                book.setCategory(updatedBook.getCategory());

                return book;
            }
        }

        return null;
    }
    public boolean deleteBook(Long id) {

        for (Book book : books) {

            if (book.getId().equals(id)) {
                books.remove(book);
                return true;
            }
        }

        return false;
    }
}