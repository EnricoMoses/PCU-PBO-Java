public class Animals implements Attackable {
  private String species;
  private int HP;

  public Animals(String species, int HP) {
    this.species = species;
    this.HP = HP;
  }

  @Override
  public void takeDamage(int damage) {
    this.HP -= damage;
  }

  @Override
  public boolean isAlive() {
    if (this.HP > 0) {
      return true;
    }
    return false;
  }
}
