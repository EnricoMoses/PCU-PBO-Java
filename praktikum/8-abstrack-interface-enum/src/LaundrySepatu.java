public class LaundrySepatu extends PaketLayanan implements Deliverable{
  private int jumlahPasang;
  private double hargaPerPasang;

  public LaundrySepatu(String namaPelanggan, TipeLayanan tipeLayanan, int jumlahPasang, double hargaPerPasang) {
    super(namaPelanggan, tipeLayanan);
    this.jumlahPasang = jumlahPasang;
    this.hargaPerPasang = hargaPerPasang;
  }

  @Override
  public double hitungTagihan() {
    return this.jumlahPasang * this.hargaPerPasang * this.tipeLayanan.getPengali();
  }

  @Override
  public void aturJadwalAntar() {
    System.out.println("Sepatu milik " + this.namaPelanggan + " siap dijemput oleh kurir mitra Alice Clean!");
  }
}
