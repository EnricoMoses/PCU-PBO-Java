public abstract class NPC extends Characters {


  public NPC(String name, int level, int hp) {
    super(name, level, hp);
  }

  public abstract void startDialog();
}
