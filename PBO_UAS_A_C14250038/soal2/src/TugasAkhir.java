class TugasAkhir extends BarangPerpus {
    private String penulis;

    public TugasAkhir(String id, String judul, int tahun, String penulis) {
        super(id, judul, tahun);
        this.penulis = penulis;
    }

    @Override
    public void printBarang() {
        super.printBarang();
        System.out.println("Penulis: " + penulis);
    }

    @Override
    public void printJenisBarang() {
        System.out.println("Jenis: Tugas Akhir");
    }
}