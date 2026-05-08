package belajarfunction;

import java.util.Arrays;

public class BelajarParameter {

  // ---------------------------------------------------------
  // FUNGSI 1: Menerima tipe primitif (Pass the value / Salinan)
  // ---------------------------------------------------------
  public static void ubahAngka(int angkaKopian) {
    // Kita mencoba mengubah nilai yang masuk menjadi 100
    angkaKopian = 100;
    System.out.println("-> Di dalam fungsi ubahAngka, nilai diubah jadi: " + angkaKopian);
  }

  // ---------------------------------------------------------
  // FUNGSI 2: Menerima tipe Array (Pass the reference / Alamat)
  // ---------------------------------------------------------
  public static void ubahArray(int[] arrayAsli) {
    // Kita mencoba mengubah elemen pertama (indeks 0) menjadi 999
    arrayAsli[0] = 999;
    System.out.println("-> Di dalam fungsi ubahArray, elemen pertama diubah jadi: " + arrayAsli[0]);
  }

  // ================= MAIN PROGRAM ================= //
  public static void main(String[] args) {

    System.out.println("=== PERCOBAAN 1: TIPE PRIMITIF (int) ===");
    int uangSaya = 50;

    System.out.println("Sebelum fungsi dipanggil: uangSaya = " + uangSaya);

    // Memanggil fungsi (hanya mengirim 'fotokopi' nilainya)
    ubahAngka(uangSaya);

    // Cek lagi nilai aslinya setelah fungsi selesai
    System.out.println("Setelah fungsi dipanggil : uangSaya = " + uangSaya);
    System.out.println("**Kesimpulan 1:** Nilai asli TETAP AMAN (tidak berubah).\n");


    System.out.println("=== PERCOBAAN 2: TIPE ARRAY (int[]) ===");
    int[] rumahSaya = {10, 20, 30};

    System.out.println("Sebelum fungsi dipanggil: isi rumahSaya = " + Arrays.toString(rumahSaya));

    // Memanggil fungsi (mengirim 'alamat' array-nya)
    ubahArray(rumahSaya);

    // Cek lagi array aslinya setelah fungsi selesai
    System.out.println("Setelah fungsi dipanggil : isi rumahSaya = " + Arrays.toString(rumahSaya));
    System.out.println("**Kesimpulan 2:** Data asli IKUT BERUBAH karena fungsi mengakses alamat yang sama.");
  }
}