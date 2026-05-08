package logikaboolean;

public class NOT extends OperasiLogika {
  public NOT(boolean input1, boolean input2, boolean input3) {
    super(input1, input2, input3);
  }

  public NOT() {
    this(false, false, false);
  }

  public boolean hitung(boolean a) {
    if (a == true) {
      return false;
    } else {
      return true;
    }
  }
}
