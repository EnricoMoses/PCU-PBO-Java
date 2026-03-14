package No1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int energy = 0;

//    musuh
    ArrayList<Pokemon> enemies = new ArrayList<>();
    enemies.add(new Pokemon("Charizard", 75, 20, 0, 0));
    enemies.add(new Pokemon("Blastoise", 90, 18, 0, 0));
    enemies.add(new Pokemon("Venusaur", 80, 17, 0, 0));

    ArrayList<Pokemon> playerTeam = new ArrayList<>();
    playerTeam.add(new Pokemon("Pikachu", 70, 25, 2, 30));
    playerTeam.add(new Pokemon("Snorlax", 100, 10, 5, 80));
    playerTeam.add(new Pokemon("Dragonite", 90, 18, 4, 65));
    playerTeam.add(new Pokemon("Glaceon", 80, 20, 3, 45));
    playerTeam.add(new Pokemon("Sylveon", 65, 17, 6, 100));

    System.out.println("=== Player Team ===");
    for (int i = 0; i < playerTeam.size(); i++) {
      System.out.print((i+1) + ". ");
      playerTeam.get(i).printInfo();
    }

//    Select 3
    ArrayList<Pokemon> battleTeam = new ArrayList<>();

    System.out.println("\nSelect 3 from your Player Team...");
    System.out.print("Selected: ");
    for (int i = 0; i < 3; i++) {
      int pick = input.nextInt();
      battleTeam.add(new Pokemon(playerTeam.get(pick - 1)));
    }

    System.out.println("\nBattle!");

//    battle loop
    while (true) {

      System.out.println("\n=== Battle Team ===");
      for (int i = 0; i < battleTeam.size(); i++) {
        System.out.print((i+1) + ". ");
        if (battleTeam.get(i).isAlive())
          battleTeam.get(i).printInfo();
        else System.out.println("Defeated");
      }

      System.out.println("\n=== Enemies ===");
      for (int i = 0; i < enemies.size(); i++) {
        System.out.print((i+1) + ". ");
        if (enemies.get(i).isAlive())
          enemies.get(i).printInfo();
        else System.out.println("Defeated");
      }

      System.out.println("\nEnergy: " + energy);

//      Select pokemon
      System.out.print("Select Pokemon: ");
      int p = input.nextInt() -1;

      if(!battleTeam.get(p).isAlive()){
        System.out.println("Pokemon defeated!");
        continue;
      }

//      select target
      System.out.print("Select Target: ");
      int t = input.nextInt() - 1;

      if(!enemies.get(t).isAlive()){
        System.out.println("Enemy already defeated!");
        continue;
      }

      System.out.println("\n=== Choose Action ===");
      System.out.println("1. Attack");
      System.out.println("2. Skill");

      System.out.print("Action: ");
      int action = input.nextInt();

      if (action == 1) {
        battleTeam.get(p).attack(enemies.get(t));
        energy += 2;
        if (energy > 10) energy = 10;
      } else if (action == 2) {
        if (energy >= battleTeam.get(p).getSkillCost()) {
          battleTeam.get(p).useSkill(enemies.get(t));
          energy -= battleTeam.get(p).getSkillCost();
        } else {
          System.out.println("Not enough energy!");
          continue;
        }
      }

//      check player win
      boolean enemiesDead = true;
      for (Pokemon e : enemies) {
        if (e.isAlive()) {
          enemiesDead = false;
          break;
        }
      }

      if (enemiesDead) {
        System.out.println("\nYou win!");
        break;
      }

      Pokemon enemy = null;
      for (Pokemon e : enemies) {
        if (e.isAlive()) {
          enemy = e;
          break;
        }
      }

      Pokemon ally = null;
      for (Pokemon b : battleTeam) {
        if (b.isAlive()) {
          ally = b;
          break;
        }
      }

      if (enemy != null && ally != null) {
        enemy.attack(ally);
      }

//      check lose
      boolean teamDead = true;
      for (Pokemon b : battleTeam) {
        if(b.isAlive()) {
          teamDead = false;
          break;
        }
      }

      if (teamDead) {
        System.out.println("\nYou lose!");
        break;
      }
    }

//    Result
    System.out.println("\n=== Battle Team ===");
    for (int i = 0; i < battleTeam.size(); i++) {
      System.out.print((i+1) + ". ");
      battleTeam.get(i).printInfo();
    }

    System.out.println("=== Player Team ===");
    for (int i = 0; i < playerTeam.size(); i++) {
      System.out.print((i+1) + ". ");
      playerTeam.get(i).printInfo();
    }

    System.out.println("\nTotal skill cast: " + Pokemon.getTotalSkillCast());
  }
}
