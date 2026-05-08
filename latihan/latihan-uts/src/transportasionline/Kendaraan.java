package transportasionline;

import java.util.ArrayList;
import java.util.Random;

public class Kendaraan {
  private int tahunProduksi;
  private int tarifPerKilometer;
  private int biayaTambahan;
  private int jarak;

  public Kendaraan(int tarifPerKilometer, int biayaTambahan) {
    Random random = new Random();
    this.tahunProduksi = random.nextInt((2024 - 1991) + 1) + 1991;
    this.tarifPerKilometer = tarifPerKilometer;
    this.biayaTambahan = biayaTambahan;
  }

  public int getTahunProduksi() {
    return tahunProduksi;
  }

  public int getTarifPerKilometer() {
    return tarifPerKilometer;
  }

  public int getBiayaTambahan() {
    return biayaTambahan;
  }

  public int getJarak() {
    return jarak;
  }

  public void setJarak(int jarak) {
    this.jarak = jarak;
  }

  public int biayaPerjalanan() {
    return (this.tarifPerKilometer * this.jarak) + ((this.tahunProduksi - 1990) * this.biayaTambahan);
  }
}
