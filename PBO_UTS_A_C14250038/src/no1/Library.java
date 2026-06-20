package no1;

import java.util.ArrayList;

public class Library {
    protected String libraryName;
    private ArrayList<Book> bookCatalog;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.bookCatalog = new ArrayList<>() ;
    }

    public void addBook(String title, String firstName, String lastName, int stock) {
        Person newAuthor = new Person(firstName, lastName);
        Book newBook = new Book(title, newAuthor, stock);
        this.bookCatalog.add(newBook);
    }

    public void addBook(String title, Person author, int stock) {
        Book newBook = new Book(title, author, stock);
        this.bookCatalog.add(newBook);
    }

    public Book getBookWithLowestStok() {
        int lowest_stock = 99999999;
        Book lowest_stock_book = null;
        for (Book book : bookCatalog) {
            if (book.getStock() < lowest_stock) {
                lowest_stock = book.getStock();
                lowest_stock_book = book;
            }
        }
        return lowest_stock_book;
    }

    public void displayInventory() {
        System.out.println("Libary Name: " + this.libraryName);
        System.out.println();
        for (Book book : bookCatalog) {
            book.display();
        }
    }
}
