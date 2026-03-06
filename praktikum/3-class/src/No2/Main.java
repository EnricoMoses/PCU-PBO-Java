package No2;

public class Main {
  public static void main(String[] args) {
    Orang[] orang = new Orang[4];

    for (int i = 0; i < orang.length; i++) {
      orang[i] = new Orang();
    }
    orang[0].nama = "Linea";
    orang[0].kesabaran = 95;
    orang[1].nama = "Lumi";
    orang[1].kesabaran = 70;
    orang[2].nama = "Luna";
    orang[2].kesabaran = 80;
    orang[3].nama = "Lisa";
    orang[3].kesabaran = 85;

    System.out.println("Status Awal :");
    for (int i = 0; i < orang.length; i++) {
      orang[i].updateEmosi();
      orang[i].infoStatus();
    }

    int[] pelakuTidakKerja = {2, 3, -1, 1, 0};
    int[] pelakuMenolong = {0, -1, 2, 3, -1};

    for (int hari = 0; hari < 5; hari++) {
      for (int i = 0; i < orang.length; i++) {
        if (i == pelakuTidakKerja[hari]) {
          orang[i].turunKesabaran(15);
        } else if (i == pelakuMenolong[hari]) {
          orang[i].naikKesabaran(10);
        } else {
          orang[i].turunKesabaran(5);
        }

        orang[i].updateEmosi();
      }
    }

    System.out.println("\nStatus Akhir Setelah 5 hari: ");
    for (int i = 0; i < orang.length; i++) {
      orang[i].infoStatus();
    }
  }
}
