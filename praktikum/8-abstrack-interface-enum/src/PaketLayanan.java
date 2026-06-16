abstract public class PaketLayanan {
  protected String namaPelanggan;
  protected TipeLayanan tipeLayanan;

  public PaketLayanan(String namaPelanggan, TipeLayanan tipeLayanan) {
    this.namaPelanggan = namaPelanggan;
    this.tipeLayanan = tipeLayanan;
  }

  public abstract double hitungTagihan();

  public void tampilkanPesanan() {
    System.out.println("Pesanan atas nama: " + this.namaPelanggan);
    System.out.println("Tipe Layanan: " + this.tipeLayanan);
  }
}
