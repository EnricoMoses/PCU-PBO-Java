package transportasionline;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList<Kendaraan> riwayatPemesanan = new ArrayList<>();

    while (true) {
      System.out.println("=== MENU ===");
      System.out.println("1. Motorcycle");
      System.out.println("2. Car 4 Seat");
      System.out.println("3. Car 6 Seat");
      System.out.println("4. Priority Car");
      System.out.println("5. Lihat Riyawat Pemesanan");
      System.out.println("0. Keluar");
      System.out.println();

      System.out.print("Masukkan pilihan: ");
      int pilihan = input.nextInt();

      if (pilihan == 0) {
        System.out.println("Terima kasih telah menggunakan layanan kami!");
        break;
      }

      if (pilihan == 5) {
        System.out.println("Riwayat pemesanan Anda: ");
        for (int i = 0; i < riwayatPemesanan.size(); i++) {
          Kendaraan k = riwayatPemesanan.get(i);
          String namaClass = k.getClass().getSimpleName(); // dapatkan nama class nya

          System.out.println((i + 1) + ". " + namaClass + ", jarak perjalanan " + k.getJarak() + " Km, total biaya: " + k.biayaPerjalanan() + ".");

//          ngecek tipe asli objek sebelum downcasting
          if (k instanceof Motorcycle) {
            Motorcycle m = (Motorcycle) k;
            System.out.println("  Fitur : " + m.getHelmetBrand());
          } else if (k instanceof Car4Seat) {
            System.out.println("  Fitur : " + ((Car4Seat) k).getSeatBrand());
          } else if (k instanceof Car6Seat) {
            System.out.println("  Fitur : " + ((Car6Seat) k).getTrunkCapacity());
          } else if (k instanceof PriorityCar) {
            System.out.println("  Fitur : " + ((PriorityCar) k).getPriorityLevel());
          }
        }
        System.out.println();
        continue; // kembali ke menu awal
      }

      Kendaraan kendaraan = null;

      if (pilihan == 1) {
        kendaraan = new Motorcycle();
      } else if (pilihan == 2) {
        kendaraan = new Car4Seat();
      } else if (pilihan == 3) {
        kendaraan = new Car6Seat();
      } else if (pilihan == 4) {
        kendaraan = new PriorityCar();
      } else {
        System.out.println("Pilihan tidak valid. Silakan coba lagi.\n");
        continue;
      }

      System.out.print("Masukkan jarak perjalanan (km): ");
      int jarak = input.nextInt();

      kendaraan.setJarak(jarak);
      riwayatPemesanan.add(kendaraan);

      System.out.println("Tahun Kendaraan " + kendaraan.getTahunProduksi());
      System.out.println("Total Biaya: (" + jarak + " * " + kendaraan.getTarifPerKilometer() + ") + (( " + kendaraan.getTahunProduksi() + " - 1990)" + " * " + kendaraan.getBiayaTambahan() + ") = " + kendaraan.biayaPerjalanan());
      System.out.println();
    }
  }
}
