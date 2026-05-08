public class Beetle extends Character {
  public Beetle() {
    super("Beetle", 50, 8);
  }

  public void ramping() {
    this.hp += 5;
    this.attack += 1;
    System.out.println(this.name + " grows stronger!");
  }
}
