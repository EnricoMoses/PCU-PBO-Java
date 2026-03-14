package No1;

public class Pokemon {
  private String name;
  private int hp;
  private int atk;
  private int skillCost;
  private int skillDmg;
  private static int totalSkillCast = 0;

  public Pokemon(String name, int hp, int atk, int skillCost, int skillDmg) {
    this.name = name;
    this.hp = hp;
    this.atk = atk;
    this.skillCost = skillCost;
    this.skillDmg = skillDmg;
  }

  public Pokemon(Pokemon p) {
    this.name = p.name;
    this.hp = p.hp;
    this.atk = p.atk;
    this.skillCost = p.skillCost;
    this.skillDmg = p.skillDmg;
  }

  private void reduceHP(int damage) {
    hp -= damage;
    if (hp < 0) {
      hp = 0;
    }
  }

  public void attack(Pokemon target) {
    target.reduceHP(atk);
    System.out.println(name + " deals " + atk + " damage to " + target.name + " by Attack!");
  }

  public void useSkill(Pokemon target) {
    target.reduceHP(skillDmg);
    totalSkillCast++;
    System.out.println(name + " deals " + skillDmg + " damage to " + target.name + " by Skill!");
  }

  public boolean isAlive() {
    return hp > 0;
  }

  public void printInfo() {
    System.out.println(name + ", HP: " + hp + ", ATK: " + atk + ", Skill Cost: " + skillCost + ", Skill Dmg: " + skillDmg);
  }

//  public int getHp() {
//    return hp;
//  }

  public int getSkillCost() {
    return skillCost;
  }

  public static int getTotalSkillCast() {
    return totalSkillCast;
  }

//  public String getName() {
//    return name;
//  }
}
