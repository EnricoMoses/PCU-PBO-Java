import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        ArrayList<Weapon> legendaryWeaponPool = new ArrayList<>();
        legendaryWeaponPool.add(new Weapon("Dragontooth (Red)", true, 3, 50));
        legendaryWeaponPool.add(new Weapon("Ballista (Blues)", true, 3, 45));
        legendaryWeaponPool.add(new Weapon("Candy Bomb (Bomb)", true, 3, 60));
        legendaryWeaponPool.add(new Weapon("Phoenix Sword (Chuck)", true, 3, 40));

        ArrayList<OffHand> legendaryOffHandPool = new ArrayList<>();
        legendaryOffHandPool.add(new OffHand("Dragonscale (Red)", true, 3, 100));
        legendaryOffHandPool.add(new OffHand("Ballista Bolts (Blues)", true, 3, 80));
        legendaryOffHandPool.add(new OffHand("Candy Chain (Bomb)", true, 3, 120));
        legendaryOffHandPool.add(new OffHand("Phoenix Feather (Chuck)", true, 3, 90));

        ArrayList<Weapon> commonWeaponPool = new ArrayList<>();
        commonWeaponPool.add(new Weapon("Wooden Sword", false, 1, 20));
        commonWeaponPool.add(new Weapon("Iron Mace", false, 2, 20));
        commonWeaponPool.add(new Weapon("Thunder Staff", false, 3, 20));
        commonWeaponPool.add(new Weapon("Bone Wand", false, 1, 20));
        commonWeaponPool.add(new Weapon("Slingshot", false, 2, 20));

        ArrayList<OffHand> commonOffHandPool = new ArrayList<>();
        commonOffHandPool.add(new OffHand("Wooden Shield", false, 1, 40));
        commonOffHandPool.add(new OffHand("Iron Buckler", false, 2, 40));
        commonOffHandPool.add(new OffHand("Feather Talisman", false, 3, 40));
        commonOffHandPool.add(new OffHand("Pork Amulet", false, 1, 40));
        commonOffHandPool.add(new OffHand("Stone Guard", false, 2, 40));

        GoldenPigMachine<Weapon> weaponGacha = new GoldenPigMachine<>(legendaryWeaponPool, commonWeaponPool);
        GoldenPigMachine<OffHand> offHandGacha = new GoldenPigMachine<>(legendaryOffHandPool, commonOffHandPool);
        Inventory<Equipment> inventory = new Inventory<>();

        RainbowBarMechanic rainbowBarMechanic = new RainbowBarMechanic() {
            int rainbowBar = 0;

            @Override
            public boolean isPityReached() {
                int angka = random.nextInt(100) + 1;
                if (rainbowBar >= 100 || angka <= 5) {
                    return true;
                } else
                    return false;
            }

            @Override
            public void updateBar(boolean gotLegendary) {
                if (gotLegendary) {
                    rainbowBar = 0;
                } else {
                    rainbowBar += 20;
                }
            }
        };

        int userInput = 0;
        while (userInput != 3) {
            System.out.println("\nGacha");
            System.out.println("[1] Roll");
            System.out.println("[2] Inventory");
            System.out.println("[3] Exit");
            System.out.print("Input: ");
            userInput = input.nextInt();
            input.nextLine();
            switch (userInput) {
                case 1:
                    int angka = random.nextInt(100) + 1;
                    if (angka <= 50) {
                        Weapon weapon = weaponGacha.rollItem(rainbowBarMechanic);
                        inventory.addItem(weapon);
                        System.out.println("You get: " + weapon.getName());
                        System.out.println("Pity reached: " + rainbowBarMechanic.isPityReached());
                    } else {
                        OffHand offHand = offHandGacha.rollItem(rainbowBarMechanic);
                        inventory.addItem(offHand);
                        System.out.println("You get: " + offHand.getName());
                        System.out.println("Pity reached: " + rainbowBarMechanic.isPityReached());
                    }
                    break;
                case 2:
                    System.out.println("Inventory");
                    System.out.println("[a] Urutkan berdasarkan nama");
                    System.out.println("[b] Urutkan berdasarkan stat tertinggi");
                    System.out.println("[c] Urutkan berdasarkan bintang terbanyak");
                    System.out.print("Input: ");
                    String choice = input.nextLine().toLowerCase();
                    switch (choice) {
                        case "a":
                            Comparator<Equipment> nameComparator = (a, b) -> a.getName().compareToIgnoreCase(b.getName());
                            inventory.display(nameComparator);
                            break;
                        case "b":
                            Comparator<Equipment> statComparator = (a, b) -> b.getMainStat() - a.getMainStat();
                            inventory.display(statComparator);
                            break;
                        case "c":
                            Comparator<Equipment> starComparator = (a, b) -> b.getStars() - a.getStars();
                            inventory.display(starComparator);
                            break;
                        default:
                    }
                    break;
                case 3:
                    System.out.println("Exit");
                    break;
                default:
            }
        }
    }
}
