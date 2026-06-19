public class Weapon extends Equipment {
    private int attackPower;

    public Weapon(String name, boolean isLegendary, int stars, int baseAttack) {
        super(name, isLegendary, stars);
        if (stars == 1) {
            this.attackPower = baseAttack;
        } else if (stars == 2) {
            this.attackPower = (int) (baseAttack * 1.5);
        } else if (stars == 3) {
            this.attackPower = baseAttack * 2;
        }
    }

    @Override
    public String getDescription() {
        return "Nama: " + this.getName() + ", Legendary: " + this.isLegendary() + ", Bintang: " + this.getStars() + ", Attack Power: " + this.attackPower;
    }
    @Override
    public int getMainStat() {
        return this.attackPower;
    }
}
