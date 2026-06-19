public class Boss extends Monster {
  private String specialSkill;

  public Boss(String type, int HP, String specialSkill) {
    super(type, HP);
    this.specialSkill = specialSkill;
  }

  @Override
  public void takeDamage(int damage) {
    super.takeDamage(damage);
    System.out.println("Balas dengan " + this.specialSkill);
  }

  @Override
  public boolean isAlive() {
    return super.isAlive();
  }
}
