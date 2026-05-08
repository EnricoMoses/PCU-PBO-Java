package No1;

import java.util.ArrayList;

public class Witch {
  private String name;
  private int age;
  private ArrayList<Spell> spellBook; // aggregation
  private ArrayList<Summon> summons; // composition

  public Witch(String name, int age) {
    this.name = name;
    this.age = age;
    this.spellBook = new ArrayList<>();
    this.summons = new ArrayList<>();
  }

  public void learnSpell(Spell spell) {
    spellBook.add(spell);
    System.out.println(name + " learns " + spell.getName());
  }

  public void castSpell(String spellName) {
    for (Spell spell: spellBook) {
      if (spell.getName().equals(spellName)) {
        System.out.println(name + " casts " + spell.getName() + ", dealing " + spell.getDamage() + " damage");
        return;
      }
    }
    System.out.println(spellName + " not found in spell book");
  }

  public void summonCreature(String name, String type, int damage) {
    Summon newSummon = new Summon(name, type, damage);
    summons.add(newSummon);
    System.out.println(this.name + " summons " + name);
  }

  public void summonCreature(Summon summon) {
    Summon copySummon = new Summon(summon); // copy construc
    summons.add(copySummon);
    System.out.println(name + " summons a copy of " + summon.getName());
  }

  public Summon callSummon(String summonName) {
    for (Summon summon: summons) {
      if (summon.getName().equals(summonName)) {
        System.out.println(name + " calls " + summon.getName());
        return summon;
      }
    }
    System.out.println(summonName + " not found in summons");
    return null;
  }
}
