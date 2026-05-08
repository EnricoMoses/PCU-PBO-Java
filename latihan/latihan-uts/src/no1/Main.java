package no1;

public class Main {
  public static void main(String[] args) {
    Tim timTalent = new Tim("Tim A", "talent show");

    Peserta p1 = new Peserta("nama_laki1", "prodi1", "laki-laki", 1, 1, 2000);
    Peserta p2 = new Peserta("nama_laki2", "prodi2", "laki-laki", 2, 2, 2001);

    Tanggal tglP3 = new Tanggal(3, 3, 2002);
    Peserta p3 = new Peserta("nama_perempuan1", "prodi3", "perempuan", tglP3);

    timTalent.tambahPeserta(p1);
    timTalent.tambahPeserta(p2);
    timTalent.tambahPeserta(p3);

    timTalent.printTim();

    // --- Contoh Lain (Tim Sport = 5 Orang, Campuran Gender) ---
    Tim timSport = new Tim("Tim B", "sport");

    // Menggunakan method input() untuk mengisi data
    Peserta p4 = new Peserta("", "", "", 0, 0, 0);
    p4.setInput("Budi", "Informatika", "laki-laki", 1, 1, 2000);

    Peserta p5 = new Peserta("", "", "", 0, 0, 0);
    p5.setInput("Siti", "Sistem Informasi", "perempuan", new Tanggal(2, 2, 2001));

    timSport.tambahPeserta(p4);
    timSport.tambahPeserta(p5);

    // Menampilkan Tim Sport (Hanya berisi 2 orang dari kapasitas 5)
    timSport.printTim();
  }
}
