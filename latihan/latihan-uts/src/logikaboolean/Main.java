package logikaboolean;

public class Main {
  public static void main(String[] args) {
    boolean input1 = true;
    boolean input2 = false;
    boolean input3 = true;

    OperasiLogika and = new AND();
    OperasiLogika or = new OR();
    NOT not = new NOT();

    OperasiLogika operasiLogika = new OperasiLogika(input1, input2, input3);
    System.out.println("=== Data Input ===");
    operasiLogika.tampil();
    System.out.println();

    boolean andDuaInput = and.hitung(input1, input2);
    boolean andTigaInput = and.hitung(input1, input2, input3);

    boolean orDuaInput = or.hitung(input1, input2);
    boolean orTigaInput = or.hitung(input1, input2, input3);

    boolean notSatuInput = not.hitung(input1);

    System.out.println("=== Hasil Operasi ===");
    System.out.println("AND (2 input): " + andDuaInput);
    System.out.println("AND (3 input): " + andTigaInput);
    System.out.println();

    System.out.println("OR (2 input): " + orDuaInput);
    System.out.println("OR (3 input): " + orTigaInput);
    System.out.println();

    System.out.println("NOT: " + notSatuInput);
    System.out.println();

    boolean[] data = {andDuaInput, andTigaInput, orDuaInput, orTigaInput, notSatuInput};
    int totalTrue = OperasiLogika.hitungTrue(data);
    System.out.println("Jumlah nilai true: " + totalTrue);
  }
}
