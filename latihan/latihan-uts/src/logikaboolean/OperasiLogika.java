package logikaboolean;

public class OperasiLogika {
  private boolean input1;
  private boolean input2;
  private boolean input3;

  public OperasiLogika(boolean input1, boolean input2, boolean input3) {
    this.input1 = input1;
    this.input2 = input2;
    this.input3 = input3;
  }

  public void tampil() {
    System.out.println("Input1: " + this.input1 + ", Input2: " + this.input2 + ", Input3: " + this.input3);
  }

  public boolean hitung(boolean a, boolean b) {
    return false;
  }

  public boolean hitung(boolean a, boolean b, boolean c) {
    return false;
  }

  public static int hitungTrue(boolean[] data) {
    int total = 0;
    for (boolean value : data) {
      if (value) {
        total++;
      }
    }
    return total;
  }
}
