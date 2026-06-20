package no2;

import no1.Book;
import no1.Library;
import no1.Person;

import java.util.ArrayList;

public class DigitalLibrary extends Library {

    private ArrayList<EBook> eBookCatalog;
    private ArrayList<AudioBook> audioBookCatalog;


    public DigitalLibrary(String libraryName) {
        super(libraryName);
        eBookCatalog = new ArrayList<>();
        audioBookCatalog = new ArrayList<>();
    }

    public void addEBook(String title, Person author, double fileSizeMB) {
        EBook newEBook = new EBook(title, author, fileSizeMB);
        this.eBookCatalog.add(newEBook);
    }
    public void addAudioBoook(String title, Person author, double fileSizeMB, double durationHours, Person narator) {
        AudioBook newAudioBook = new AudioBook(title, author, fileSizeMB,durationHours, narator);
        this.audioBookCatalog.add(newAudioBook);
    }

    @Override
    public void displayInventory() {
        System.out.println("Libary Name: " + this.libraryName);
        System.out.println();
        for (EBook eBook : eBookCatalog) {
            eBook.display();
            System.out.println();
        }
        for (AudioBook audioBook : audioBookCatalog) {
            audioBook.display();
            System.out.println();
        }
    }

    public double getTotalFileSizeMB() {
        double total = 0;
        for (EBook eBook : eBookCatalog) {
            total += eBook.getFileSizeMB();
        }
        for (AudioBook audioBook : audioBookCatalog) {
            total += audioBook.getFileSizeMB();
        }
        return total;
    }
}
