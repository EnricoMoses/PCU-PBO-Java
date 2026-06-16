public class LaundryKiloan extends PaketLayanan implements Trackable {
  private double berat;
  private double hargaPerKg;

  public LaundryKiloan(String namaPelanggan, TipeLayanan tipeLayanan, double berat, double hargaPerKg) {
    super(namaPelanggan, tipeLayanan);
    this.berat = berat;
    this.hargaPerKg = hargaPerKg;
  }

  @Override
  public double hitungTagihan() {
    return this.berat * this.hargaPerKg * this.tipeLayanan.getPengali();
  }


  @Override
  public void lacakStatus() {
    System.out.println(this.namaPelanggan + " - Pakaian sedang dalam antrian mesin cuci.");
  }
}
