public class Pakaian extends Produk{
  private String ukuran;

  public Pakaian(String nama, int hargaDasar, int qty, String ukuran) {
    super(nama, hargaDasar, qty);
    this.ukuran = ukuran;
  }

  @Override
  public int hitungSubTotal() {
    int total = super.hitungSubTotal();
    if (this.qty >= 3) {
      total = (int) (total * 0.85);
    }
    return total;
  }

  public void cekPanduanPerawatan() {
    System.out.println("  [Aksi] Melampirkan label panduan cuci & setrika untuk pakaian ukuran " + this.ukuran + "...");
  }
}
