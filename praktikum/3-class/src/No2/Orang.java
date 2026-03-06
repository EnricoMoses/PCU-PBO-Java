package No2;

public class Orang {
  String nama;
  int kesabaran;
  String emosi;

  void turunKesabaran(int nilai) {
    kesabaran -= nilai;
    if (kesabaran < 0) {
      kesabaran = 0;
    }
  }

  void naikKesabaran(int nilai) {
    kesabaran += nilai;
    if (kesabaran > 100) {
      kesabaran = 100;
    }
  }

  void updateEmosi() {
    if (kesabaran >= 70) {
      emosi = "Santai";
    } else if (kesabaran >= 40) {
      emosi = "Mulai Emosi";
    } else {
      emosi = "Emosi Tidak Stabil";
    }
  }

  void infoStatus() {
    System.out.println("Nama : " + nama + " Kesabaran : " + kesabaran + " Emosi     : " + emosi);
  }
}
