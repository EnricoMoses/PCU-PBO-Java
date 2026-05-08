public class Character {
  protected String name;
  protected int hp;
  protected int attack;

  public Character(String name, int hp, int attack) {
    this.name = name;
    this.hp = hp;
    this.attack = attack;
  }

  public boolean is_Alive() {
      return this.hp > 0;
  }

  public void takeDamage(int damage) {
    this.hp -= damage;
    if (this.hp < 0) {
      this.hp = 0;
    }
    System.out.println(this.name + " HP left " + this.hp);
  }

  public void attack(Character target) {
    System.out.println(this.name + " attacks " + target.getName() + " for " + this.attack + " damage");
  }

  public String getName() {
    return this.name;
  }

//  public void setName(String name) {
//    this.name = name;
//  }

  public int getHp() {
    return this.hp;
  }

//  public void setHp(int hp) {
//    this.hp = hp;
//  }

  public int getAttack() {
    return this.attack;
  }

//  public void setAttack(int attack) {
//    this.attack = attack;
//  }
}
