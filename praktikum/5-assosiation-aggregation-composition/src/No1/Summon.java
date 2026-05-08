package No1;

public class Summon {
  private String name;
  private String type;
  private int damage;

  public Summon(String name, String type, int damage) {
    this.name = name;
    this.type = type;
    this.damage = damage;
  }

  public Summon(Summon s) {
    this.name = s.name;
    this.type = s.type;
    this.damage = s.damage;
  }

  public void attack() {
    System.out.println(name + " is attacking, dealing " + damage + " damage");
  }

  public String getName() {
    return name;
  }

//  public int getDamage() {
//    return damage;
//  }

  public void setDamage(int damage) {
    this.damage = damage;
  }
}

