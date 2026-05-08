package ecommers;

public class Platform {
  private String namaPlatform;
  private int jumlahTransaksi;


  public Platform(String namaPlatform, int jumlahTransaksi) {
    this.namaPlatform = namaPlatform;
    this.jumlahTransaksi = jumlahTransaksi;
  }

  public String getNamaPlatform() {
    return namaPlatform;
  }

  public int getJumlahTransaksi() {
    return jumlahTransaksi;
  }

  public void tampil() {
    System.out.println("Platform: " + this.namaPlatform + ", Transaksi: " + this.jumlahTransaksi);
  }

  public double hitungTotal(double harga) {
    return harga;
  }

  public double hitungTotal(double harga, int jumlah) {
    return harga * jumlah;
  }

  public static int totalSemuaTransaksi(Platform[] data) {
    int totalTransaksi = 0;
    for (Platform i : data) {
      int transaksi = i.getJumlahTransaksi();
      totalTransaksi += transaksi;
    }
    return totalTransaksi;
  }
}
