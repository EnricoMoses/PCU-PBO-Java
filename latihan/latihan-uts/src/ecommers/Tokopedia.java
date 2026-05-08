package ecommers;

public class Tokopedia extends Platform {
  public Tokopedia(String namaPlatform, int jumlahTransaksi) {
    super(namaPlatform, jumlahTransaksi);
  }

  @Override
  public double hitungTotal(double harga) {
    return super.hitungTotal(harga) + 5000;
  }

  @Override
  public double hitungTotal(double harga, int jumlah) {
    return super.hitungTotal(harga, jumlah) + 5000;
  }
}
