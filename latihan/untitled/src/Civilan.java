public class Civilan extends NPC {
  private String quest;

  public Civilan(String name, int level, int hp, String quest) {
    super(name, level, hp);
    this.quest = quest;
  }

  @Override
  public void startDialog() {
    giveQuest();
  }

  public void giveQuest() {
    System.out.println("Saya punya tugas  " + quest + " untukmu!");
  }
}
