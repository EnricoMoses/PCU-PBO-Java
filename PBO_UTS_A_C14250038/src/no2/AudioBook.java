package no2;

import no1.Person;

public class AudioBook extends EBook {
    private double durationHours;
    private Person narator;

    public AudioBook(String title, Person author, double fileSizeMB, double durationHours, Person narator) {
        super(title, author, fileSizeMB);
        this.durationHours = durationHours;
        this.narator = narator;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Duration Hours: " + this.durationHours);
        System.out.println("Fullname Narator: " + this.narator.getFullname());
    }
}
