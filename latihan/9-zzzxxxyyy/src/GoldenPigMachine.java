import java.util.ArrayList;
import java.util.Random;

public class GoldenPigMachine<T extends Equipment> {
    private ArrayList<T> legendaryPool;
    private ArrayList<T> commonPool;

    public GoldenPigMachine(ArrayList<T> legendaryPool, ArrayList<T> commonPool) {
        this.legendaryPool = legendaryPool;
        this.commonPool = commonPool;
    }

    public T rollItem(RainbowBarMechanic mechanic) {
        Random random = new Random();
        if (mechanic.isPityReached()) {
            int angka = random.nextInt(legendaryPool.size());
            mechanic.updateBar(true);
            return legendaryPool.get(angka);
        } else {
            int angka = random.nextInt(commonPool.size());
            mechanic.updateBar(false);
            return commonPool.get(angka);
        }
    }
}
