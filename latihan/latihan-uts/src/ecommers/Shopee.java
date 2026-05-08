package ecommers;

public class Shopee extends Platform {
  public Shopee(String namaPlatform, int jumlahTransaksi) {
    super(namaPlatform, jumlahTransaksi);
  }

  @Override
  public double hitungTotal(double harga) {
    double total = super.hitungTotal(harga);
    double diskon = total * 0.1; // Diskon 10%
    return total - diskon;
  }

  @Override
  public double hitungTotal(double harga, int jumlah) {
    double total = super.hitungTotal(harga, jumlah);
    double diskon = total * 0.1; // Diskon 10%
    return total - diskon;
  }
}
