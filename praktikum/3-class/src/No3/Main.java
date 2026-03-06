package No3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList<Buah> daftarBuah = new ArrayList<>();

    Buah apel = new Buah();
    apel.nama = "Apel";
    apel.harga = 10000;
    apel.stok = 3;

    Buah jeruk = new Buah();
    jeruk.nama = "Jeruk";
    jeruk.harga = 8000;
    jeruk.stok = 5;

    Buah pisang = new Buah();
    pisang.nama = "Pisang";
    pisang.harga = 15000;
    pisang.stok = 2;

    daftarBuah.add(apel);
    daftarBuah.add(jeruk);
    daftarBuah.add(pisang);

    int totalBelanja = 0;
    boolean jalan = true;

    while (jalan) {
      System.out.println("\n=== SUPERMARKET ===");
      System.out.println("1. Lihat daftar buah");
      System.out.println("2. Beli buah");
      System.out.println("3. Checkout");
      System.out.print("Input: ");

      int pilihan = input.nextInt();

      if (pilihan == 1) {
        System.out.println("\n===Daftar Buah ===");

        for (Buah b : daftarBuah) {
          b.tampilInfo();
        }
      } else if (pilihan == 2) {
        System.out.println("\n=== Beli Buah ===");
        for (int i = 0; i < daftarBuah.size(); i++) {
          System.out.print((i + 1) + ". ");
          daftarBuah.get(i).tampilInfo();
        }

        System.out.print("Buah yang dipilih: ");
        int pilih = input.nextInt() - 1;

        System.out.print("Buah yang beli: ");
        int jumlah = input.nextInt();

        Buah buahDipilih = daftarBuah.get(pilih);

        if (buahDipilih.stokCukup(jumlah)) {
          buahDipilih.kurangiStok(jumlah);
          int harga = buahDipilih.hitungHarga(jumlah);
          totalBelanja = totalBelanja + harga;
          System.out.println("Pembelihan berhasil");
        } else {
          System.out.println("Stok tidak cukup!");
        }
      } else if (pilihan == 3) {
        System.out.println("\n=== Checkout ===");
        System.out.println("Total Harga: " + totalBelanja);

        System.out.println("\n=== Sisa Buah ===");

        for (Buah b : daftarBuah) {
          b.tampilInfo();
        }

        jalan = false;
      }
    }
  }
}
