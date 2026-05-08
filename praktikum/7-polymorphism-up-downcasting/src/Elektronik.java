public class Elektronik extends Produk{
  private boolean butuhAsuransi;


  public Elektronik(String nama, int hargaDasar, int qty, boolean butuhAsuransi) {
    super(nama, hargaDasar, qty);
    this.butuhAsuransi = butuhAsuransi;
  }

  @Override
  public int hitungSubTotal() {
    int total = super.hitungSubTotal();
    if (butuhAsuransi) {
      total += (50000 * qty);
    }
    return total;
  }

  public void cetakKartuGaransi() {
    System.out.println("  [Aksi] Mencetak kartu garansi resmi untuk " + this.nama + "...");
  }
}
