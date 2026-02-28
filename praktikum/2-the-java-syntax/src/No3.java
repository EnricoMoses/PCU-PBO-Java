import java.util.Scanner;

public class No3 {
  public static int hitungLuas(int panjang, int lebar) {
      return panjang * lebar;
  }
  public static int hitungKeliling(int panjang, int lebar) {
    return 2 * (panjang + lebar);
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Panjang: ");
    int panjang = input.nextInt();

    System.out.print("Lebar: ");
    int lebar = input.nextInt();

    int luas = hitungLuas(panjang, lebar);
    int keliling = hitungKeliling(panjang, lebar);

    System.out.println("\nLuas: " + luas + " m2");
    System.out.println("Keliling: " + keliling + " m");
  }
}
