public class LaundryPremium extends PaketLayanan implements Trackable, Deliverable{
  private double berat;
  private double hargaPerKg;
  private boolean isSetrika;

  public LaundryPremium(String namaPelanggan, TipeLayanan tipeLayanan, double berat, double hargaPerKg, boolean isSetrika) {
    super(namaPelanggan, tipeLayanan);
    this.berat = berat;
    this.hargaPerKg = hargaPerKg;
    this.isSetrika = isSetrika;
  }

  @Override
  public double hitungTagihan() {
    double tagihanAwal = this.berat * this.hargaPerKg * (this.tipeLayanan.getPengali() + 0.3);
    double biayaSetrika = isSetrika ? (this.berat + 5000) : 0;
    return tagihanAwal + biayaSetrika;
  }

  @Override
  public void lacakStatus() {
    System.out.println(this.namaPelanggan + " Pakaiann sedang dalam proses premium.");
  }

  @Override
  public void aturJadwalAntar() {
    System.out.println("Mengatur jadwal antar ke alamat pelanggan: " + this.namaPelanggan);
  }
}
