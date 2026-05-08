import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Ironclad hero = new Ironclad("Ironclad", 100, 2);
    Beetle enemy = new Beetle();
    while (hero.is_Alive() && enemy.is_Alive()) {


      System.out.println("\n=== NEW TURN ===");
      // RESET TURN
      hero.setEnergy(3);
      hero.setBlock(0);
      // PLAYER TURN
      while (hero.getEnergy() > 0 && enemy.is_Alive()) {
        System.out.println("\n--------------------------");
        System.out.println(hero.getName() +
                " [HP:" + hero.getHp() +
                " | ATK:" + (hero.getAttack() + hero.getStrength()) +
                " | BLOCK:" + hero.getBlock() +
                " | ENERGY:" + hero.getEnergy() + "]");


        System.out.println(enemy.getName() +
                " [HP:" + enemy.getHp() +
                " | ATK:" + enemy.getAttack() + "]");
        System.out.println("--------------------------");


        System.out.println("1. Attack (" + (hero.getAttack()+ hero.getStrength()) + ", 1 energy)");
        System.out.println("2. Defend (+5 block, 1 energy)");
        System.out.println("3. Skill (+4 strength, 2 energy)");


        int choice = sc.nextInt();


        if (choice == 1 && hero.getEnergy() >= 1) {
          hero.attack(enemy);
          hero.setEnergy(hero.getEnergy() - 1);


        } else if (choice == 2 && hero.getEnergy() >= 1) {
          hero.defend();
          hero.setEnergy(hero.getEnergy() - 1);


        } else if (choice == 3 && hero.getEnergy() >= 2) {
          hero.useSkill();
          hero.setEnergy(hero.getEnergy() - 2);


        } else {
          System.out.println("Not enough energy!");
        }
      }
      // ENEMY TURN
      if (enemy.is_Alive()) {
        System.out.println("\nEnemy turn!");
        hero.reduceDamage(enemy.getAttack());
        enemy.ramping();
      }


    }


// RESULT
    if (hero.is_Alive()) {
      System.out.println("\nWIN");
    } else {
      System.out.println("\nLOSE");
    }
  }
}