package no1;

public class Main {
    public static void main(String[] args) {
        Library myLibary = new Library("My First Library");
        myLibary.addBook("Harry Potter and the Goblet of Fire", "J.K.", "Rowling", 3);
        myLibary.addBook("A Game of Thrones", new Person("George R.R.", "Martin"), 4);
        myLibary.displayInventory();

        Book myBook = myLibary.getBookWithLowestStok();
//        System.out.println("lowestttttt");
        myBook.display();
        myBook.addStock(2);
//        System.out.println("displayyyyy");
        myLibary.displayInventory();

        myBook = myLibary.getBookWithLowestStok();
//        System.out.println("lowessttttt2");
        myBook.display();
        myBook.addStock(2);
//        System.out.println("displayyyyy2");
        myLibary.displayInventory();
    }

}
