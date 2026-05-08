package bisnisrental;

public class Motor extends Kendaraan {
  private int ccMesin;

  public int getCcMesin() {
    return ccMesin;
  }

  public void setCcMesin(int ccMesin) {
    this.ccMesin = ccMesin;
  }

  @Override
  public void dibersihkan() {
    super.dibersihkan();
    if (!super.isDisewa()) {
      System.out.println("Jok motor dipoles");
    }
  }

  @Override
  public String dataKendaraan() {
    return super.dataKendaraan() + ", CC Mesin: " + this.ccMesin;
  }
}
