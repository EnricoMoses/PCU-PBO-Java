package no1;

public class Peserta {
  String namaMahasiswa;
  String prodi;
  String jeniskelamin;
  Tanggal tanggalLahir; // implementasi composition

  public Peserta(String namaMahasiswa, String prodi, String jeniskelamin, Tanggal tanggalLahir) {
    this.namaMahasiswa = namaMahasiswa;
    this.prodi = prodi;
    this.jeniskelamin = jeniskelamin;
    this.tanggalLahir = tanggalLahir;
  }

  public Peserta(String namaMahasiswa, String prodi, String jeniskelamin, int hari, int bulan, int tahun) {
    this.namaMahasiswa = namaMahasiswa;
    this.prodi = prodi;
    this.jeniskelamin = jeniskelamin;
    this.tanggalLahir = new Tanggal(hari, bulan, tahun);
  }

  public void setInput(String namaMahasiswa, String prodi, String jeniskelamin, Tanggal tanggalLahir) {
    this.namaMahasiswa = namaMahasiswa;
    this.prodi = prodi;
    this.jeniskelamin = jeniskelamin;
    this.tanggalLahir = tanggalLahir;
  }

  public void setInput(String namaMahasiswa, String prodi, String jeniskelamin, int hari, int bulan, int tahun) {
    this.namaMahasiswa = namaMahasiswa;
    this.prodi = prodi;
    this.jeniskelamin = jeniskelamin;
    this.tanggalLahir = new Tanggal(hari, bulan, tahun);
  }

  public void printPeserta() {
    System.out.println("Nama Mahasiswa: " + namaMahasiswa);
    System.out.println("Prodi: " + prodi);
    System.out.println("Jenis Kelamin: " + jeniskelamin);
    System.out.println("Tanggal Lahir: " + tanggalLahir.getTanggal());
  }


}
