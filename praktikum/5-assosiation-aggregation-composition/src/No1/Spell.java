package No1;

public class Spell {
  private String name;
  private String element;
  private int damage;

  public Spell(String name, String element, int damage) {
    this.name = name;
    this.element = element;
    this.damage = damage;
  }

  public String getName() {
    return name;
  }

  public int getDamage() {
    return damage;
  }

  public void setDamage(int damage) {
    this.damage = damage;
  }
}
