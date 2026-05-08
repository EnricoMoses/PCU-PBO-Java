public class Hero extends Character{

  protected int energy;
  protected int block;

  public Hero(String name, int hp, int attack) {
    super(name, hp, attack);
  }

  public void defend() {
    this.block += 5;
    System.out.println(this.name + " gains 5 block");
  }

  public void reduceDamage(int damage) {
    if (damage > this.block) {
      int remainingDamage = damage - this.block;
      this.block = 0;
      this.takeDamage(remainingDamage);
    } else {
      this.block -= damage;
      System.out.println(this.name + " blocked the attack! HP left" + this.hp);
    }
  }

  public void useSkill() {
//    Method kosong untuk di override di subclass
  }

  public int getEnergy() {
    return energy;
  }

  public int getBlock() {
    return block;
  }

  public void setBlock(int block) {
    this.block = block;
  }
}
