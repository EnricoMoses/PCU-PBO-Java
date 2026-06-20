class Komik extends BarangPerpus implements PinjamInterface {
    private int issueNumber;
    private boolean statusDipinjam;

    public Komik(String id, String judul, int tahun, int issueNumber) {
        super(id, judul, tahun);
        this.issueNumber = issueNumber;
        this.statusDipinjam = false;
    }

    @Override
    public void printBarang() {
        super.printBarang();
        System.out.println("Issue Number: " + issueNumber);
    }

    @Override
    public void printJenisBarang() {
        System.out.println("Jenis: Komik");
    }

    @Override
    public void dipinjam(String namaPeminjam) {
        if (bisaDipinjam()) {
            statusDipinjam = true;
            System.out.println("Komik " + judul + " sukses dipinjam oleh " + namaPeminjam);
        } else {
            System.out.println("Komik " + judul + " gagal dipinjam, karena sudah dipinjam.");
        }
    }

    @Override
    public void dikembalikan() {
        statusDipinjam = false;
        System.out.println("Komik " + judul + " telah dikembalikan");
    }

    @Override
    public boolean bisaDipinjam() {
        return !statusDipinjam;
    }
}