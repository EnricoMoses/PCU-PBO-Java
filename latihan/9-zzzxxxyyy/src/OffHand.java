public class OffHand extends Equipment {
    private int healthBonus;

    public OffHand(String name, boolean isLegendary, int stars, int baseHealth) {
        super(name, isLegendary, stars);
        if (stars == 1) {
            this.healthBonus = baseHealth;
        } else if (stars == 2) {
            this.healthBonus = (int) (baseHealth * 1.5);
        } else if (stars == 3) {
            this.healthBonus = baseHealth * 2;
        }
    }

    @Override
    public String getDescription() {
        return "Nama: " + this.getName() + ", Legendary: " + this.isLegendary() + ", Bintang: " + this.getStars() + ", Health Bonus: " + this.healthBonus;
    }
    @Override
    public int getMainStat() {
        return this.healthBonus;
    }
}
