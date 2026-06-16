//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    PaketLayanan[] daftarPesanan = {
      new LaundryKiloan("Budi", TipeLayanan.REGULER, 5, 7000),
      new LaundryKiloan("Citra", TipeLayanan.EXPRESS, 3, 7000),
      new LaundryPremium("Raka", TipeLayanan.PREMIUM, 4, 12000, true),
      new LaundryPremium("Dewi", TipeLayanan.REGULER, 2, 12000, false),
      new LaundrySepatu("Andi", TipeLayanan.EXPRESS, 2, 35000),
      new LaundrySepatu("James", TipeLayanan.PREMIUM, 1, 50000),
    };

    double grandTotal = 0;
    for (PaketLayanan pesanan : daftarPesanan) {
      pesanan.tampilkanPesanan();
      double tagihan = pesanan.hitungTagihan();
      System.out.println("Total Tagihan: Rp " + tagihan);
      grandTotal += tagihan;

      if (pesanan instanceof LaundryKiloan) {
        ((LaundryKiloan) pesanan).lacakStatus();
      }
      else if (pesanan instanceof LaundryPremium) {
        ((LaundryPremium) pesanan).lacakStatus();
        ((LaundryPremium) pesanan).aturJadwalAntar();
      }
      else if (pesanan instanceof LaundrySepatu) {
        ((LaundrySepatu) pesanan).aturJadwalAntar();
      }
      System.out.println();
    }

    System.out.println("Grand Total Semua Pesanan: Rp " + grandTotal);
  }
}