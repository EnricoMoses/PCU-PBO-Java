package No2;

public class Main {
  public static void main(String[] args) {
    Order order = new Order("James");

    order.addItem("Buku", 25000);
    order.addItem("Pulpen", 5000);
    order.addItem("Tas", 150000);

    order.display();
  }
}
