class Buku extends BarangPerpus implements PinjamInterface {
    private String pengarang;
    private boolean statusDipinjam;

    public Buku(String id, String judul, int tahun, String pengarang) {
        super(id, judul, tahun);
        this.pengarang = pengarang;
        this.statusDipinjam = false;
    }

//    public String getPengarang() { return pengarang; }
//    public void setPengarang(String pengarang) { this.pengarang = pengarang; }

    @Override
    public void printBarang() {
        super.printBarang();
        System.out.println("Pengarang: " + pengarang);
    }

    @Override
    public void printJenisBarang() {
        System.out.println("Jenis: Buku");
    }

    @Override
    public void dipinjam(String namaPeminjam) {
        if (bisaDipinjam()) {
            statusDipinjam = true;
            System.out.println("Buku " + judul + " sukses dipinjam oleh " + namaPeminjam);
        } else {
            System.out.println("Buku " + judul + " gagal dipinjam, karena sudah dipinjam.");
        }
    }

    @Override
    public void dikembalikan() {
        statusDipinjam = false;
        System.out.println("Buku " + judul + " telah dikembalikan");
    }

    @Override
    public boolean bisaDipinjam() {
        return !statusDipinjam;
    }
}