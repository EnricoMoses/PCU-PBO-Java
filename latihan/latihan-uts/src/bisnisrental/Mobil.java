package bisnisrental;

public class Mobil extends Kendaraan {
  private int jumlahKursi;

  public int getJumlahKursi() {
    return jumlahKursi;
  }

  public void setJumlahKursi(int jumlahKursi) {
    this.jumlahKursi = jumlahKursi;
  }

  @Override
  public void dibersihkan() {
    super.dibersihkan();
    if (!super.isDisewa()) {
      System.out.println("Karpet mobil dicuci");
      System.out.println("Kursi-kursi divacuum");
    }
  }

  @Override
  public String dataKendaraan() {
    return super.dataKendaraan() + ", Jumlah Kursi: " + this.jumlahKursi;
  }
}
