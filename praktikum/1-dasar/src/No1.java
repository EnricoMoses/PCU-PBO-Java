import java.util.Scanner;

public class No1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

//    Input jari-jari
    System.out.print("Jari-jari: ");
    double r = sc.nextDouble();

//    Menghitung luas permukaan dan volume
    double luas = 4 * Math.PI * r * r;
    double volume = (4.0 / 3.0) * Math.PI * r * r * r;

    System.out.println("Luas : " + luas + " cm2");
    System.out.println("Volume : " + volume + " cm3");

    sc.close();
  }
}
