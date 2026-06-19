public abstract class Characters {
  private String name;
  private int level;
  private int hp;

  public Characters(String name, int level, int hp) {
    this.name = name;
    this.level = level;
    this.hp = hp;
  }

  public void printStatus() {
    System.out.println("nama: " + this.name);
    System.out.println("level: " + this.level);
    System.out.println("hp: " + this.hp);
  }
}
