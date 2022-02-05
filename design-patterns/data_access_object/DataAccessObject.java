package data_access_object;

import java.lang.System;
import java.util.ArrayList;
import java.util.List;

// https://www.journaldev.com/16813/dao-design-pattern
// data access object

class Book { // data unit
    int isbn; int price;
    public Book (int isbn) {
        this.isbn = isbn;
        this.price = 0;
    }
    public void repr() {
        System.out.println(this.isbn + " " + this.price);
    }
}

interface IBooksDAO {
    public List<Book> getAllBooks();
    public void addBookByISBN(int isbn);
}

class BooksDAO implements IBooksDAO { // The PERSISTENCE Layer
    private List<Book> db; // private database
    public BooksDAO() {
        db = new ArrayList<>();
    }
    public List<Book> getAllBooks() {
        return db;
    }
    public void addBookByISBN(int isbn) {
        db.add(new Book(isbn));
    }
}

public class DataAccessObject {
    public static void main(String[] args) { // The Business logic/ Service Layer
        BooksDAO d = new BooksDAO();
        for (int i=0; i < 10; i++) {
            d.addBookByISBN(i);
        }
        System.out.println("printing books..");
        for (Book b: d.getAllBooks()) {
            b.repr();
        }
    }
}
