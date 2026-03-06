package No3;

public class Buah {
  String nama;
  int harga;
  int stok;

  void tampilInfo() {
    System.out.println("Nama: " + nama + ", Harga: Rp." + harga + ", Stok: " + stok);
  }

  boolean stokCukup(int jumlah) {
    if (stok >= jumlah && jumlah > 0) {
      return true;
    }
    return false;
  }

  void kurangiStok(int jumlah) {
    stok = stok - jumlah;
  }

  int hitungHarga(int jumlah) {
    return harga * jumlah;
  }
}
