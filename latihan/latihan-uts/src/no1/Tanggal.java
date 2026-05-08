package no1;

public class Tanggal {
  int hari;
  int bulan;
  int tahun;

  public Tanggal(int hari, int bulan, int tahun) {
    this.hari = hari;
    this.bulan = bulan;
    this.tahun = tahun;
  }

  public String getTanggal() {
    return hari + "-" + bulan + "-" + tahun;
  }
}
