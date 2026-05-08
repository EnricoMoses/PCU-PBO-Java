package transportasionline;

public class PriorityCar extends Kendaraan {
  public PriorityCar() {
    super(5000, 1000);
  }

  public String getPriorityLevel() {
    return "Platinum Member";
  }
}
