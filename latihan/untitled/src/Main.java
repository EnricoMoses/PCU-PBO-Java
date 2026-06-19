//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {

    Hero hero = new Hero("James", 10, 100, 20);
    Vendor vendor = new Vendor("Billy", 5, 80, "TokoBaju");
    Civilan civilan = new Civilan("Jason", 7, 90, "aku npc");

    Animals animals = new Animals("mamalia", 88);
    Monster monster = new Monster("serem", 77);
    Boss boss = new Boss("finalboss", 88, "spesial");

    System.out.println(animals.isAlive());
    System.out.println(monster.isAlive());;
    System.out.println(boss.isAlive());

    hero.attack(animals);
    hero.attack(monster);
    hero.attack(boss);
//    hero.attack(vendor);
    hero.interact(vendor);
    hero.interact(civilan);

    System.out.println(animals.isAlive());
    System.out.println(monster.isAlive());
    System.out.println(boss.isAlive());
  }

}