class AnggotaPerpus {
    private String nama;

    public AnggotaPerpus(String nama) {
        this.nama = nama;
    }

    public void pinjamBarang(PinjamInterface barang) {
        barang.dipinjam(this.nama);
    }

    public void kembalikanBarang(PinjamInterface barang) {
        barang.dikembalikan();
    }
}