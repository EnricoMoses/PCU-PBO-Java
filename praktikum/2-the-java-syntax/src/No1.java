import java.util.Scanner;

public class No1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Jumlah Mhs: ");
    int jumlah = input.nextInt();
    input.nextLine(); // membersihkan newline

    double[] nilaiAkhir = new double[jumlah];

    System.out.println("\nInput Nilai");

    for (int i = 0; i < jumlah; i++) {
      System.out.println("\nNilai Mahasiswa ke-" + (i + 1));

      double uts = input.nextDouble();
      double uas = input.nextDouble();
      double test = input.nextDouble();
      double praktikum = input.nextDouble();

      nilaiAkhir[i] = (0.25 * uts) + (0.3 * uas) + (0.2 * test) + (0.25 * praktikum);
    }

    for (int i = 0; i < jumlah; i++) {
      System.out.println("\nMahasiswa ke-" + (i + 1));
      System.out.println("Nilai Akhir: " + nilaiAkhir[i]);

      char grade;

      if (nilaiAkhir[i] >= 85.5) {
        grade = 'A';
      } else if (nilaiAkhir[i] >= 68) {
        grade = 'B';
      } else if (nilaiAkhir[i] >= 55.5) {
        grade = 'C';
      } else {
        grade = 'D';
      }
      System.out.println("Grade: " + grade);
    }
  }
}
