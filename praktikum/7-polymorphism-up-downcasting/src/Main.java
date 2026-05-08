import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    ArrayList<Produk> keranjang = new ArrayList<>();

    Produk barang1 =  new Elektronik("Laptop Gaming", 15000000, 1, true);
    Produk barang2 = new Elektronik("Mouse Wireless", 250000, 2, false);
    Produk barang3 = new Pakaian("Kaos Polos", 100000, 4, "M");
    Produk barang4 = new Makanan("Susu Sapi", 20000, 2, 2);
    Produk barang5 = new Makanan("Brownies", 45000, 1, 2);

    System.out.println(barang5);
    System.out.println(barang5.toString());

    keranjang.add(barang1);
    keranjang.add(barang2);
    keranjang.add(barang3);
    keranjang.add(barang4);
    keranjang.add(barang5);

    System.out.println("=== NOTA PEMBAYARAN E-COMMERCE ===\n");

    int grandTotal = 0;

    for (Produk item : keranjang) {
      System.out.println("- " + item.getNama() + " (Qty: " + item.getQty() + ")");
      int subTotal = item.hitungSubTotal();
      System.out.println("  Subtotal: Rp " + subTotal);

      grandTotal += subTotal;

      if (item instanceof Elektronik) {
        ((Elektronik) item).cetakKartuGaransi();
      } else if (item instanceof Pakaian) {
        ((Pakaian) item).cekPanduanPerawatan();
      } else if (item instanceof Makanan) {
        ((Makanan) item).aktifkanPengirimanInstan();
      }

      System.out.println();
    }

    System.out.println("TOTAL KESELURUHAN PEMBAYARAN (VALID): Rp " + grandTotal);
  }
}