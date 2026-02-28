import java.util.ArrayList;
import java.util.Scanner;

public class No2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    ArrayList<String> daftarNama = new ArrayList<>();
    ArrayList<Integer> daftarWaktu = new ArrayList<>();

    while (true) {
      System.out.print("Nama: ");
      String nama = input.nextLine();

      if (nama.equals("END")) {
        break;
      }

      System.out.print("Estimasi Waktu: ");
      int waktu = input.nextInt();
      input.nextLine(); // membersihkan newline

      daftarNama.add(nama);
      daftarWaktu.add(waktu);

    }

    System.out.println("\n=== DAFTAR ANTRIAN TOILET ===");
    int totalWaktu = 0;
    int waktuTerbesar = 0;
    int indexTerbesar = 0;

    for (int i = 0; i < daftarNama.size(); i++) {
      System.out.println((i + 1) + ". " + daftarNama.get(i) + " (estimasi " + daftarWaktu.get(i) + " menit)");
      totalWaktu += daftarWaktu.get(i);

      if (daftarWaktu.get(i) > waktuTerbesar) {
        waktuTerbesar = daftarWaktu.get(i);
        indexTerbesar = i;
      }
    }

    System.out.println("\nTotal waktu penggunaan toilet: " + totalWaktu + " menit");
    if (!daftarNama.isEmpty()) {
      System.out.println("\nPengguna toilet terlama:");
      System.out.println(daftarNama.get(indexTerbesar) + ", " + waktuTerbesar + " menit");
    }
  }
}
