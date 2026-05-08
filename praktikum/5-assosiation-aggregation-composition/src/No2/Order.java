package No2;

import java.util.ArrayList;

public class Order {
  private String namaCustomer;
  private ArrayList<Item> items; // composition

  public Order(String namaCustomer) {
    this.namaCustomer = namaCustomer;
    this.items = new ArrayList<>();
  }

  public void addItem(String nama, int harga) {
    items.add(new Item(nama, harga));
  }

  public void display() {
    System.out.println("Nama Customer: " + namaCustomer);
    System.out.println("Daftar Item:");

    int total = 0;
    for (Item item: items) {
      System.out.println("- " + item.namaItem + " : " + item.harga);
      total += item.harga;
    }
    System.out.println("Total harga: " + total);
  }

  public class Item {
    private String namaItem;
    private int harga;

    public Item(String nameItem, int harga) {
      this.namaItem = nameItem;
      this.harga = harga;
    }
  }
}
