public class Produk {
  protected String nama;
  protected int hargaDasar;
  protected int qty;

  public Produk(String nama, int hargaDasar, int qty) {
    this.nama = nama;
    this.hargaDasar = hargaDasar;
    this.qty = qty;
  }

  public int hitungSubTotal() {
    return hargaDasar * qty;
  }

  public String getNama() {
    return nama;
  }

  public int getQty() {
    return qty;
  }
}
