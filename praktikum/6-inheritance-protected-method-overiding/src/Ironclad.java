public class Ironclad extends Hero {
  protected int strength;

  public Ironclad(String name, int hp, int attack) {
    super(name, hp, attack);
  }

  @Override
  public void attack(Character target) {
    int totalDamage = this.attack + this.strength;
    System.out.println(this.name + " attacks " + target.getName() + " for " + totalDamage + " damage");
    target.takeDamage(totalDamage);
  }

  @Override
  public void useSkill() {
    this.strength += 4;
    System.out.println("Ironclad uses ritual! Strength increased");
  }

//  Getter Setter
  public int getStrength() {
    return strength;
  }

  public void setStrength(int strength) {
    this.strength = strength;
  }

  public void setEnergy(int energy) {
    this.energy = energy;
  }
}
