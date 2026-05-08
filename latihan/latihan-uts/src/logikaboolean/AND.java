package logikaboolean;

public class AND extends OperasiLogika {
  public AND(boolean input1, boolean input2, boolean input3) {
    super(input1, input2, input3);
  }

  public AND() {
    this(false, false, false);
  }

  @Override
  public boolean hitung(boolean a, boolean b) {
    if (a == true && b == true) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public boolean hitung(boolean a, boolean b, boolean c) {
    if (a == true && b == true && c == true) {
      return true;
    } else {
      return false;
    }
  }
}
