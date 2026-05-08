package bisnisrental;

public class Kendaraan {
  private String nomorPlat;
  private String warna;
  private boolean disewa = false;
  private int hargaSewa;
  private int lamaSewaDalamHari;

  public String getNomorPlat() {
    return nomorPlat;
  }

  public void setNomorPlat(String nomorPlat) {
    this.nomorPlat = nomorPlat;
  }

  public String getWarna() {
    return warna;
  }

  public void setWarna(String warna) {
    this.warna = warna;
  }

  public int getHargaSewa() {
    return hargaSewa;
  }

  public void setHargaSewa(int hargaSewa) {
    this.hargaSewa = hargaSewa;
  }

  public boolean isDisewa() {
    return disewa;
  }

  public int getLamaSewaDalamHari() {
    return lamaSewaDalamHari;
  }

  public void disewa() {
    if (!disewa) {
      lamaSewaDalamHari = 0;
      disewa = true;
    }
  }

  public int dikembalikan(int hari) {
    if (disewa) {
      lamaSewaDalamHari = hari;
      disewa = false;
      return lamaSewaDalamHari * hargaSewa;
    }
    return 0;
  }

  public void dibersihkan() {
    if (!disewa) {
      System.out.println("Kendaraan " + this.nomorPlat + " dicuci dan dibersihkan");
    }
  }

  public String dataKendaraan() {
    return "Nomor Plat: " + this.nomorPlat + ", Warna: " + this.warna + ", Disewa: " + this.disewa + ", Harga Sewa: " + this.hargaSewa;
  }

}
