package No1;

public class Main {
  public static void main(String[] args) {
    Witch jessica = new Witch("Jessica", 20);

    Spell fireball = new Spell("Fireball", "Fire", 120);
    Spell frostSpike = new Spell("Frost Spike", "Ice", 100);
    Spell windBlade = new Spell("Wind Blade", "Wind", 90);

    jessica.learnSpell(fireball);
    jessica.learnSpell(frostSpike);

    Summon stoneGolem = new Summon("Stone Golem", "Golem", 50);
    Summon skeleton = new Summon("Skeleton", "Undead", 30);
    jessica.summonCreature("Spirit Wolf", "Spirit", 80);
    jessica.summonCreature(stoneGolem);

    jessica.castSpell("Frost Spike");
    frostSpike.setDamage(150);
    jessica.castSpell("Frost Spike");
    jessica.castSpell("Wind Blade");

    jessica.callSummon("Spirit Wolf").attack();
    jessica.callSummon("Skeleton");
    jessica.callSummon("Stone Golem").attack();
    stoneGolem.setDamage(70);
    jessica.callSummon("Stone Golem").attack();

  }
}
