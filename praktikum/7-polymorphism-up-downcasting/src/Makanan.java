public class Makanan extends Produk {
  private int sisaHariExpired;

  public Makanan(String nama, int hargaDasar, int qty, int sisaHariExpired) {
    super(nama, hargaDasar, qty);
    this.sisaHariExpired = sisaHariExpired;
  }

  @Override
  public int hitungSubTotal() {
    int total = super.hitungSubTotal();
    if (this.sisaHariExpired <= 3) {
      total = (int) (total * 0.50);
    }
    return total;
  }

  public void aktifkanPengirimanInstan() {
    System.out.println("  [Aksi] PENGIRIMAN PRIORITAS: Menggunakan kurir instan dan ice gel untuk " + this.nama + "!");
  }

  public String toString() {
    return "ladhfla";
  }
}
