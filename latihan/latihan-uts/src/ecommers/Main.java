package ecommers;

public class Main {
  public static void main(String[] args) {
    Shopee shopee = new Shopee("Shopee", 5);
    Tokopedia tokopedia = new Tokopedia("Tokopedia", 3);

    double harga = 100000;
    int jumlah = 2;

    System.out.println("=== Data Platform ===");
    shopee.tampil();
    tokopedia.tampil();
    System.out.println();

    double satuBarangShopee = shopee.hitungTotal(harga);
    double duaBarangShopee = shopee.hitungTotal(harga, jumlah);

    double satuBarangTokopedia = tokopedia.hitungTotal(harga);
    double duaBarangTokopedia = tokopedia.hitungTotal(harga, jumlah);

    System.out.println("=== Perhitungan ===");
    System.out.println(shopee.getNamaPlatform() + " (1 barang): " + satuBarangShopee);
    System.out.println(shopee.getNamaPlatform() + " (2 barang): " + duaBarangShopee);
    System.out.println();

    System.out.println(tokopedia.getNamaPlatform() + " (1 barang): " + satuBarangTokopedia);
    System.out.println(tokopedia.getNamaPlatform() + " (2 barang): " + duaBarangTokopedia);
    System.out.println();

    Platform[] data = {shopee, tokopedia};
    int totalSemuaTransaksi = Platform.totalSemuaTransaksi(data);
    System.out.println("Total Semua Transaksi: " + totalSemuaTransaksi);
  }
}
