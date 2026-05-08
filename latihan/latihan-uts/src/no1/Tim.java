package no1;

public class Tim {
  String namaTim;
  String jenisLomba;
  Peserta[] daftarPeserta; // implementasi aggregation
  int jumlahPesertaSaatIni;
  int maxPeserta;

  public Tim(String namaTim, String jenisLomba) {
    this.namaTim = namaTim;
    this.jenisLomba = jenisLomba;
    this.jumlahPesertaSaatIni = 0;

    if (jenisLomba.equals("sport")) {
      this.maxPeserta = 5;
    } else if (jenisLomba.equals("talent show")) {
      this.maxPeserta = 3;
    } else {
      this.maxPeserta = 0; // jenis lomba tidak valid
    }

    this.daftarPeserta = new Peserta[maxPeserta];
  }

  public void tambahPeserta(Peserta p) {
    if (jumlahPesertaSaatIni < maxPeserta) {
      daftarPeserta[jumlahPesertaSaatIni] = p;
      jumlahPesertaSaatIni++;
    } else {
      System.out.println("Tim " + namaTim + " sudah penuh. Tidak bisa menambahkan peserta lagi.");
    }
  }

  public void printTim() {
    System.out.println("Nama Tim: " + namaTim);
    System.out.println("Jenis Lomba: " + jenisLomba);
    System.out.println("------Tampilkan Semua Peserta------");

    int jumlahLakiLaki = 0;
    int jumlahPerempuan = 0;

    for (int i = 0; i < jumlahPesertaSaatIni; i++) {
      daftarPeserta[i].printPeserta();

      if (daftarPeserta[i].jeniskelamin.equals("laki-laki")) {
        jumlahLakiLaki++;
      } else if (daftarPeserta[i].jeniskelamin.equals("perempuan")) {
        jumlahPerempuan++;
      }


      // Memberikan jarak antar peserta (opsional)
      if (i < jumlahPesertaSaatIni - 1) {
        System.out.println();
      }
    }

    System.out.println("----setelah semua peserta ditampilkan----");
    System.out.println("Jumlah Peserta Laki-laki: " + jumlahLakiLaki);
    System.out.println("Jumlah Peserta Perempuan: " + jumlahPerempuan);
    System.out.println();


  }

}
