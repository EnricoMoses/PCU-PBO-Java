public abstract class Equipment {
    private String name;
    private boolean isLegendary;
    private int stars;

    public Equipment(String name, boolean isLegendary, int stars) {
        this.name = name;
        this.isLegendary = isLegendary;
        this.stars = stars;
    }

    public abstract String getDescription();

    public abstract int getMainStat();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLegendary() {
        return isLegendary;
    }

    public void setLegendary(boolean legendary) {
        isLegendary = legendary;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
}
