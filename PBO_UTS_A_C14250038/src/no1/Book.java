package no1;

public class Book {
    protected String title;
    protected Person author;
    private int stock;

    public Book(String title, Person author, int stock) {
        this.title = title;
        this.author = author;
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void addStock(int addition) {
        this.stock += addition;
    }



    public void display() {
        System.out.println("Title: " + this.title);
        System.out.println("Fullname Author: " + this.author.getFullname());
        System.out.println("Stock: " + this.stock);
        System.out.println();
    }
}
