public class Hero extends Characters{

  private int attackPower;

  public Hero(String name, int level, int hp, int attackPower) {
    super(name, level, hp);
    this.attackPower = attackPower;
  }

  public void interact(NPC npc) {
    npc.startDialog();
  }

  public void attack(Attackable target) {
    target.takeDamage(attackPower);
  }

}
