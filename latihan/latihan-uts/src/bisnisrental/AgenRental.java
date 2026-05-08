package bisnisrental;

import java.util.ArrayList;

public class AgenRental {
  private String nama;
  private int komisi = 0;
  private ArrayList<Kendaraan> daftarKendaraan = new ArrayList<>();

  public AgenRental(String nama) {
    this.nama = nama;
  }

  public void addKendaraan(Kendaraan kendaraan) {
    daftarKendaraan.add(kendaraan);
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public void displayKendaraan() {
    for (int i = 0; i < daftarKendaraan.size(); i++) {
      System.out.println("index: " + i + ". " + daftarKendaraan.get(i).dataKendaraan());
    }
  }

  public void sewakanKendaraan(int index) {
    if (index >= 0 && index < daftarKendaraan.size()) {
      Kendaraan kendaraan = daftarKendaraan.get(index);
      if (!kendaraan.isDisewa()) {
        kendaraan.disewa();
        System.out.println("Kendaraan " + kendaraan.getNomorPlat() + " telah disewa.");
      } else {
        System.out.println("Kendaraan " + kendaraan.getNomorPlat() + " sudah disewa.");
      }
    } else {
      System.out.println("Index kendaraan tidak valid.");
    }
  }

  public void kembalikanKendaraan(int index, int hari) {
    if (index >= 0 && index < daftarKendaraan.size()) {
      Kendaraan kendaraan = daftarKendaraan.get(index);
      int totalBiaya = kendaraan.dikembalikan(hari);
      System.out.println("Kendaraan " + kendaraan.getNomorPlat() + " dikembalikan. Total biaya: Rp " + totalBiaya);
      komisi += totalBiaya * 5 / 100; // Agen mendapatkan 5% dari total biaya
    } else {
      System.out.println("Index kendaraan tidak valid.");
    }
  }

  public void bersihkanKendaraan() {
    for (Kendaraan kendaraan : daftarKendaraan) {
      kendaraan.dibersihkan();
    }
  }

  public void printKomisi() {
    System.out.println("Total komisi " + this.nama + ": Rp " + komisi);
  }
}
