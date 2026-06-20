package no2;

import no1.Person;

public class Main {
    public static void main(String[] args) {
        DigitalLibrary myDigitalLibrary = new DigitalLibrary("My Second Library");
        myDigitalLibrary.addEBook("The Hobbit", new Person("J.R.R", "Tolkien"), 30.4);
        myDigitalLibrary.addEBook("Divergent", new Person("Veronica", "Roth"), 45.7);
        myDigitalLibrary.addAudioBoook("Angels and Demons", new Person("Dan", "Brown"), 752.4, 18.5, new Person("Richard", "Poe"));
        myDigitalLibrary.displayInventory();

        System.out.println(myDigitalLibrary.getTotalFileSizeMB());
    }
}
