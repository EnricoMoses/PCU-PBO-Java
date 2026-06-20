package no2;

import no1.Book;
import no1.Person;

public class EBook extends Book {
    private double fileSizeMB;


    public EBook(String title, Person author, double fileSizeMB) {
        super(title, author, 0);
        this.fileSizeMB = fileSizeMB;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

    @Override
    public void display() {
        System.out.println("Title: " + this.title);
        System.out.println("Fullname Author: " + this.author.getFullname());
        System.out.println("File Size (MB): " + this.fileSizeMB);
//        System.out.println();
    }
}
