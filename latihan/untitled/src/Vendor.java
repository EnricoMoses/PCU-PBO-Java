public class Vendor extends NPC{
  private String shopName;

  public Vendor(String name, int level, int hp, String shopName) {
    super(name, level, hp);
    this.shopName = shopName;
  }

  @Override
  public void startDialog() {
    openShop();
  }

  private void openShop() {
    System.out.println("Selamat datang di toko" + shopName + "!");
  }
}
