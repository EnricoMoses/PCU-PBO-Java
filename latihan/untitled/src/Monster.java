public class Monster implements Attackable{
  private String type;
  private int HP;

  public Monster(String type, int HP) {
    this.type = type;
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
