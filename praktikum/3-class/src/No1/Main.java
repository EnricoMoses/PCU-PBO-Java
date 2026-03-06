package No1;

public class Main {
  public static void main(String[] args) {
    Laptop asus = new Laptop();
    asus.merk = "Asus";
    asus.processor = "Intel";
    asus.ram = 16;
    asus.printInfo();

    Laptop macbook = new Laptop();
    macbook.merk = "Macbook";
    macbook.processor = "M5";
    macbook.ram = 8;
    macbook.printInfo();
  }
}
