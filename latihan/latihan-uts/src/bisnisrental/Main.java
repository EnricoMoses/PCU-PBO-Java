package bisnisrental;

public class Main {
  public static void main(String[] args) {
    System.out.println("====== INISIALISASI AGEN & KENDARAAN ======");

    // 1. Membuat 2 Agen
    AgenRental agenJono = new AgenRental("Jono");
    AgenRental agenJoni = new AgenRental("Joni");

    // 2. Membuat Kendaraan untuk Jono (1 Mobil, 1 Motor)
    Mobil mobilJono = new Mobil();
    mobilJono.setNomorPlat("L 1234 JO");
    mobilJono.setWarna("Hitam");
    mobilJono.setHargaSewa(300000);
    mobilJono.setJumlahKursi(7);

    Motor motorJono = new Motor();
    motorJono.setNomorPlat("L 5678 NO");
    motorJono.setWarna("Merah");
    motorJono.setHargaSewa(75000);
    motorJono.setCcMesin(150);

    agenJono.addKendaraan(mobilJono);
    agenJono.addKendaraan(motorJono);

    // 3. Membuat Kendaraan untuk Joni (1 Mobil, 2 Motor)
    Mobil mobilJoni = new Mobil();
    mobilJoni.setNomorPlat("B 9999 JI");
    mobilJoni.setWarna("Putih");
    mobilJoni.setHargaSewa(500000);
    mobilJoni.setJumlahKursi(5);

    Motor motorJoni1 = new Motor();
    motorJoni1.setNomorPlat("B 1111 NI");
    motorJoni1.setWarna("Biru");
    motorJoni1.setHargaSewa(100000);
    motorJoni1.setCcMesin(250);

    Motor motorJoni2 = new Motor();
    motorJoni2.setNomorPlat("B 2222 NA");
    motorJoni2.setWarna("Kuning");
    motorJoni2.setHargaSewa(50000);
    motorJoni2.setCcMesin(110);

    agenJoni.addKendaraan(mobilJoni);
    agenJoni.addKendaraan(motorJoni1);
    agenJoni.addKendaraan(motorJoni2);

    // --- DEMO DIMULAI ---

    System.out.println("\n====== TAMPILAN DAFTAR KENDARAAN ======");
    agenJono.displayKendaraan();
    System.out.println();
    agenJoni.displayKendaraan();

    System.out.println("\n====== PROSES SEWA ======");
    // Jono menyewakan Mobilnya (Index 0)
    System.out.println("[Agen Jono]");
    agenJono.sewakanKendaraan(0);

    // Joni menyewakan kedua Motornya (Index 1 dan 2)
    System.out.println("\n[Agen Joni]");
    agenJoni.sewakanKendaraan(1);
    agenJoni.sewakanKendaraan(2);

    System.out.println("\n====== PROSES PEMBERSIHAN (SAAT ADA YG DISEWA) ======");
    // Kendaraan yang sedang disewa tidak boleh dibersihkan
    agenJono.bersihkanKendaraan(); // Harusnya hanya motor Jono yang dibersihkan
    System.out.println();
    agenJoni.bersihkanKendaraan(); // Harusnya hanya mobil Joni yang dibersihkan

    System.out.println("\n====== PROSES PENGEMBALIAN ======");
    System.out.println("[Agen Jono]");
    // Mobil Jono dikembalikan setelah 2 hari (2 * 300.000 = 600.000)
    agenJono.kembalikanKendaraan(0, 2);

    System.out.println("\n[Agen Joni]");
    // Motor 1 Joni dikembalikan setelah 1 hari (1 * 100.000 = 100.000)
    agenJoni.kembalikanKendaraan(1, 1);
    // Motor 2 Joni dikembalikan setelah 3 hari (3 * 50.000 = 150.000)
    agenJoni.kembalikanKendaraan(2, 3);

    System.out.println("\n====== PROSES PEMBERSIHAN SETELAH KEMBALI ======");
    // Sekarang semua kendaraan sudah kembali, jadi semuanya harusnya dibersihkan
    agenJono.bersihkanKendaraan();
    System.out.println();
    agenJoni.bersihkanKendaraan();

    System.out.println("\n====== TOTAL KOMISI AGEN ======");
    // Jono: 5% dari 600.000 = 30.000
    agenJono.printKomisi();
    // Joni: 5% dari (100.000 + 150.000 = 250.000) = 12.500
    agenJoni.printKomisi();
  }
}