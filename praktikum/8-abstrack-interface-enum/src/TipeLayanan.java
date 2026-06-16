public enum TipeLayanan {
  REGULER(1.0),
  EXPRESS(1.5),
  PREMIUM(2.0);

  private double pengali;

  TipeLayanan(double pengali) {
    this.pengali = pengali;
  }

  public double getPengali() {
    return this.pengali;
  }
}
