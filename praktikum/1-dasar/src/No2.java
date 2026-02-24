import java.util.Scanner;

public class No2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Nama : ");
    String nama = sc.nextLine();

    System.out.print("Tanggal: ");
    int tanggal = sc.nextInt();

    System.out.print("Bulan: ");
    int bulan = sc.nextInt();

    System.out.print("Tahun: ");
    int tahun = sc.nextInt();

    int tahunSekarang = 2026;
    int usia = tahunSekarang - tahun;

//    Menghitung index kelahiran
    int index = ((tanggal * bulan) + (tahun % 100)) - (tanggal / 2);

    System.out.println();
    System.out.println("Nama : " + nama);
    System.out.println("Usia : " + usia);
    System.out.println("Index : " + index);

    sc.close();
  }
}
